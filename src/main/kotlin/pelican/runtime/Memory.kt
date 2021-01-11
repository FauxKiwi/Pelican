package pelican.runtime

import sun.misc.Unsafe

object Memory {
    private val UNSAFE: Unsafe
    init {
        val clazz = Unsafe::class.java
        val field = clazz.getDeclaredField("theUnsafe")
        field.trySetAccessible()
        UNSAFE = field.get(null) as Unsafe
    }

    fun allocate(size: Long) = Pointer<Unit>(UNSAFE.allocateMemory(size).also {
        UNSAFE.setMemory(it, size, 0)
    })

    /*
    fun set(ptr: Pointer<Int>, value: Int) = UNSAFE.put(ptr.address, value)
    fun get(ptr: Pointer<Int>): Int = UNSAFE.get(ptr.address)
    */

    fun setByte(ptr: Long, value: Byte) = UNSAFE.putByte(ptr, value)
    fun getByte(ptr: Long): Byte = UNSAFE.getByte(ptr)

    fun setShort(ptr: Long, value: Short) = UNSAFE.putShort(ptr, value)
    fun getShort(ptr: Long): Short = UNSAFE.getShort(ptr)

    fun setInt(ptr: Long, value: Int) = UNSAFE.putInt(ptr, value)
    fun getInt(ptr: Long): Int = UNSAFE.getInt(ptr)

    fun setLong(ptr: Long, value: Long) = UNSAFE.putLong(ptr, value)
    fun getLong(ptr: Long): Long = UNSAFE.getLong(ptr)

    fun setFloat(ptr: Long, value: Float) = UNSAFE.putFloat(ptr, value)
    fun getFloat(ptr: Long): Float = UNSAFE.getFloat(ptr)

    fun setDouble(ptr: Long, value: Double) = UNSAFE.putDouble(ptr, value)
    fun getDouble(ptr: Long): Double = UNSAFE.getDouble(ptr)

    fun setBoolean(ptr: Long, value: Boolean) = UNSAFE.putBoolean(null, ptr, value)
    fun getBoolean(ptr: Long): Boolean = UNSAFE.getBoolean(null, ptr)

    fun setChar(ptr: Long, value: Char) = UNSAFE.putChar(null, ptr, value)
    fun getChar(ptr: Long): Char = UNSAFE.getChar(null, ptr)
}

inline class Pointer<T>(val address: Long) {
    infix operator fun plus(offset: Long) = Pointer<T>(address + offset)
    infix operator fun minus(offset: Long) = Pointer<T>(address - offset)

    operator fun inc() = Pointer<T>(address + 1)
    operator fun dec() = Pointer<T>(address - 1)

    fun destructorCall() = Unit
}

/*
fun Pointer<Int>.set(i: Int) = Memory.set(this, i)
fun Pointer<Int>.get() = Memory.get(this)
*/

fun Pointer<Byte>.setPointedValue(b: Byte) = Memory.setByte(this.address, b)
fun Pointer<Byte>.getPointedValue() = Memory.getByte(this.address)

fun Pointer<Short>.setPointedValue(s: Short) = Memory.setShort(this.address, s)
fun Pointer<Short>.getPointedValue() = Memory.getShort(this.address)

fun Pointer<Int>.setPointedValue(i: Int) = Memory.setInt(this.address, i)
fun Pointer<Int>.getPointedValue() = Memory.getInt(this.address)

fun Pointer<Long>.setPointedValue(l: Long) = Memory.setLong(this.address, l)
fun Pointer<Long>.getPointedValue() = Memory.getLong(this.address)

fun Pointer<Float>.setPointedValue(f: Float) = Memory.setFloat(this.address, f)
fun Pointer<Float>.getPointedValue() = Memory.getFloat(this.address)

fun Pointer<Double>.setPointedValue(d: Double) = Memory.setDouble(this.address, d)
fun Pointer<Double>.getPointedValue() = Memory.getDouble(this.address)

fun Pointer<Boolean>.setPointedValue(b: Boolean) = Memory.setBoolean(this.address, b)
fun Pointer<Boolean>.getPointedValue() = Memory.getBoolean(this.address)

fun Pointer<Char>.setPointedValue(c: Char) = Memory.setChar(this.address, c)
fun Pointer<Char>.getPointedValue() = Memory.getChar(this.address)

fun <T> setSubPointer(pointer: Pointer<Pointer<T>>, value: Pointer<T>) = reinterpret_cast<Long>(pointer).setPointedValue(value.address)
fun <T> getSubPointer(pointer: Pointer<Pointer<T>>) = Pointer<T>(reinterpret_cast<Long>(pointer).getPointedValue())


fun <R> reinterpret_cast(ptr: Pointer<*>) = Pointer<R>(ptr.address)
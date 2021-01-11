package pelican.runtime

object MemoryStack {
    private var currentPointer: Long = Memory.allocate(1024L).address

    fun alloc(size: Int): Long = currentPointer.also { currentPointer += size }

    fun dealloc(size: Int) { currentPointer -= size }
}

val String.c_str: Pointer<Char> get() {
    var ptr = Pointer<Char>(MemoryStack.alloc(length * SIZEOF_Char))
    toCharArray().forEach {
        ptr.setPointedValue(it)
        ptr += SIZEOF_Char.toLong()
    }
    return ptr
}
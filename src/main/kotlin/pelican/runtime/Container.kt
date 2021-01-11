package pelican.runtime

inline class Point(val address: Long) {
    inline var x: Float
    get() = Memory.getFloat(address + offset_x)
    set(value) = Memory.setFloat(address + offset_x, value)

    inline var y: Float
    get() = Memory.getFloat(address + offset_y)
    set(value) = Memory.setFloat(address + offset_y, value)

    companion object {
        const val offset_x = 0
        const val offset_y = offset_x + SIZEOF_Float
        const val size = offset_y + SIZEOF_Float
    }
}
const val SIZEOF_Point = Point.size
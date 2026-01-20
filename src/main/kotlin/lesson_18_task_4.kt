abstract class Box {
    abstract fun getTheParcelSurfaceAre(): Int
}

class Rectangle(
    val length: Int,
    val width: Int,
    val height: Int,
) : Box() {
    override fun getTheParcelSurfaceAre(): Int {
        return 2 * (length * width + length * height + width * height)
    }
}

class Cube(
   val ribLength: Int,
) : Box() {
    override fun getTheParcelSurfaceAre(): Int {
        return 6 * ribLength * ribLength
    }
}
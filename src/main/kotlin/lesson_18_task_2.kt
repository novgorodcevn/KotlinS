open class Dice(
    private val sides: Int,
) {
    fun rollTheDice(): String {
        return "кубик брошен,число выпало:${(0..sides).random()}"
    }
}

class Tetrahedron(
    sides: Int = 4
) : Dice(sides)

class Hexagon(
    sides: Int = 6
) : Dice(sides)

class Octahedron(
    sides: Int = 8
) : Dice(sides)


fun main() {
    val tetrahedron: Dice = Tetrahedron()
    val hexagon: Dice = Hexagon()
    val octahedron: Dice = Octahedron()

    val arrayOfDice = arrayOf(tetrahedron, hexagon, octahedron)
    showAllDice(arrayOfDice)
}

fun showAllDice(dice: Array<Dice>) {
    dice.forEach {
        println(it.rollTheDice())
    }
}
open class Dice() {

    open fun rollTheDice() = ""
}

class Tetrahedron(
    private val sides: Int = 4
) : Dice() {
    override fun rollTheDice(): String {
        return "кубик брошен,число выпало:${(0..sides).random()}"
    }
}

class Hexagon(
    private val sides: Int = 6
) : Dice() {
    override fun rollTheDice(): String {
        return "кубик брошен,число выпало:${(0..sides).random()}"
    }
}

class Octahedron(
    private val sides: Int = 8
) : Dice() {
    override fun rollTheDice(): String {
        return "кубик брошен,число выпало:${(0..sides).random()}"
    }
}

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
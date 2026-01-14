open class Tamagotchi(
    val name: String,
) {
    fun sleep() = "$name -> спит"
    open fun eat() = ""
}

class Fox(name: String) : Tamagotchi(name) {
    override fun eat() = "$name -> ест ягоды"
}

class Dog(name: String) : Tamagotchi(name) {
    override fun eat() = "$name -> ест кости"
}

class Cat(name: String) : Tamagotchi(name) {
    override fun eat() = "$name -> ест рыбу"
}

fun main() {
    val fox: Tamagotchi = Fox(
        name = "Лиса"
    )
    val dog:Tamagotchi = Dog(
        name = "Собака"
    )
    val cat:Tamagotchi = Cat(
        name = "Кошка"
    )

    val arrayOfTamagotchi = listOf<Tamagotchi>(fox,dog,cat)
    showAllAnimal(arrayOfTamagotchi)
}

fun showAllAnimal(animal: List<Tamagotchi>){
    animal.forEach {
        println(it.eat())
    }
}
fun main() {

    for (i in Fish.entries) {
        println(i.title)
    }
}

enum class Fish(val title: String) {
    GUPPY("гуппи"),
    ANGELFISH("скалярия"),
    GOLDFISH("Золотая рыбка"),
    SIAMESE_FIGHTING_FISH("петушок")
}
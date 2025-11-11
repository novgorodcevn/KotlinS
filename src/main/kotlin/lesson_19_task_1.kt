fun main() {
   val setFish = listOf(Fish.GUPPY, Fish.SIAMESE_FIGHTING_FISH, Fish.GOLDFISH, Fish.ANGELFISH)
    for (i in setFish){
        println(i.title)
    }
}

enum class Fish(val title: String) {
    GUPPY("гуппи"),
    ANGELFISH("скалярия"),
    GOLDFISH("Золотая рыбка"),
    SIAMESE_FIGHTING_FISH("петушок")
}
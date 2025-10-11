class Category(
    val imageUrl: String,
    val id: Int,
    val title: String,
    val description: String,
    val recipes: MutableList<Recipe>
)

class Recipe(
    val id: Int,
    val imageUrl: String,
    val title: String,
    val description: String,
    val ingredients: MutableList<Ingredient>
)

class Ingredient(
    val id: Int,
    val name: String,
    val amount: Int,
    val unit: String,
)
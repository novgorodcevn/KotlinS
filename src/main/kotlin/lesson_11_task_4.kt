class Category(
    val imageUrl: String,
    val id: Int,
    val title: String,
    val description: String,
    val recipes: List<Recipe>
)

class Recipe(
    val id: Int,
    val imageUrl: String,
    val title: String,
    val description: String,
    val ingredients: List<Ingredient>,
    val cookingSteps: List<String>,
    )

class Ingredient(
    val id: Int,
    val name: String,
    val amount: String,
    val unit: String,
)
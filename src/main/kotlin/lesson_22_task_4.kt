class MainScreenViewModel {

    data class MainScreenState(
        val data: String = "",
        val isLoading: Boolean = false
    )

    private var mainScreenState = MainScreenState()

    fun loadData() {
        println(mainScreenState)
        mainScreenState = mainScreenState.copy(isLoading = true)
        println(mainScreenState)
        mainScreenState = mainScreenState.copy(data = "загруженные данные",isLoading = false)
        println(mainScreenState)
    }
}

fun main() {
    val mainScreenState = MainScreenViewModel()
    mainScreenState.loadData()
}
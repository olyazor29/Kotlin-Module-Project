
open class MenuLogic<T>(
    private val menuTitle: String,
    private val createNewItem: String,
    val createNew: () -> Unit,
    val selectSpecificItem: (Int) -> Unit,
    private val menuItems: MutableList<T> = mutableListOf()
){

    fun showMenuItems() {
        println(menuTitle)
        println("0. $createNewItem")
        for (i in 0..menuItems.lastIndex) {
            println("${i + 1}. ${menuItems[i]}")
        }
        println("${menuItems.size + 1}. Выход")
    }

    fun performTheAction() {
        val userChoice = InputProcessing().checkInputInRange(menuItems.size + 1)
        when (userChoice) {
            0 -> createNew()
            menuItems.size + 1 -> return
            else -> selectSpecificItem(userChoice)
        }
        this.showAndPerform()
    }

    fun showAndPerform() {
        showMenuItems()
        try {
            performTheAction()
        } catch (e: WrongInputException) {
            println(e.message)
            showAndPerform()
        }
    }
}
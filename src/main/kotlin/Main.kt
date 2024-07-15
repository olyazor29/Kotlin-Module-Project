import kotlin.system.exitProcess

fun main(args: Array<String>) {
    println("Добро пожаловать в приложение 'Заметки'!")
    val mainMenu = MenuArchives()
    mainMenu.showAndPerform()
    println("Спасибо за использование приложения 'Заметки'! До свидания!")
    exitProcess(0)
}
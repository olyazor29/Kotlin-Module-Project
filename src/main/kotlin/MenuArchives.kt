import AllArchives.archives

class MenuArchives : MenuLogic<Archive>(
    "Список архивов:",
    "Создать новый архив.",
    createNew = {
        println("Введите название нового архива:")
        val name = InputProcessing().createNewNameInput()
        archives.add(Archive(name))
        println("Архив '$name' создан!")
    },

    selectSpecificItem = { userInput ->
        val specificArchiveMenu = MenuNotes(archives[userInput - 1])
        specificArchiveMenu.showAndPerform()
    },
    menuItems = archives
)

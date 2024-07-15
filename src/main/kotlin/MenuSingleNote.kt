class MenuSingleNote(
    private val note: Note
) {
    fun openNote() {
        while (true) {
            println("Заметка '${note.name}'")
            println("0. Просмотреть содержание заметки")
            println("1. Выход")
            var input = -1
            try {
                input = InputProcessing().checkInputInRange(0)
            } catch (e: WrongInputException) {
                println("Неверное значение!")
                openNote()
            }

            if (input == 0) {
                showNoteContent()
            } else {
                return
            }
        }

    }

    fun showNoteContent() {
        println("Содержание заметки: ${note.content}")
        println("0. Выход")
        var input = -1
        try {
            input = InputProcessing().checkInputInRange(-1)
        } catch (e: WrongInputException) {
            println("Для выхода введите 0!")
            showNoteContent()
        }

        if (input == 0) {
            return
        }
    }
}




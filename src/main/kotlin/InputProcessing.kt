class InputProcessing {
    fun processInput(): Int {
        val number: Int
        try {
            number = readln().toInt()
        } catch (e: NumberFormatException) {
            throw WrongInputException("Выбор пункта меню должен осуществляться вводом цифры!")
        }
        return number
    }

    fun checkInputInRange(sizeOfList: Int): Int {
        val input = processInput()
        if (input !in 0..sizeOfList + 1) {
            throw WrongInputException("Введенный номер не соответствует ни одному из пунктов меню!")
        }
        return input
    }

    fun createNewNameInput(): String {
        val input = readln()
        if (input.isBlank()) {
            println("Название не может быть пустым!")
            return createNewNameInput()
        }
        return input
    }

    fun newNoteContentInput(): String {
        val input = readln()
        if (input.isBlank()) {
            println("Содержание заметки не может быть пустым!")
            return createNewNameInput()
        }
        return input
    }
}

class WrongInputException(message: String): Exception(message)
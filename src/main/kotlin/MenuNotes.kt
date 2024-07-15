class MenuNotes(val archive: Archive) : MenuLogic<Note>(
    "Список заметок архива '${archive.name}':",
    "Создать новую заметку.",

    createNew = {
        println("Введите название новой заметки:")
        val name = InputProcessing().createNewNameInput()
        println("Введите текст новой заметки:")
        val content = InputProcessing().newNoteContentInput()
        archive.notes.add(Note(name, content))
        println("Заметка '$name' добавлена в архив '${archive.name}'!")
    },

    selectSpecificItem = {inputNumber ->
        MenuSingleNote(archive.notes[inputNumber - 1]).openNote()
    },

    menuItems = archive.notes
)


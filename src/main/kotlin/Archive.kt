

class Archive(): Input() {
    init {
        mapForPrint[1] = "Создать"
        mapForPrint[2] = "Выход"
    }

    private val mapForNotes: MutableMap<String, Note> = mutableMapOf()

    private fun createAnNote(){
        println("Введите название заметки")
        val answer = scanner.nextLine()
        mapForPrint[(mapForPrint.keys.last() + 1)] = answer
        println("Введите текст заметки")
        val text = scanner.nextLine()
        mapForNotes[answer] = Note(text)
    }

    fun printScreen() {
        while(true) {
            when (enterConsole()) {
                1 -> createAnNote()
                2 -> return
                else -> {
                    val nameNotes = mapForPrint[console]
                    mapForNotes[nameNotes]?.printScreen()
                }
            }
         }
    }
}
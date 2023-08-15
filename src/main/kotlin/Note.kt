

class Note(private val text: String): Input() {

    init {
        mapForPrint[1] = "Выход"
    }

    fun printScreen(){
        println(text)
        enterConsole()
        return
    }
}

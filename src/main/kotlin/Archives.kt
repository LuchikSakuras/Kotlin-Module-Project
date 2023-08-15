
import kotlin.system.exitProcess

class Archives: Input() {
    init {
        mapForPrint[1] = "Создать"
        mapForPrint[2] = "Выход"
    }

    var mapForArchive: MutableMap<String, Archive> = mutableMapOf()

    private fun createAnArchive(){
        println("Введите название архива")
        val answer = scanner.nextLine()
        mapForPrint[(mapForPrint.keys.last() + 1)] = answer
        mapForArchive[answer] = Archive()
    }

    fun printScreen() {
        while(true){
            when (enterConsole()) {
                1 -> createAnArchive()
                2 -> exitProcess(0)
                else -> {
                    val nameArchive = mapForPrint[console]
                    val anyArchive = mapForArchive[nameArchive]
                    anyArchive?.printScreen()
                }
            }
        }
    }
}

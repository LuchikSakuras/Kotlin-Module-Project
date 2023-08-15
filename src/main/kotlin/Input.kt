import java.util.Scanner


open class Input {

    private var consoleString: String = ""
    var console: Int = -1
    val scanner = Scanner(System.`in`)

    val mapForPrint: MutableMap<Int, String> = mutableMapOf()

    fun printMap() {
        mapForPrint.keys.forEach { key -> println("$key. ${mapForPrint[key]}") }
    }

    fun enterConsole(): Int {
        while (true) {
            println("Введите цифру из списка для выбора действия:")
            printMap()
            consoleString = scanner.nextLine()
            when (consoleString.toIntOrNull()) {
                null -> println("Следует ввести цифру")
                else -> {
                    console = consoleString.toInt()
                    if (console <= mapForPrint.keys.last())
                        return console
                    else println("Такой цифры нет")
                }
            }
        }
    }
}
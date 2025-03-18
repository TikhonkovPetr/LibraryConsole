abstract class ObjectLibrary(var id: Int, val name: String, var available: Boolean) : FullInfoInterface {
    fun briefInformation() {
        println("ID: ${id}| ${this.name} доступна: ${yesOrNot(available)}")
    }

    fun returnObject() {
        if (!available) {
            println("Объект ${this.name} с ID: ${this.id} вернули")
            available = !available
        } else {
            println("Этот объект находится в библиотеке!")
        }
    }

    fun yesOrNot(avail: Boolean): String {
        return (if (avail) "Да" else "Нет")
    }
}
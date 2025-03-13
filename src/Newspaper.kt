class Newspaper(id: Int, name: String, available: Boolean, private val issueNumber: Int) :
    ObjectLibrary(id, name, available), ReadingInLibrary {
    override fun getFullInfo() {
        println("выпуск: ${this.issueNumber} газеты ${this.name} с id: ${this.id} доступен: ${yesOrNot(available)}")
    }

    override fun readingInLibrary() {
        if (available) {
            println("Вы взяли газету ${this.name} читать в зале")
            available = !available
        } else println("Эту газету уже кто то взял читать")
    }
}
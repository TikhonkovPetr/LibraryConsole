class Newspaper(id: Int, name: String, available: Boolean, private val issueNumber: Int, private val monthCreate: Int) :
    ObjectLibrary(id, name, available), ReadingInLibrary {
    private val monthes:Map<Int,String> = mapOf(1 to "Январь",
        2 to "Февраль",
        3 to "Март",
        4 to "Апрель",
        5 to "Май",
        6 to "Июнь",
        7 to "Июль",
        8 to "Август",
        9 to "Сентябрь",
        10 to "Октябрь",
        11 to "Ноябрь",
        12 to "Декабрь")
    override fun getFullInfo() {
        println("выпуск: ${this.issueNumber} месяца {${this.monthes[monthCreate]}} газеты ${this.name} с id: ${this.id} доступен: ${yesOrNot(available)}")
    }

    override fun readingInLibrary() {
        if (available) {
            println("Вы взяли газету ${this.name} читать в зале")
            available = !available
        } else println("Эту газету уже кто то взял читать")
    }
}
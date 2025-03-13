class DataLibrary {
    private val allObjectLibrary: Map<Int, ObjectLibrary> = mapOf(
        1 to Book(1, "Ночь перед рождеством", true, 96, "Николай Гоголь"),
        2 to Disk(2, "Пираты Карибского моря: проклятие Чёрной жемчужины", true, 0),
        3 to Disk(3, "Расомаха", false, 1),
        4 to Newspaper(4, "Комсомольская правда", true, 1235),
        5 to Book(5, "Анна Каренина", false, 864, "Лев Толстой"),
        6 to Disk(6, "Астрал", false, 1),
        7 to Newspaper(7, "РБК (газета)", true, 96),
        8 to Newspaper(8, "Известия", false, 121),
        9 to Book(9, "Мёртвые души", true, 352, "Николай Гоголь"),
        10 to Book(10, "Обломов", true, 544, "Иван Гончаров")
    )

    fun getAllObject(): Map<Int, ObjectLibrary> {
        return allObjectLibrary
    }
}
class Library {
    private val allObjectLibrary = DataLibrary::getAllObject.invoke(DataLibrary())
    private fun showBook() {
        println("Список книг:")
        showList<Book>()
    }

    private fun showNewspaper() {
        println("Список газет:")
        showList<Newspaper>()
    }

    private fun showDisk() {
        println("Список дисков:")
        showList<Disk>()
    }

    fun showAnyList(choiceUser: Int) {
        when (choiceUser) {
            1 -> showBook()
            2 -> showNewspaper()
            3 -> showDisk()
            4 -> throw Exception("Выход из программы")
            else -> throw Exception("Был введён не корректный запрос")
        }
    }

    fun showSerchItem(listNumber: Int, searchID: Int) {
        when (listNumber) {
            1 -> (allObjectLibrary[searchID] as? Book)?.getFullInfo()?: throw ArrayStoreException("В списке книг нет такого id")
            2 -> (allObjectLibrary[searchID] as? Newspaper)?.getFullInfo()?: throw ArrayStoreException("В списке газет нет такого id")
            3 -> (allObjectLibrary[searchID] as? Disk)?.getFullInfo()?: throw ArrayStoreException(("В списке дисков нет такого id"))
            else -> {
                throw Exception("Был введён не корректный запрос")
            }
        }
    }

    fun activity(listNumber: Int, choiceUserActivity: Int, searchID: Int) {
        when (listNumber) {
            1 -> realisActivity(
                allObjectLibrary.filter { (_, element) -> (element is Book) },
                searchID,
                choiceUserActivity
            )

            2 -> realisActivity(
                allObjectLibrary.filter { (_, element) -> (element is Newspaper) },
                searchID,
                choiceUserActivity
            )

            3 -> realisActivity(
                allObjectLibrary.filter { (_, element) -> (element is Disk) },
                searchID,
                choiceUserActivity
            )
        }
    }

    private fun realisActivity(dataLibrary: Map<Int, ObjectLibrary>, searchID: Int, choiceUserActivity: Int) {
        when (choiceUserActivity) {
            1 -> ((dataLibrary[searchID] as? TakeToHome)?.takeToHome()) ?: println("Данный объект нельзя забрать домой")
            2 -> ((dataLibrary[searchID] as? ReadingInLibrary)?.readingInLibrary())
                ?: println("Данный объект нельзя читать в библиотеке")

            3 -> dataLibrary[searchID]?.getFullInfo()
            4 -> dataLibrary[searchID]?.returnObject()
            5 -> throw ArrayStoreException("Выход в главное меню")
            else -> throw Exception("Вы выбрали несуществующи вариант")
        }
    }

    private inline fun <reified T> showList() {
        allObjectLibrary.filter { (_, element) -> (element is T) }
            .forEach { (_, elem) -> elem.briefInformation() }
    }
    fun addObject(buyObject:ObjectLibrary){
        buyObject.id = allObjectLibrary.size+1
        allObjectLibrary[allObjectLibrary.size+1] = buyObject
    }
    fun getItemWithId(id:Int):ObjectLibrary{
        return allObjectLibrary[id]?: throw ArrayStoreException("Нет объекта с таким id")
    }
}
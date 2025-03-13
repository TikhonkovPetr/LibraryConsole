fun main() {
    val library = Library()
    val userMenu = UserMenu()
    while (true) {
        try {
            val choiceList = userMenu.mainMenu()
            library.showAnyList(choiceList)
            val choiceId: Int = userMenu.choiceListMenu()
            library.showSerchItem(choiceList, choiceId)
            val choiseActivity = userMenu.choiceActivityWithObject()
            library.activity(choiceList, choiseActivity, choiceId)
        } catch (ex: ArrayStoreException) {
            println(ex.message)
            continue
        } catch (ex: Exception) {
            println(ex.message)
            break
        }
    }
}

interface FullInfoInterface {
    fun getFullInfo()
}

interface TakeToHome {
    fun takeToHome()
}

interface ReadingInLibrary {
    fun readingInLibrary()
}
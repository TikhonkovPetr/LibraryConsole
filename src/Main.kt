fun main() {
    val mapShops:Map<Int, AbstractShop> = mapOf(1 to ShopBook(),2 to ShopDisk(),3 to ShopNewspaper())
    val manager = Manager()
    val library = Library()
    val userMenu = UserMenu()
    while (true) {
        try {
            userMenu.mainMenu(library,manager,mapShops)
        } catch (ex: ArrayStoreException) {
            println(ex.message)
            continue
        } catch (ex: Exception) {
            println(ex.message)
            break
        }
    }
    val testesClass = TestesClass()
    println("Работа тестого класса Int ${testesClass.getElementList<Int>(listOf(777))}")
    println("Работа тестого класса String ${testesClass.getElementList<String>(listOf("|полученная строка|"))}")
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
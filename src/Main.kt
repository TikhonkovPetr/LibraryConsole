fun main() {
    val dataShops = DataShops()
    val mapShops:Map<Int,AbstractShop<out ObjectLibrary>> = dataShops.getShops()
    val manager = Manager()
    val library = Library()
    val userMenu = UserMenu(library,manager,mapShops)
    while (true) {
        try {
            userMenu.mainMenu()
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
class UserMenu {
    fun mainMenu(library:Library,manager: Manager, mapShops:Map<Int,AbstractShop>): Int {
        println(
            "Выберите действие:" +
                    "\n1. Показать книги" +
                    "\n2. Показать газеты" +
                    "\n3. Показать диски" +
                    "\n4. Режим менеджера"+
                    "\n5. Оцифровать объект"+
                    "\n6. Завершить работу"
        )
        when(val choiceList=readln().toInt()){
            1,2,3 ->{
                showElementLibraryAndWork(library,choiceList)
            }
            4 ->{
                menegerActivity(manager,library, mapShops)
            }
            5 -> {
                converterMenu(library)
            }
            6 ->{
                throw Exception("Выход из программы")
            }
        }
        return 1
    }

    private fun choiceListMenu(): Int {
        println("Выберите объект из списка по ID")
        return readln().toInt()
    }
    private fun showElementLibraryAndWork(library: Library,choiceList:Int){
        library.showAnyList(choiceList)
        val choiceId: Int = choiceListMenu()
        library.showSerchItem(choiceList, choiceId)
        val choiseActivity = choiceActivityWithObject()
        library.activity(choiceList, choiseActivity, choiceId)
    }
    private fun choiceActivityWithObject(): Int {
        println(
            "Выберите действие:" +
                    "\n1. Взять домой" +
                    "\n2. Читать в читальном зале" +
                    "\n3. Показать подробную информацию" +
                    "\n4. Вернуть" +
                    "\n5. вернуться на главную страницу"
        )
        return readln().toInt()
    }
    private fun menegerActivity(manager: Manager, library: Library, mapShops:Map<Int,AbstractShop>){
        when(val choiceShop = menegerMenu()){
            1,2,3 ->{
                manager.buy((mapShops[choiceShop] as AbstractShop),library,enterIdBuyObject(mapShops[choiceShop]))
                mapShops[choiceShop]?.sellObject(enterIdBuyObject(mapShops[choiceShop]))
            }
            4 ->{
                throw ArrayStoreException("Вы вернуслись в основное меню")
            }
            else ->{
                throw ArrayStoreException("Нет такого действия в списке задач")
            }
        }
    }
    private fun menegerMenu():Int{
        println("Выберите магазин:"+
        "\n1. Книжный магазин"+
        "\n2. Магазин дисков"+
        "\n3. Газетный ларёк"+
        "\n4. Вернуться в меню")
        return readln().toInt()
    }
    private fun enterIdBuyObject(abstractShop: AbstractShop?):Int{
        println("Выберите объект для покупки по номеру:")
        abstractShop?.showList()
        return readln().toInt()
    }
    private fun converterMenu(library: Library){
        library.showAnyList(1)
        library.showAnyList(2)
        val converterToDisk = ConverterToDisk()
        library.addObject(converterToDisk.digitization(library.getItemWithId(choiceListMenu())))
    }
}
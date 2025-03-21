class DataShops {
    private val month = Month()
    private val storageBook:List<Book> = listOf(Book(1,"Приключения Робинзона Крузо",true, 264, "Даниэль Дефо"),
        Book(2,"Война и мир. Книга 1. Том 1–2",true, 736, "Лев Толстой"),
        Book(3,"Богатый папа, бедный папа",true, 352, "Роберт Кийосаки")
    )
    private val storageDisk:List<Disk> = listOf(Disk(1,"Время",true, 0),
        Disk(2,"Холодное сердце",true, 1),
        Disk(3,"Пётр I",true, 0)
    )
    private val storageNewspaper:List<Newspaper> = listOf(Newspaper(1,"Гудок",true, 87, month.monthes[7].toString()),
        Newspaper(2,"Комерсант",true, 235, month.monthes[2].toString()),
        Newspaper(3,"Завтра",true, 35, month.monthes[8].toString())
    )
    private val shopBook = ShopBook()
    private val shopDisk = ShopDisk()
    private val shopNewspaper = ShopNewspaper()
    init{
        shopBook.addInventory(storageBook)
        shopDisk.addInventory(storageDisk)
        shopNewspaper.addInventory(storageNewspaper)
    }
    fun getShops():Map<Int,AbstractShop<out ObjectLibrary>>{
        return mapOf(1 to shopBook,2 to shopDisk,3 to shopNewspaper)
    }
}
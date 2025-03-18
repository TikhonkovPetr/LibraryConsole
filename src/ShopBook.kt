class ShopBook : AbstractShop (mutableMapOf()){
    private val storageBook:List<Book> = listOf(Book(1,"Приключения Робинзона Крузо",true, 264, "Даниэль Дефо"),
        Book(2,"Война и мир. Книга 1. Том 1–2",true, 736, "Лев Толстой"),
        Book(3,"Богатый папа, бедный папа",true, 352, "Роберт Кийосаки")
    )
    init {
        var i=1
        storageBook.forEach { element ->
            sellesObject[i] = element
            i++
        }
    }
}
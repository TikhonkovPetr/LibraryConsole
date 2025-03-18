class ShopNewspaper: AbstractShop (mutableMapOf()) {
    private val storageNewspaper:List<Newspaper> = listOf(Newspaper(1,"Гудок",true, 87, 7),
        Newspaper(2,"Комерсант",true, 235, 2),
        Newspaper(3,"Завтра",true, 35, 8)
    )
    init {
        var i=1
        storageNewspaper.forEach { element ->
            sellesObject[i] = element
            i++
        }
    }
}
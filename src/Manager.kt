class Manager {
    fun  buy(shop: AbstractShop,library: Library,idBuyObject:Int):ObjectLibrary{
        library.addObject(shop.sellObject(idBuyObject))
        return shop.sellObject(idBuyObject)
    }
}
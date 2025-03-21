class Manager {
    fun <T:ObjectLibrary> buy(shop: AbstractShop<T>?,library: Library,idBuyObject:Int){
        library.addObject(shop?.getSellObject(idBuyObject) as ObjectLibrary)
        shop.removeSellObject(idBuyObject)
    }
}
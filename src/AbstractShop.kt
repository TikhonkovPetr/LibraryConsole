abstract class AbstractShop <T:ObjectLibrary>{
    private val sellesObject: MutableMap<Int , T> = mutableMapOf()
    fun getSellObject(idSelestObject:Int):T{
        return sellesObject[idSelestObject]?: throw ArrayStoreException("Нет объекта в магазине с таким номером")
    }
    fun removeSellObject(idSelestObject: Int){
        sellesObject.remove(idSelestObject)
    }
    fun showList(){
        sellesObject.forEach { (key,value)-> println("$key: ${(value as ObjectLibrary).name}") }
    }
    fun returnShop():AbstractShop<T>{
        return this
    }
    fun addInventory(addedList:List<T>){
        addedList.forEach{element -> sellesObject[sellesObject.size] =element}
    }
    fun getWithAbstractShop():AbstractShop<T>{
        return this
    }
}
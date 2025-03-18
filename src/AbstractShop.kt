abstract class AbstractShop (val sellesObject: MutableMap<Int ,ObjectLibrary>){
    fun sellObject(idSelestObject:Int):ObjectLibrary{
        val selObject = sellesObject[idSelestObject]?: throw ArrayStoreException("Нет объекта в магазине с таким номером")
        sellesObject.remove(idSelestObject)
        return selObject
    }
    fun showList(){
        sellesObject.forEach { element->
            println("${element.key} = ${element.value.name}")
        }
    }
}
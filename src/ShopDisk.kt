class ShopDisk :AbstractShop(mutableMapOf()) {
    private val storageDisk:List<Disk> = listOf(Disk(1,"Время",true, 0),
        Disk(2,"Холодное сердце",true, 1),
        Disk(3,"Пётр I",true, 0)
    )
    init {
        var i=1
        storageDisk.forEach { element ->
            sellesObject[i] = element
            i++
        }
    }
}
class ConverterToDisk {
    fun digitization(objectLibrary: ObjectLibrary):Disk{
        return Disk(objectLibrary.id,objectLibrary.name,true,1)
    }
}
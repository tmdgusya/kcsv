package repository

interface Reader<T> {
    fun read(filePath: String): T
}

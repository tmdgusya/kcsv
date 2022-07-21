package view

import data.Cell

abstract class Table<T> {

    val view: Map<Int, Cell<T>> = hashMapOf()

    abstract fun getRow(index: Int): Row<T>

    abstract fun getColumn(index: Int): Column<T>

    abstract fun getData(x: Int, y: Int): Cell<T>

    abstract fun setData(x: Int, y: Int)

    abstract fun setHeader(headers: List<String>)
}

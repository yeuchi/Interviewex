package com.ctyeung.interviewex.List

// stack
class LIFO<T> {
    var arrayList = ArrayList<T>()

    constructor(item:T) {
        arrayList.add(item)
    }

    fun push(item:T) {
        arrayList.add(item)
    }

    fun pop():T {
        val item = arrayList.last()
        arrayList.remove(item)
        return item
    }

    fun count():Int {
        return arrayList.size
    }
}
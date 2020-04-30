package com.ctyeung.interviewex.List

// Queue
class FIFO<T> {

    var arrayList = ArrayList<T>()

    constructor(item:T) {
        arrayList.add(item)
    }

    fun enqueue(item:T) {
        arrayList.add(item)
    }

    fun dequeue():T {
        val item = arrayList.get(0)
        arrayList.remove(item)
        return item
    }

    fun count():Int {
        return arrayList.size
    }
}
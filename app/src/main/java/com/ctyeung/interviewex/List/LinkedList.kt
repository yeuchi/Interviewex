package com.ctyeung.interviewex.List

class LinkedList<T> (var item:T?) {

    var next:LinkedList<T>? = null

    fun count():Int {
        if(next != null)
            return next!!.count() + 1

        else
            return 1
    }

    fun add(item:T){
        if(next != null)
            next!!.add(item)

        else
            next = LinkedList(item)
    }

    fun remove(item:T) {
        if(next != null) {
            if (next!!.item == item)
                next == next!!.next

            else
                next!!.remove(item)
        }

        // only happens with head
        if (this.item == item) {

        }
    }

    fun head():T? {
        return item
    }

    fun tail():T? {
        return item
    }
}
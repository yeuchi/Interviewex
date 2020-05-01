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
        // for head only
        if (this.item == item) {
            if(next != null) {
                this.item = next!!.item
                next = next!!.next
            }
            else
                this.item = null
        }
        else if (next != null) {
            if(next!!.item == item) {
                next = next!!.next
            }
            else
                return next!!.remove(item)
        }
    }

    fun head():T? {
        return item
    }

    fun tail():T? {
        if(next != null)
            return next!!.tail()

        return item
    }
}
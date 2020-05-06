package com.ctyeung.interviewex.Sort

object BubbleSort:Comparable() {

    fun sort(list:ArrayList<Any>) {

        for (i in 0..list.size-1) {

            var hasChanged:Boolean = false
            for(j in 0..list.size-2){
                val item = list[j]
                val next = list[j+1]
                if (compare(item, next) < 0) {
                    list[j] = next
                    list[j+1] = item
                    hasChanged = true
                }
            }
            // done !
            if(!hasChanged)
                return
        }
    }
}
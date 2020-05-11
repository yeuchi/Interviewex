package com.ctyeung.interviewex.Sort

class BubbleSort<T>:Comparable<T>() {

    fun sort(list:ArrayList<T>) {

        for (i in 0..list.size-1) {

            var hasChanged:Boolean = false
            for(j in 0..list.size-2){
                val item = list[j]
                val next = list[j+1]
                if(item!! < next) {
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
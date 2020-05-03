package com.ctyeung.interviewex.Sort

class BubbleSort<T>():Comparable<T>() {

    open fun sort(list:ArrayList<Int>) {

        for (i in 0..list.size-1) {

            var hasChanged:Boolean = false
            for(j in 0..list.size-2){
                val item = list[j]
                val next = list[j+1]
                if (item.compareTo(next) > 0) {
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
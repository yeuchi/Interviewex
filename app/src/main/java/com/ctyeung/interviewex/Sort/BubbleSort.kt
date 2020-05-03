package com.ctyeung.interviewex.Sort

class BubbleSort() {

    open fun sort(list:ArrayList<Int>) {

        for (i in 0..list.size-1) {

            var hasChanged:Boolean = false
            for(j in 0..list.size-2){
                val current = list[j]
                val next = list[j+1]
                if (current.compareTo(next) > 0) {
                    list[j] = next
                    list[j+1] = current
                    hasChanged = true
                }
            }

            // done !
            if(!hasChanged)
                return
        }
    }
}
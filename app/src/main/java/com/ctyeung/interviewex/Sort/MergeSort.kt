package com.ctyeung.interviewex.Sort

object MergeSort : Comparable() {

    fun sort(list:ArrayList<Any>, depth:Int=0):ArrayList<Any> {

        if(list.size > 1){
            val mid = list.size / 2
            var subListLeft= ArrayList<Any>(list.subList(0, mid))
            var subListRight = ArrayList<Any>(list.subList(mid, list.size))

            var sortedLeft = sort(subListLeft, depth)
            var sortedRight = sort(subListRight, depth)
            var l = 0
            var r = 0

            // sorted 2 list
            var sorted = ArrayList<Any>()
            while (l < sortedLeft.size && r < sortedRight.size) {
                val left = sortedLeft[l]
                val right = sortedRight[r]
                if (left > right) {
                    sorted.add(left)
                    l++
                } else {
                    sorted.add(right)
                    r++
                }
            }

            if(l < sortedLeft.size) {
                val remainLeft = sortedLeft.subList(l, subListLeft.size)
                sorted.addAll(remainLeft)
            }
            else if (r < sortedRight.size) {
                val remainRight = sortedRight.subList(r, subListRight.size)
                sorted.addAll(remainRight)
            }
            return sorted
        }
        else {
            return list
        }
    }
}
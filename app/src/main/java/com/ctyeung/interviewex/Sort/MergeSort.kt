package com.ctyeung.interviewex.Sort

import kotlin.Comparable

object MergeSort {

    fun sort(list:ArrayList<Int>, depth:Int=0):ArrayList<Int> {

        if(list.size > 1){
            val mid = list.size / 2
            var subListLeft= ArrayList<Int>(list.subList(0, mid))
            var subListRight = ArrayList<Int>(list.subList(mid, list.size))

            var sortedLeft = sort(subListLeft, depth)
            var sortedRight = sort(subListRight, depth)
            var l = 0
            var r = 0

            // sorted 2 list
            var sorted = ArrayList<Int>()
            while (l < sortedLeft.size && r < sortedRight.size) {
                val left = sortedLeft[l]
                val right = sortedRight[r]
                if (left < right) {
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
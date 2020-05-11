package com.ctyeung.interviewex.Sort

class MergeSort<T> : Comparable<T>() {

    fun sort(list:ArrayList<T>, depth:Int=0):ArrayList<T> {

        if(list.size > 1){
            val mid = list.size / 2
            var subListLeft= ArrayList<T>(list.subList(0, mid))
            var subListRight = ArrayList<T>(list.subList(mid, list.size))

            var sortedLeft = sort(subListLeft, depth)
            var sortedRight = sort(subListRight, depth)
            var l = 0
            var r = 0

            // sorted 2 list
            var sorted = ArrayList<T>()
            while (l < sortedLeft.size && r < sortedRight.size) {
                val left = sortedLeft[l]
                val right = sortedRight[r]
                if (left!! > right) {
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
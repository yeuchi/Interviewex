package com.ctyeung.interviewex.Sort

import java.util.Random
import kotlin.random.Random.Default

class QuickSort<T> :Comparable<T>(){

    /*
     * Any pivot is ok so long it does change so we can stuck in an infinite loop
     * Random is not random, so use an incremental pivot
     */
    fun sort(list:ArrayList<T>, pivot:Int=0):ArrayList<T>{
        if(list.size > 1) {
            var listLeft = ArrayList<T>()
            var listRight = ArrayList<T>()

            // divide list
            var p = pivot
            if(p > list.size-1)
                p = 0

            for(num in list){
                if(num!! > list[p]) {
                    listLeft.add(num)
                }
                else {
                    listRight.add(num)
                }
            }

            // recursion
            p++
            if(listLeft.size>1)
                listLeft = sort(listLeft, p)

            if(listRight.size>1)
                listRight = sort(listRight, p)

            // merge lists
            listLeft.addAll(listRight)
            return listLeft
        }
        else {
            return list
        }
    }
}
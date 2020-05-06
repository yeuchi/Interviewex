package com.ctyeung.interviewex.Sort

import java.util.Random
import kotlin.random.Random.Default

object QuickSort :Comparable(){

    /*
     * Any pivot is ok so long it does change so we can stuck in an infinite loop
     * Random is not random, so use an incremental pivot
     */
    fun sort(list:ArrayList<Any>, pivot:Int=0):ArrayList<Any>{
        if(list.size > 1) {
            var listLeft = ArrayList<Any>()
            var listRight = ArrayList<Any>()

            // divide list
            var p = pivot
            if(p > list.size-1)
                p = 0

            for(num in list){
                if(compare(num, list[p]) > 0) {
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
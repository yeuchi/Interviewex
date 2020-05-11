package com.ctyeung.interviewex.Sort

import kotlin.math.roundToInt

/*
 * list is always sorted
 */
class InsertSort<T> :Comparable<T>() {
    var list:ArrayList<T>

    init {
        list = ArrayList<T>()
    }

    /*
     * bisection rule
     */
    fun insert(item:T) {
        var i = bisection(item)

        if(i < list.size) {
            if (i < list.size && item!! > list[i])
                i++
        }
        list.add(i, item)
    }

    fun bisection(ab:T):Int {

        var jl = 0
        var ju = list.size
        var jm = 0

        while (ju - jl > 0)
        {
            jm = ((ju + jl)/2)									// midpoint formula

            if(ab == list[jm]) {
                return jm
            }
            if(ab!! < list[jm]) {
                ju = jm-1

                if(ju >= list.size)
                    return list.size
            }
            else if (ab > list[jm]){
                jl = jm+1

                if(jl <= 0)
                    return 0
            }
        }
        return jl
    }
}
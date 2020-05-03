package com.ctyeung.interviewex.Sort

import kotlin.math.roundToInt

/*
 * list is always sorted
 */
class InsertSort {
    var list:ArrayList<Int>

    constructor(){
        list = ArrayList<Int>()
    }

    /*
     * bisection rule
     */
    fun insert(item:Int) {
        var i = 0
        when (list.size) {
            0 -> {}
            1 -> {
                if(item > list[0])
                    i = 1
            }
            else -> {
                i = bisection(item)
            }
        }
        list.add(i, item)
    }

    fun bisection(ab:Int):Int {

        var ju:Double = (this.list.size-1).toDouble();											    // upper limit
        var jl:Double = 0.0;															    // lower limit

        while (ju > jl)
        {
            var jm = ((ju + jl)/2).roundToInt();									// midpoint formula

            if (ab > this.list[jm])
                jl = jm.toDouble();
            else
                ju = jm.toDouble();
        }
        return jl.toInt();
    }

    fun remove(item:Int) {
        list.remove(item)
    }

    fun length():Int {
        return list.size
    }
}
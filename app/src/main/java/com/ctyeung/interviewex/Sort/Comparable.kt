package com.ctyeung.interviewex.Sort

abstract class Comparable<T>() : IComparable<T> {
    var item:Any?=null

    override fun compareTo(t: T):Int {
        when (t) {
            is Int -> {
                return t as Int - item as Int
            }
            is Long -> {
                val num = t as Long - item as Long
                return threshold (num as Double)
            }

            is Double,
            is Float -> {
                val real = t as Double  - item as Double
                return threshold (real as Double)
            }

            is Char -> {
                return (t as Char).compareTo(item as Char)
            }
            is String -> {
                return (t as String).compareTo(item as String)
            }
            else -> {
                return t.toString().compareTo(item.toString())
            }
        }
    }

    private fun threshold(t:Double):Int {
        when {
            t > 0 -> {return 1}
            t < 0 -> return -1
        }
        //t == 0.0 -> {return 0}
        return 0
    }
}
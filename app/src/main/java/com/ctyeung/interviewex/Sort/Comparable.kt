package com.ctyeung.interviewex.Sort

abstract class Comparable {

    fun compare(item: Any, next:Any):Int {
        when (item) {
            is Int -> {
                return next as Int - item as Int
            }
            is Long -> {
                val num = next as Long - item as Long
                return threshold (num as Double)
            }

            is Double,
            is Float -> {
                val real = next as Double  - item as Double
                return threshold (real as Double)
            }

            is Char -> {
                return (next as Char).compareTo(item as Char)
            }
            is String -> {
                return (next as String).compareTo(item as String)
            }
            else -> {
                return next.toString().compareTo(item.toString())
            }
        }
    }

    fun threshold(t:Double):Int {
        when {
            t > 0 -> {return 1}
            t < 0 -> return -1
        }
        //t == 0.0 -> {return 0}
        return 0
    }
}
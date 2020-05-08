package com.ctyeung.interviewex.Sort

abstract class Comparable {

    fun lessThan(pre: Any, post:Any):Boolean {
        when (pre) {
            is Byte -> {
                return ((pre as Byte) < (post as Byte))
            }
            is Short -> {
                return ((pre as Short) < (post as Short))
            }
            is Int -> {
                return ((pre as Int) < (post as Int))
            }
            is Long -> {
                return ((pre as Long) < (post as Long))
            }

            is Double -> {
                return ((pre as Double) < (post as Double))
            }
            is Float -> {
                return ((pre as Float) < (post as Float))
            }

            is Char -> {
                return ((pre as Char) < (post as Char))
            }
            is String -> {
                return (pre as String) < (post as String)
            }
            else -> {
                return pre.toString() < post.toString()
            }
        }
    }

    fun largerThan(pre: Any, post:Any):Boolean {
        when (pre) {
            is Byte -> {
                return ((pre as Byte) > (post as Byte))
            }
            is Short -> {
                return ((pre as Short) > (post as Short))
            }
            is Int -> {
                return ((pre as Int) > (post as Int))
            }
            is Long -> {
                return ((pre as Long) > (post as Long))
            }

            is Double -> {
                return ((pre as Double) > (post as Double))
            }
            is Float -> {
                return ((pre as Double) > (post as Double))
            }

            is Char -> {
                return ((pre as Char) > (post as Char))
            }
            is String -> {
                return (pre as String) > (post as String)
            }
            else -> {
                return pre.toString() > post.toString()
            }
        }
    }

    fun compare(item: Any, next:Any):Int {
        when (item) {
            is Byte -> {
                return next as Byte - item as Byte
            }

            is Short -> {
                return next as Short - item as Short
            }

            is Int -> {
                return next as Int - item as Int
            }
            is Long -> {
                val num = next as Long - item as Long
                return threshold (num as Double)
            }

            is Double-> {
                val real = next as Double  - item as Double
                return threshold (real as Double)
            }
            is Float -> {
                val real = next as Float  - item as Float
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
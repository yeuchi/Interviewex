package com.ctyeung.interviewex.Tree

class BinaryTree<T>(t:T):Comparable<T> {
    var item = t
    var left:BinaryTree<T>? = null
    var right:BinaryTree<T>? = null

    fun insert(t:T):Boolean {
        val compared = compareTo(t)
        when {
            compared < 0 -> {
                if (null!=left) {
                    return left!!.insert(t)
                }
                else {
                    left = BinaryTree(t)
                    return true
                }
            }

            compared > 0 -> {
                if (null!=right) {
                    return right!!.insert(t)
                }
                else {
                    right = BinaryTree(t)
                    return true
                }
            }

            else -> {
                // compared == 0
                // we only support unique list
                return false
            }
        }
    }

    fun remove() {

    }

    fun find() {

    }

    fun findMin() {

    }

    fun findMax() {

    }

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
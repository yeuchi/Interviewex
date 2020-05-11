package com.ctyeung.interviewex.Sort

import java.lang.Exception

abstract class Comparable<T> {

     operator fun Any.compareTo(other: T): Int = when(this) {
         is Byte -> {
             this as Byte - other as Byte
         }

         is Short -> {
             this as Short - other as Short
         }

         is Int -> {
             this as Int - other as Int
         }
         is Long -> {
             threshold(this as Long - other as Long)
         }

         is Double-> {
             threshold(this as Double  - other as Double)
         }

         is Float -> {
             threshold(this as Double  - other as Double)
         }

         is Char -> {
             (this as Char - other as Char)
         }

         is String -> {
             (this as String).compareTo(other as String)
         }
         else -> {
             throw Exception("type not supported")
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

    fun threshold(t:Long):Int {
        when {
            t > 0 -> {return 1}
            t < 0 -> return -1
        }
        //t == 0.0 -> {return 0}
        return 0
    }
}
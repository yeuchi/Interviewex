package com.ctyeung.interviewex.Graph

data class Path<T> (val source:T,
                    val destination:T,
                    var list:ArrayList<T>) {

    var isDone:Boolean = false

    fun length():Int {
        return list.size
    }
}


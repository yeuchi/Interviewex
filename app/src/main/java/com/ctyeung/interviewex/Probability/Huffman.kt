package com.ctyeung.interviewex.Probability

import com.ctyeung.interviewex.Sort.InsertSort

class Huffman<T>  {
    constructor(histogram:HashMap<T, Int>){
        var sort = InsertSort<T>()
        for (key in histogram.keys){
            sort.insert(key)
        }
        val sorted = sort.list
        buildTree(sorted)
    }

    private fun buildTree(sorted:ArrayList<T>) {

    }

    fun encode() {

    }

    fun decode() {

    }
}
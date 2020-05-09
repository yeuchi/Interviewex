package com.ctyeung.interviewex.Probability

import com.ctyeung.interviewex.Sort.InsertSort

class Huffman<T>  {
    var codeMap = HashMap<T, Long>()

    constructor(histogram:HashMap<T, Int>){
        var sort = InsertSort<T>()
        for (key in histogram.keys){
            sort.insert(key)
        }
        val sorted = sort.list
        val tree = buildTree(sorted)
        getCodeMap(tree)
    }

    private fun buildTree(sorted:ArrayList<T>):CodeTree<T> {
        var tree = CodeTree<T>()
        for(i in sorted.size-1 downTo 0){
            val key = sorted[i]
            tree.add(key)
        }
        return tree
    }

    private fun getCodeMap(tree:CodeTree<T>) {
        codeMap.clear()
    }

    fun encode() {

    }

    fun decode() {

    }
}
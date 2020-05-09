package com.ctyeung.interviewex.Probability

import com.ctyeung.interviewex.Sort.InsertSort

class Huffman<T>  {
    var codeMap = HashMap<T, ArrayList<Int>>()

    constructor(histogram:HashMap<T, Int>){
        var sort = InsertSort<T>()
        for (key in histogram.keys){
            sort.insert(key)
        }
        val sorted = sort.list
        val tree = buildTree(sorted)
        getCodeMap(histogram.keys, tree)
    }

    private fun buildTree(sorted:ArrayList<T>):CodeTree<T> {
        var tree = CodeTree<T>()
        for(i in sorted.size-1 downTo 0){
            val key = sorted[i]
            tree.add(key)
        }
        return tree
    }

    private fun getCodeMap(keys:MutableSet<T>, tree:CodeTree<T>) {
        codeMap.clear()
        for(key in keys){
            val codeList = tree.code(key)
            codeMap.put(key, codeList!!)
        }
    }

    fun bitLength(message:ArrayList<T>):Int {
        var bitCount:Int = 0
        for(key in message){
            val code = codeMap[key]
            bitCount += code!!.size
        }
        return bitCount
    }

    fun encode(message:ArrayList<T>, byteCount:Int):ByteArray {
        var bytes = ByteArray(byteCount)
        var ptr = 0
        for(key in message) {
            val code = codeMap[key]
            for(c in code!!) {

            }
        }
        return bytes
    }

    fun decode() {

    }
}
package com.ctyeung.interviewex.Probability

import com.ctyeung.interviewex.Sort.InsertSort
import java.math.BigInteger

class Huffman<T>  {
    var codeMap = HashMap<T, ArrayList<Int>>()
    var invMap = HashMap<ArrayList<Int>, T>()

    constructor(histogram:HashMap<T, Int>){
        var sort = InsertSort<T>()
        for (key in histogram.keys){
            sort.insert(key)
        }
        val sorted = sort.list
        val tree = buildTree(sorted)
        createCodeMaps(histogram.keys, tree)
    }

    private fun buildTree(sorted:ArrayList<T>):CodeTree<T> {
        var tree = CodeTree<T>()
        for(i in sorted.size-1 downTo 0){
            val key = sorted[i]
            tree.add(key)
        }
        return tree
    }

    private fun createCodeMaps(keys:MutableSet<T>, tree:CodeTree<T>) {
        codeMap.clear()
        invMap.clear()
        for(key in keys){
            val codeList = tree.code(key)
            codeMap.put(key, codeList!!)
            invMap.put(codeList, key)
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

    infix fun Byte.shl(that: Int): Int = this.toInt().shl(that)
    infix fun Byte.or(that: Byte): Byte = this.toInt().or(that.toInt()).toByte()
    infix fun Byte.and(that: Byte): Byte = this.toInt().and(that.toInt()).toByte()

    /*
     * Need to add 'End-of-message' code
     */
    fun encode(message:ArrayList<T>, byteCount:Int):ByteArray {
        var bytes = ByteArray(byteCount)
        var bitPtr = 0
        for(key in message) {
            val code = codeMap[key]

            // encode each bit -- assume bytes are zeroed
            for(c in code!!) {
                if(c==1) {
                    var byteIndex = bitPtr / 8
                    var bitShift = bitPtr % 8

                    var mask:Int = 1 shl bitShift

                    val EightBits = bytes[byteIndex].toInt()
                    bytes[byteIndex] = (EightBits or mask).toByte()
                }
                bitPtr ++
            }
        }
        return bytes
    }

    fun decode(bytes:ByteArray):ArrayList<T> {
        var message = ArrayList<T>()
        var code = ArrayList<Int>()
        var bitPtr = 0
        for(byte in bytes) {
            for(i in 0..7) {
                var bitShift = bitPtr % 8
                var mask:Int = 1 shl bitShift

                if(mask and byte.toInt() > 0) {
                    code.add(1)
                }
                else
                    code.add(0)

                bitPtr++

                if(invMap.contains(code)) {
                    val t = invMap[code]
                    message.add(t!!)
                    code.clear()
                }
            }
        }
        return message
    }
}
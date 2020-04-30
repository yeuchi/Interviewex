package com.ctyeung.Trie

class TrieNode {
    private val char:Char
    private var isEndOfWord:Boolean = false
    private var nodes:HashMap<Char, TrieNode> = HashMap<Char, TrieNode>()

    constructor(str:String){
        char = str.get(0)

        val len = str.length
        when(len) {
            1 -> {
                isEndOfWord = true
            }
            else -> {
                add(str)
            }
        }
    }

    fun remove(str:String):Boolean {
        val c = str.get(0)

        if(c == char) {
            val len = str.length
            when (len) {
                1 -> {
                    if (nodes.size == 0 && isEndOfWord) {
                        // remove this word !
                        return true
                    }
                }
                else -> {
                    val cc = str.get(1)
                    val node = nodes[cc]

                    if (node != null) {
                        val isRemove = node.remove(str.substring(1, str.length))
                        if (isRemove) {
                            nodes.remove(cc, node)
                            return true
                        }
                    }
                }
            }
        }
        return false
    }

    fun getAllWords(str:String=""):ArrayList<String> {
        val word = str + char
        var arrayList = ArrayList<String>()

        /*
         * last char, print this word
         */
        if(isEndOfWord)
            arrayList.add(word)

        /*
         * find end of word and return
         */
        val keys = nodes.keys
        for(key in keys) {
            val node = nodes[key]
            val list:ArrayList<String> = node!!.getAllWords(word)
            arrayList.addAll(list)
        }
        return arrayList
    }

    fun isWordMatch(str:String):Boolean {

        /*
         * last character matches
         */
        val c = str.get(0)
        if(c == char) {
            if(str.length == 1 && nodes.isEmpty()) {
                return true
            }
            /*
             * more characters to match
             */
            val cc = str.get(1)
            val subString = str.substring(1, str.length)
            val trie = nodes[cc]
            if(trie!=null) {
                return trie.isWordMatch(subString)
            }
        }
        /*
         * does not match in length nor character(s)
         */
        return false
    }

    fun add(str:String) {
        val c = str.get(1)
        val trie = nodes[c]
        val subString = str.substring(1, str.length)
        if(trie != null) {
            trie.add(subString)
        }
        else {
            nodes.put(c, TrieNode(subString))
        }
    }
}
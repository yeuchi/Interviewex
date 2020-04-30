package com.ctyeung.Trie

class Trie {

    private var nodes: HashMap<Char, TrieNode> = HashMap<Char, TrieNode>()

    constructor(str: String = "") {
        if(str.length>0) {
            val c = str.get(0)
            val node = nodes[c]
            if (node != null)
                node.add(str)
            else
                nodes.put(c, TrieNode(str))
        }
    }

    fun remove(str: String): Boolean {
        val c = str.get(0)
        val node = nodes[c]
        if (node != null)
            return node.remove(str)

        return false
    }

    fun getAllWords(): ArrayList<String> {
        var arrayList = ArrayList<String>()

        val keys = nodes.keys
        for (key in keys) {
            val node = nodes[key]
            val list: ArrayList<String> = node!!.getAllWords("")
            arrayList.addAll(list)
        }
        return arrayList
    }

    fun isWordMatch(str: String): Boolean {
        val c = str.get(0)
        val node = nodes[c]
        if (node != null)
            return node.isWordMatch(str)

        return false
    }

    fun add(str:String) {
        val c = str.get(0)
        val node = nodes[c]
        if (node != null)
            return node.add(str)
    }
}
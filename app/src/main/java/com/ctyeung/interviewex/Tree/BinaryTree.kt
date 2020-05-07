package com.ctyeung.interviewex.Tree

class BinaryTree<T>(t:T):IComparable<T> {
    var item = t
    var left:BinaryTree<T>? = null
    var right:BinaryTree<T>? = null

    companion object {
        var hashMap = HashMap<Int, HashSet<Any>>()
    }

    fun insert(t:T):Boolean {
        // am I empty ?
        if(item == null){
            item = t
            return true
        }

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

    fun remove(t:T):Boolean {
        /*
         currently -- can't remove last node, unless we allow item == null
         
        // we found it !
        if (item == t) {
            // replace this with nearest smaller value
            if (left != null) {
                val max = left!!.findMax()
                item = max
                return left!!.remove(max)
            }
            else if(right !=null) {
                val min = right!!.findMin()
                item = min
                return right!!.remove(min)
            }

            // last empty child node -- should be deleted
            return true
        }
        else {
            // find and remove it from children
            var isRemoved = false
            if(left!=null) {
               isRemoved = left!!.remove(t)
            }
            if(!isRemoved && right != null)
                return right!!.remove(t)
        }
        // not found
        */
        return false
    }

    // create hash for each level of nodes
    fun initBFS(level:Int=0) {

        // root clears hashMap for initialization
        if(level == 0) {
            hashMap.clear()
        }

        // create/retrieve hashset for the level
        var hashSet:HashSet<Any>?=null
        if(hashMap.contains(level)) {
            hashSet = hashMap[level]
        }
        else {
            hashSet = HashSet<Any>()
            hashMap.put(level, hashSet)
        }

        // add this to hash
        hashSet!!.add(this)

        // recursion
        if(left != null)
            left!!.initBFS(level+1)

        if(right != null)
            right!!.initBFS(level+1)
    }

    // search tree by level
    fun breadthFirstSearch(t:T):Boolean {
        val keys = hashMap.keys
        for(key in keys) {
            val hashSet = hashMap[key]
            hashSet!!.forEach {
                val node = it as BinaryTree<T>
                if(node.item == t)
                    return true
            }
        }
        return false
    }

    fun depthFirstSearch(t:T):Boolean {
        if(item == t)
            return true

        if( left != null && left!!.depthFirstSearch(t) == true )
            return true

        if (right != null && right!!.depthFirstSearch(t) == true)
            return true

        return false
    }

    fun findMin():T {
        if(left != null)
            return left!!.findMin()

        else
            return item
    }

    fun findMax():T {
        if(right != null)
            return right!!.findMax()

        else
            return item
    }

    fun getAll():ArrayList<T> {
        var list = ArrayList<T>()

        if(left != null) {
            var listLeft = left!!.getAll()
            list.addAll(listLeft)
        }

        list.add(item)

        if (right != null) {
            var listRight = right!!.getAll()
            list.addAll(listRight)
        }

        return list
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
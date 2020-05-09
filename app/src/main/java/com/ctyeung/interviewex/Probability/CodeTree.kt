package com.ctyeung.interviewex.Probability

import com.ctyeung.interviewex.Tree.BinaryTree
import com.ctyeung.interviewex.Sort.Comparable

/*
 *           (root)          priority queue
 *           /    \
 *        (0)      (1)       store values on left leaf nodes (children)
 *       /  \     /   \
 *     (A)  (B) (0)   (1)
 *             /  \  /  \
 *           (C) (D)(0) (1)
 *
 * A : 00
 * B : 01
 * C : 100
 * D : 101
 */
open class CodeTree<T>(t:T?=null) {
    var item = t
    var left:CodeTree<T>? = null
    var right:CodeTree<T>? = null

    fun add(t:T) {
        if(left == null) {
            left = CodeTree()
            left!!.left = CodeTree(t)
            return
        }
        else if(left!!.right==null) {
            left!!.right = CodeTree(t)
            return
        }
        else if(right == null) {
            right = CodeTree()
        }
        right!!.add(t)
    }

    /*
     * retrieve the code value
     */
    fun code(t:T):ArrayList<Int>? {
        // assume root node is 'not' used !
        if(left!=null) {
            if (left!!.left!!.item == t) {
                var list = ArrayList<Int>()
                if(list!=null) {
                    list.add(0)
                    list.add(0)
                    return list
                }
            }
            else if (left!!.right!!.item == t) {
                var list = ArrayList<Int>()
                if(list!=null) {
                    list.add(0)
                    list.add(1)
                    return list
                }
            }
        }

        if(right!=null) {
            var list = right!!.code(t)
            if(list!=null) {
                list.add(0, 1)
                return list
            }
        }

        // not found
        return null
    }
}
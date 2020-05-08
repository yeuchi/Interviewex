package com.ctyeung.interviewex.Probability

import com.ctyeung.interviewex.Tree.BinaryTree
import com.ctyeung.interviewex.Sort.Comparable

class CodeTree<T>(t:T): Comparable() {

    var item = t
    var left:BinaryTree<T>? = null
    var right:BinaryTree<T>? = null

    /*
     * retrieve the code value
     */
    fun code(t:T):Long {
        return 1
    }
}
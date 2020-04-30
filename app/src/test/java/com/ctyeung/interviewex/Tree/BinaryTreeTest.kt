package com.ctyeung.interviewex.Tree

import org.junit.Test
import org.junit.Assert.*

class BinaryTreeTest {

    val TEST_NUM1 = 1
    val TEST_NUM2 = 2
    val TEST_NUM3 = 3
    val TEST_NUM4 = 4
    val TEST_NUM5 = 5

    @Test
    fun insert() {
        /*
         * Test some integers
         */
        var tree = BinaryTree<Int>(TEST_NUM5)
        val list = tree.getAll()
        assertEquals(list[0], TEST_NUM5)

        tree.insert(TEST_NUM3)
        tree.insert(TEST_NUM1)
        tree.insert(TEST_NUM2)
        tree.insert(TEST_NUM4)

        val numbers = tree.getAll()
        for(i in 0..numbers.size-1) {
            assertEquals(numbers[i], i + 1)
        }
    }

    @Test
    fun remove() {

    }

    @Test
    fun find() {

    }

    @Test
    fun findMin() {

    }

    @Test
    fun findMax() {

    }

    @Test
    fun getAll() {

    }
}
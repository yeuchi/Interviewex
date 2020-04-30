package com.ctyeung.interviewex.Tree

import org.junit.Test
import org.junit.Assert.*

/*
 * Happy path tests only
 */
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
    fun depthFirstSearch() {

    }

    @Test
    fun breadthFirstSearch() {

    }

    @Test
    fun findMin() {
        var tree = BinaryTree<Int>(TEST_NUM3)
        tree.insert(TEST_NUM5)
        tree.insert(TEST_NUM1)
        tree.insert(TEST_NUM4)
        tree.insert(TEST_NUM2)

        val min = tree.findMin()
        assertEquals(min, TEST_NUM1)
    }

    @Test
    fun findMax() {
        var tree = BinaryTree<Int>(TEST_NUM3)
        tree.insert(TEST_NUM5)
        tree.insert(TEST_NUM1)
        tree.insert(TEST_NUM4)
        tree.insert(TEST_NUM2)

        val min = tree.findMax()
        assertEquals(min, TEST_NUM5)
    }

    @Test
    fun getAll() {

    }
}
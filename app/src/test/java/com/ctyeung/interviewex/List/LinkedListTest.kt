package com.ctyeung.interviewex.List

import org.junit.Test
import org.junit.Assert.*

class LinkedListTest {
    val TEST_NUM1 = 1
    val TEST_NUM2 = 2
    val TEST_NUM3 = 3
    val TEST_NUM4 = 4
    val TEST_NUM5 = 5

    @Test
    fun count() {
        var list = LinkedList<Int>(TEST_NUM1)
        list.add(TEST_NUM2)
        list.add(TEST_NUM3)
        list.add(TEST_NUM4)
        list.add(TEST_NUM5)
        val count = list.count()
        assertEquals(count, 5)
    }

    @Test
    fun add() {
        var list = LinkedList<Int>(TEST_NUM1)
        assertEquals(list.item, TEST_NUM1)

        list.add(TEST_NUM2)
        val actual = list.next!!.item
        assertEquals(actual, TEST_NUM2)

        list.add(TEST_NUM3)
        val threeDeep = list.next!!.next!!.item
        assertEquals(threeDeep, TEST_NUM3)
    }

    @Test
    fun remove() {
        var list = LinkedList<Int>(TEST_NUM1)
        list.add(TEST_NUM2)
        list.add(TEST_NUM3)
        list.add(TEST_NUM4)

        list.remove(TEST_NUM4)
        val actual = list.tail()
        assertEquals(actual, TEST_NUM3)
        assertEquals(list.count(), 3)

        list.remove(TEST_NUM2)
        val third = list.tail()
        assertEquals(third, TEST_NUM3)
        assertEquals(list.count(), 2)

        list.remove(TEST_NUM3)
        val last = list.tail()
        assertEquals(last, TEST_NUM1)
        assertEquals(list.count(), 1)
    }

    @Test
    fun head() {
        var list = LinkedList<Int>(TEST_NUM1)
        list.add(TEST_NUM2)
        list.add(TEST_NUM3)
        list.add(TEST_NUM4)
        val actual = list.head()
        assertEquals(actual, TEST_NUM1)
    }

    @Test
    fun tail() {
        var list = LinkedList<Int>(TEST_NUM1)
        list.add(TEST_NUM2)
        list.add(TEST_NUM3)
        list.add(TEST_NUM4)
        val actual = list.tail()
        assertEquals(actual, TEST_NUM4)
    }
}
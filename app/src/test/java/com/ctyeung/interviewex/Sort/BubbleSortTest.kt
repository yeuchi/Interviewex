package com.ctyeung.interviewex.Sort

import org.junit.Test
import org.junit.Assert.*

class BubbleSortTest {

    val TEST_NUM1 = 1
    val TEST_NUM2 = 2
    val TEST_NUM3 = 3
    val TEST_NUM4 = 4
    val TEST_NUM5 = 5
    val TEST_NUM6 = 6

    @Test
    fun sort() {
        var list = arrayListOf<Int>(  TEST_NUM3,
                                        TEST_NUM1,
                                        TEST_NUM6,
                                        TEST_NUM4,
                                        TEST_NUM2,
                                        TEST_NUM5)

        var bubble = BubbleSort<Int>()
        bubble.sort(list)

        assertEquals(TEST_NUM1, list[0])
        assertEquals(TEST_NUM2, list[1])
        assertEquals(TEST_NUM3, list[2])
        assertEquals(TEST_NUM4, list[3])
        assertEquals(TEST_NUM5, list[4])
        assertEquals(TEST_NUM6, list[5])
    }
}
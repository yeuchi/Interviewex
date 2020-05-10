package com.ctyeung.interviewex.Sort

import org.junit.Assert.*
import org.junit.Test

class MergeSortTest {

    val TEST_NUM1 = 1
    val TEST_NUM2 = 2
    val TEST_NUM3 = 3
    val TEST_NUM4 = 4
    val TEST_NUM5 = 5
    val TEST_NUM6 = 6

    @Test
    fun sort() {
        var list = arrayListOf<Any>(TEST_NUM3,
                                    TEST_NUM1,
                                    TEST_NUM6,
                                    TEST_NUM4,
                                    TEST_NUM2,
                                    TEST_NUM5)

        var sorted = MergeSort.sort(list)

        assertEquals(TEST_NUM1, sorted[5])
        assertEquals(TEST_NUM2, sorted[4])
        assertEquals(TEST_NUM3, sorted[3])
        assertEquals(TEST_NUM4, sorted[2])
        assertEquals(TEST_NUM5, sorted[1])
        assertEquals(TEST_NUM6, sorted[0])
    }
}
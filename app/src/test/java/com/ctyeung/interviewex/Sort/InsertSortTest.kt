package com.ctyeung.interviewex.Sort

import org.junit.Test
import org.junit.Assert.*
import java.lang.Exception

class InsertSortTest {
    val TEST_NUM1 = 1
    val TEST_NUM2 = 2
    val TEST_NUM3 = 3
    val TEST_NUM4 = 4
    val TEST_NUM5 = 5
    val TEST_NUM6 = 6

    @Test
    fun insert() {
        var list = arrayListOf<Int>(  TEST_NUM3,
                                        TEST_NUM1,
                                        TEST_NUM6,
                                        TEST_NUM4,
                                        TEST_NUM4,
                                        TEST_NUM2,
                                        TEST_NUM5)
        var sort = InsertSort()
        sort.insert(list[0])
        sort.insert(list[1])
        sort.insert(list[2])
        sort.insert(list[3])
        sort.insert(list[4])
        sort.insert(list[5])
        sort.insert(list[6])

        assertEquals(TEST_NUM1, sort.list[0])
        assertEquals(TEST_NUM2, sort.list[1])
        assertEquals(TEST_NUM3, sort.list[2])
        assertEquals(TEST_NUM4, sort.list[3])
        assertEquals(TEST_NUM4, sort.list[4])
        assertEquals(TEST_NUM5, sort.list[5])
        assertEquals(TEST_NUM6, sort.list[6])
    }
}
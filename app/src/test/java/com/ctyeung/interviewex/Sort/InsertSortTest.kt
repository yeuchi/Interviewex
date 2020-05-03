package com.ctyeung.interviewex.Sort

import org.junit.Test
import org.junit.Assert.*
import java.lang.Exception

class InsertSortTest {

    @Test
    fun insert() {
        var sort = InsertSort()
        sort.insert(4)
        sort.insert(10)
        sort.insert(7)
        sort.insert(1)
        sort.insert(8)

        val len = sort.list.size-2
        for(i in 0..len) {
            val pre = sort.list[i]
            val post = sort.list[i+1]
            if(post > pre)
                throw Exception("failed")
        }
    }

    @Test
    fun remove() {

    }
}
package com.ctyeung.interviewex.List

import org.junit.Test
import org.junit.Assert.*

/*
 * Happy path tests only
 */
class LIFOTest {

    @Test
    fun push() {
        var stack = LIFO(1)
        stack.push(2)
        stack.push(3)
        stack.push(4)
        stack.push(5)

        val count = stack.count()
        assertEquals(count, 5)

        var j = 1
        for(i in stack.arrayList) {
            assertEquals(i, j++)
        }
    }

    @Test
    fun pop() {
        var stack = LIFO(1)
        stack.push(2)
        stack.push(3)
        stack.push(4)
        stack.push(5)

        for(i in 5 downTo 1) {
            val item = stack.pop()
            assertEquals(item, i)
        }
    }

    @Test
    fun count() {
        var stack = LIFO(1)
        stack.push(2)
        stack.push(3)
        stack.push(4)
        stack.push(5)

        stack.pop()
        stack.pop()

        val count = stack.count()

        assertEquals(count, 3)

    }
}
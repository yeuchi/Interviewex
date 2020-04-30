package com.ctyeung.interviewex.List


import org.junit.Test
import org.junit.Assert.*

/*
 * Happy path tests only
 */
class FIFOTest {

    @Test
    fun enqueue() {
        var queue = FIFO(1)
        queue.enqueue(2)
        queue.enqueue(3)
        queue.enqueue(4)
        queue.enqueue(5)

        val count = queue.count()
        assertEquals(count, 5)

        var j = 1
        for(i in queue.arrayList) {
            assertEquals(i, j++)
        }
    }

    @Test
    fun dequeue() {
        var queue = FIFO(1)
        queue.enqueue(2)
        queue.enqueue(3)
        queue.enqueue(4)
        queue.enqueue(5)

        for(i in 1..5) {
            val item = queue.dequeue()
            assertEquals(item, i)
        }
    }

    @Test
    fun count() {
        var queue = FIFO(1)
        queue.enqueue(2)
        queue.enqueue(3)
        queue.enqueue(4)
        queue.enqueue(5)

        queue.dequeue()
        queue.dequeue()

        val count = queue.count()

        assertEquals(count, 3)

    }
}
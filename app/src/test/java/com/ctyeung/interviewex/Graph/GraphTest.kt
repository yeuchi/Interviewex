package com.ctyeung.interviewex.Graph


import org.junit.Assert.*
import org.junit.Test

class GraphTest {

    val TEST_NUM1 = 1
    val TEST_NUM2 = 2
    val TEST_NUM3 = 3
    val TEST_NUM4 = 4
    val TEST_NUM5 = 5
    val TEST_NUM6 = 6

    @Test
    fun addEdge() {
        var graph = Graph<Int>()
        graph.addEdge(TEST_NUM1, TEST_NUM1)
        graph.addEdge(TEST_NUM1, TEST_NUM3)
        graph.addEdge(TEST_NUM1, TEST_NUM5)

        graph.addEdge(TEST_NUM2, TEST_NUM2)
        graph.addEdge(TEST_NUM2, TEST_NUM4)
        graph.addEdge(TEST_NUM2, TEST_NUM6)

        var oddSet:HashSet<Int>? = graph.hashmap[TEST_NUM1]
        assertEquals(TEST_NUM1, oddSet!!.elementAt(0))
        assertEquals(TEST_NUM3, oddSet!!.elementAt(1))
        assertEquals(TEST_NUM5, oddSet!!.elementAt(2))

        var evenSet:HashSet<Int>? = graph.hashmap[TEST_NUM2]
        assertEquals(TEST_NUM2, evenSet!!.elementAt(0))
        assertEquals(TEST_NUM4, evenSet!!.elementAt(1))
        assertEquals(TEST_NUM6, evenSet!!.elementAt(2))
    }
}
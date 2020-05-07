package com.ctyeung.interviewex.Graph


import org.junit.Assert.*
import org.junit.Test

class DijkstraShortPathTest {

    val TEST_VERTEX_A = "A"
    val TEST_VERTEX_B = "B"
    val TEST_VERTEX_C = "C"
    val TEST_VERTEX_D = "D"
    val TEST_VERTEX_E = "E"
    val TEST_VERTEX_F = "F"
    val TEST_VERTEX_G = "G"

    @Test
    fun getPath2() {
        val graph = createGraph()
        var dijkstra = DijkstraShortPath<String>(TEST_VERTEX_A, graph)

        // get itself
        val pathA = dijkstra.getPath2(TEST_VERTEX_A)
        assertEquals(0, pathA!!.size)

        // get connected vertexes
        getConnected(dijkstra)

        // get paths for multiple jumps
        getConnectedPaths(dijkstra)
    }

    private fun getConnected(dijkstra:DijkstraShortPath<String>) {
        val pathB = dijkstra.getPath2(TEST_VERTEX_B)
        assertEquals(1, pathB!!.size)
        assertEquals(TEST_VERTEX_B, pathB!![0])

        val pathC = dijkstra.getPath2(TEST_VERTEX_C)
        assertEquals(1, pathC!!.size)
        assertEquals(TEST_VERTEX_C, pathC!![0])
    }

    private fun getConnectedPaths(dijkstra:DijkstraShortPath<String>) {
        val pathD = dijkstra.getPath2(TEST_VERTEX_D)
        assertEquals(2, pathD!!.size)
        assertEquals(TEST_VERTEX_D, pathD!![1])

        val pathE = dijkstra.getPath2(TEST_VERTEX_E)
        assertEquals(3, pathE!!.size)
        assertEquals(TEST_VERTEX_E, pathE!![2])

        val pathF = dijkstra.getPath2(TEST_VERTEX_F)
        assertEquals(3, pathF!!.size)
        assertEquals(TEST_VERTEX_F, pathF!![2])

        val pathG = dijkstra.getPath2(TEST_VERTEX_G)
        assertEquals(4, pathG!!.size)
        assertEquals(TEST_VERTEX_G, pathG!![3])
    }

    private fun createGraph():Graph<String> {
        var graph = Graph<String>()
        graph.addEdge(TEST_VERTEX_A, TEST_VERTEX_B)
        graph.addEdge(TEST_VERTEX_A, TEST_VERTEX_C)

        graph.addEdge(TEST_VERTEX_B, TEST_VERTEX_A)
        graph.addEdge(TEST_VERTEX_B, TEST_VERTEX_C)
        graph.addEdge(TEST_VERTEX_B, TEST_VERTEX_D)

        graph.addEdge(TEST_VERTEX_C, TEST_VERTEX_A)
        graph.addEdge(TEST_VERTEX_C, TEST_VERTEX_B)
        graph.addEdge(TEST_VERTEX_C, TEST_VERTEX_D)

        graph.addEdge(TEST_VERTEX_D, TEST_VERTEX_B)
        graph.addEdge(TEST_VERTEX_D, TEST_VERTEX_C)
        graph.addEdge(TEST_VERTEX_D, TEST_VERTEX_E)
        graph.addEdge(TEST_VERTEX_D, TEST_VERTEX_F)

        graph.addEdge(TEST_VERTEX_E, TEST_VERTEX_D)
        graph.addEdge(TEST_VERTEX_E, TEST_VERTEX_F)
        graph.addEdge(TEST_VERTEX_E, TEST_VERTEX_G)

        graph.addEdge(TEST_VERTEX_F, TEST_VERTEX_D)
        graph.addEdge(TEST_VERTEX_F, TEST_VERTEX_E)
        graph.addEdge(TEST_VERTEX_F, TEST_VERTEX_G)

        graph.addEdge(TEST_VERTEX_G, TEST_VERTEX_E)
        graph.addEdge(TEST_VERTEX_G, TEST_VERTEX_F)

        return graph
    }
}
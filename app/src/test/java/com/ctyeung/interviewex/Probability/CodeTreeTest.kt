package com.ctyeung.interviewex.Probability

import org.junit.Assert.*
import org.junit.Test

class CodeTreeTest {

    val TEST_VERTEX_A = "A"
    val TEST_VERTEX_B = "B"
    val TEST_VERTEX_C = "C"
    val TEST_VERTEX_D = "D"
    val TEST_VERTEX_E = "E"
    val TEST_VERTEX_F = "F"
    val TEST_VERTEX_G = "G"

    @Test
    fun add() {
        var tree = CodeTree<String>()
        tree.add(TEST_VERTEX_A)
        tree.add(TEST_VERTEX_B)
        tree.add(TEST_VERTEX_C)
        tree.add(TEST_VERTEX_D)
        tree.add(TEST_VERTEX_E)
        tree.add(TEST_VERTEX_F)
        tree.add(TEST_VERTEX_G)

        assertEquals(TEST_VERTEX_A, tree.left!!.left!!.item)
        assertEquals(TEST_VERTEX_B, tree.left!!.right!!.item)
        assertEquals(TEST_VERTEX_C, tree.right!!.left!!.left!!.item)
        assertEquals(TEST_VERTEX_D, tree.right!!.left!!.right!!.item)
        assertEquals(TEST_VERTEX_E, tree.right!!.right!!.left!!.left!!.item)
        assertEquals(TEST_VERTEX_F, tree.right!!.right!!.left!!.right!!.item)
        assertEquals(TEST_VERTEX_G, tree.right!!.right!!.right!!.left!!.left!!.item)
    }

    @Test
    fun code() {
        var tree = CodeTree<String>()
        tree.add(TEST_VERTEX_A)
        tree.add(TEST_VERTEX_B)
        tree.add(TEST_VERTEX_C)
        tree.add(TEST_VERTEX_D)
        tree.add(TEST_VERTEX_E)
        tree.add(TEST_VERTEX_F)
        tree.add(TEST_VERTEX_G)

        val codeA = tree.code(TEST_VERTEX_A)
        assertEquals(arrayListOf(0,0), codeA)

        val codeB = tree.code(TEST_VERTEX_B)
        assertEquals(arrayListOf(0,1), codeB)

        val codeC = tree.code(TEST_VERTEX_C)
        assertEquals(arrayListOf(1,0,0), codeC)

        val codeD = tree.code(TEST_VERTEX_D)
        assertEquals(arrayListOf(1,0,1), codeD)

        val codeE = tree.code(TEST_VERTEX_E)
        assertEquals(arrayListOf(1,1,0,0), codeE)

        val codeF = tree.code(TEST_VERTEX_F)
        assertEquals(arrayListOf(1,1,0,1), codeF)

        val codeG = tree.code(TEST_VERTEX_G)
        assertEquals(arrayListOf(1,1,1,0,0), codeG)
    }
}
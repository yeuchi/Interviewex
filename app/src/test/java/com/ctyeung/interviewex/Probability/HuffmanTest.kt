package com.ctyeung.interviewex.Probability

import org.junit.Assert.*
import org.junit.Test

class HuffmanTest {

    val TEST_VERTEX_A = "A"
    val TEST_VERTEX_B = "B"
    val TEST_VERTEX_C = "C"
    val TEST_VERTEX_D = "D"
    val TEST_VERTEX_E = "E"
    val TEST_VERTEX_F = "F"
    val TEST_VERTEX_G = "G"

    @Test
    fun constructor() {
        val population = createPopulation()
        var huffman = Huffman<String>(population.histogram)

        /*
         * Test huffman code map
         * - highest probability string is represented by smallest code
         */
        assertEquals(arrayListOf(0,0), huffman.codeMap[TEST_VERTEX_G])
        assertEquals(arrayListOf(0,1), huffman.codeMap[TEST_VERTEX_F])
        assertEquals(arrayListOf(1,0,0), huffman.codeMap[TEST_VERTEX_E])
        assertEquals(arrayListOf(1,0,1), huffman.codeMap[TEST_VERTEX_D])
        assertEquals(arrayListOf(1,1,0,0), huffman.codeMap[TEST_VERTEX_C])
        assertEquals(arrayListOf(1,1,0,1), huffman.codeMap[TEST_VERTEX_B])
        assertEquals(arrayListOf(1,1,1,0,0), huffman.codeMap[TEST_VERTEX_A])
    }

    @Test
    fun bitLength() {
        val EXPECTED_BIT_COUNT = 7 * 2 +    // TEST_VERTEX_G - 00
                                 6 * 2 +    // TEST_VERTEX_F - 01
                                 5 * 3 +    // TEST_VERTEX_E - 100
                                 4 * 3 +    // TEST_VERTEX_D - 101
                                 3 * 4 +    // TEST_VERTEX_C - 1100
                                 2 * 4 +    // TEST_VERTEX_B - 1101
                                 1 * 5      // TEST_VERTEX_A - 11100

        val population = createPopulation()
        var huffman = Huffman<String>(population.histogram)
        val bitCount = huffman.bitLength(population.data)
        assertEquals(EXPECTED_BIT_COUNT, bitCount)
    }

    @Test
    fun encode() {
        val population = createPopulation()
        var huffman = Huffman<String>(population.histogram)
        val bitCount = huffman.bitLength(population.data)
        var byteLength = bitCount / 8
        if(bitCount % 8 != 0)
            byteLength ++

        val byteArray = huffman.encode(population.data, byteLength)
    }

    @Test
    fun decode() {

    }

    private fun createPopulation():Population<String> {
        val data = createDataSet()
        var population = Population<String>(data)
        return population
    }

    private fun createDataSet():ArrayList<String> {
        var data = ArrayList<String>()
        data.add(TEST_VERTEX_A)

        data.add(TEST_VERTEX_B)
        data.add(TEST_VERTEX_B)

        data.add(TEST_VERTEX_C)
        data.add(TEST_VERTEX_C)
        data.add(TEST_VERTEX_C)

        data.add(TEST_VERTEX_D)
        data.add(TEST_VERTEX_D)
        data.add(TEST_VERTEX_D)
        data.add(TEST_VERTEX_D)

        data.add(TEST_VERTEX_E)
        data.add(TEST_VERTEX_E)
        data.add(TEST_VERTEX_E)
        data.add(TEST_VERTEX_E)
        data.add(TEST_VERTEX_E)

        data.add(TEST_VERTEX_F)
        data.add(TEST_VERTEX_F)
        data.add(TEST_VERTEX_F)
        data.add(TEST_VERTEX_F)
        data.add(TEST_VERTEX_F)
        data.add(TEST_VERTEX_F)

        data.add(TEST_VERTEX_G)
        data.add(TEST_VERTEX_G)
        data.add(TEST_VERTEX_G)
        data.add(TEST_VERTEX_G)
        data.add(TEST_VERTEX_G)
        data.add(TEST_VERTEX_G)
        data.add(TEST_VERTEX_G)

        return data
    }
}
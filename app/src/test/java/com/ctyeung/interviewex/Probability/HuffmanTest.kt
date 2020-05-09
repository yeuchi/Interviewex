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
    fun encode() {

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
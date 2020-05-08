package com.ctyeung.interviewex.Probability


import org.junit.Assert.*
import org.junit.Test
import java.math.BigDecimal
import java.math.RoundingMode

class PopulationTest {

    val TEST_VERTEX_A = "A"
    val TEST_VERTEX_B = "B"
    val TEST_VERTEX_C = "C"
    val TEST_VERTEX_D = "D"
    val TEST_VERTEX_E = "E"
    val TEST_VERTEX_F = "F"
    val TEST_VERTEX_G = "G"

    @Test
    fun add() {
        val data = createDataSet()
        var population = Population<String>(data)
        assertEquals(1, population.histogram[TEST_VERTEX_A])
        assertEquals(2, population.histogram[TEST_VERTEX_B])
        assertEquals(3, population.histogram[TEST_VERTEX_C])
        assertEquals(4, population.histogram[TEST_VERTEX_D])
        assertEquals(5, population.histogram[TEST_VERTEX_E])
        assertEquals(6, population.histogram[TEST_VERTEX_F])
        assertEquals(7, population.histogram[TEST_VERTEX_G])

        val count:Float = (1 + 2 + 3 + 4 + 5 + 6 + 7).toFloat()
        assertEquals(count, population.data.count().toFloat())

        assertEquals(round(1.0/count), round(population.probability(TEST_VERTEX_A).toDouble()))
        assertEquals(round(2.0/count), round(population.probability(TEST_VERTEX_B).toDouble()))
        assertEquals(round(3.0/count), round(population.probability(TEST_VERTEX_C).toDouble()))
        assertEquals(round(4.0/count), round(population.probability(TEST_VERTEX_D).toDouble()))
        assertEquals(round(5.0/count), round(population.probability(TEST_VERTEX_E).toDouble()))
        assertEquals(round(6.0/count), round(population.probability(TEST_VERTEX_F).toDouble()))
        assertEquals(round(7.0/count), round(population.probability(TEST_VERTEX_G).toDouble()))
    }

    private fun round(number:Double):BigDecimal {
        val decimal = BigDecimal(number).setScale(5, RoundingMode.HALF_EVEN)
        return decimal
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
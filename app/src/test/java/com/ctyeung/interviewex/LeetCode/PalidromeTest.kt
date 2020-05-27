package com.ctyeung.interviewex.LeetCode

import org.junit.Assert
import org.junit.Test

class PalidromeTest {
    val WORD1 = "babab"
    val WORD2 = "cbbd"
    val WORD3 = "cbabcc"

    @Test
    fun longestPalindrome() {
        var test = Solution()

        val actual1 = test.longestPalindrome(WORD1)
        Assert.assertEquals("babab", actual1)

        val actual2 = test.longestPalindrome(WORD2)
        Assert.assertEquals("bb", actual2)
    }

    @Test
    fun almostPalindrome() {
        var test = Solution()

        var isTrue = test.almostPalindrome(WORD1)
        Assert.assertEquals(true, isTrue)

        isTrue = test.almostPalindrome(WORD3)
        Assert.assertEquals(true, isTrue)

        isTrue = test.almostPalindrome(WORD2)
        Assert.assertEquals(false, isTrue)
    }
}
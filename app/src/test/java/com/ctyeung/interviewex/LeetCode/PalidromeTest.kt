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

        // "babab" is a palindrome
        var isTrue = test.almostPalindrome(WORD1)
        Assert.assertEquals(true, isTrue)

        // Remove 1 character "cbab[c]c" -> cbabc
        isTrue = test.almostPalindrome(WORD3)
        Assert.assertEquals(true, isTrue)

        // "cbbd" has 2 invalid characters
        var isFalse = test.almostPalindrome(WORD2)
        Assert.assertEquals(false, isFalse)
    }
}
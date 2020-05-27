package com.ctyeung.interviewex.LeetCode

class Solution {
    /*
     * Given a string, determine if it meets following.
     * 1. is a palidrome [abba] -> return true
     * 2. is almost a palidrome [abbca] -> return true
     * 3. is NOT a palidrome [abbcca] -> return false
     *
     * Almost palidrome : allow at most 1 invalid character.
     * Upon removal of the invalid character, we have a palidrome
     */
    fun almostPalindrome(s:String, recurvise:Boolean=false):Boolean {
        var charArray = s.toCharArray()
        var i = 0
        var j = charArray.size-1

        // number of characters to consider
        var mid = s.length / 2
        if(s.length%2>0)
            mid+=1

        for(index in 0..mid) {
            val left = charArray[i]
            val right = charArray[j]

            if(left == right) {
                // still a palidrome
            }
            else {
                if(recurvise)
                    return false

                return lookAhead(i, j, charArray)
            }
            i ++
            j --
        }
        return true
    }

    fun lookAhead(i:Int, j:Int, charArray: CharArray):Boolean {
        // check left ahead
        var str = removeInvalidChar(i, charArray)
        val result = almostPalindrome(str, true)

        if(result == true)
            return true

        else {
            val str = removeInvalidChar(j, charArray)
            return almostPalindrome(str, true)
        }
    }

    fun removeInvalidChar(pos:Int, charArray: CharArray):String {
        var str:String = ""
        for (m in 0..charArray.size-1) {
            if(m==pos){
                // skip
            }
            else {
                str += charArray[m].toString()
            }
        }
        return str
    }

    /*
        5. Longest Palindromic Substring
        Medium
        5969
        488
        Add to List
        Share
        Given a string s, find the longest palindromic substring in s. You may assume that the maximum length of s is 1000.
        Example 1:
        Input: "babad"
        Output: "bab"
        Note: "aba" is also a valid answer.

        Example 2:
        Input: "cbbd"
        Output: "bb"
        // Applying brute force method
    */
    fun longestPalindrome(s: String): String {
        when(s.length) {
            0, 1 -> return s
            2 -> {
                if(s.get(0)==s.get(1))
                    return s

                else
                    return s.get(0).toString()
            }
            else -> {
                if(s == s.reversed())
                    return s

                var maxLength = 1
                var maxWord = s.get(0).toString()

                for(i in 0..s.length-1){
                    var subString = s.get(i).toString()
                    for(j in i+1..s.length-1){
                        val c = s.get(j)
                        subString += c

                        val reversed = subString.reversed()
                        //println("reversed:${reversed} subString:${subString}")
                        if(reversed == subString){
                            val len = reversed.length
                            if(maxLength < len){
                                maxLength = len
                                maxWord = subString
                            }
                        }
                    }
                }
                return maxWord
            }
        }
    }
}

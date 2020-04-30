package com.ctyeung.interviewex.Trie

import com.ctyeung.Trie.Trie
import org.junit.Test
import org.junit.Assert.*

/*
 * Happy path tests only
 */
class TrieTest {
    val TEST_STRING1 = "abcd1"
    val TEST_STRING2 = "abcd2"
    val TEST_STRING3 = "abcd3"

    @Test
    fun add() {
        val trie = Trie()
        val empty = trie.getAllWords()
        assertEquals(empty.size, 0)

        val trie1 = Trie(TEST_STRING1)
        val listOfone = trie1.getAllWords()
        assertEquals(listOfone[0], TEST_STRING1)
    }

    @Test
    fun isWordMatch() {
        val trie = Trie(TEST_STRING1)
        val isTrue = trie.isWordMatch(TEST_STRING1)
        assertEquals(isTrue, true)

        val isFalse = trie.isWordMatch(TEST_STRING2)
        assertEquals(isFalse, false)
    }

    @Test
    fun getAllWords() {
        val words = arrayListOf(TEST_STRING1, TEST_STRING2, TEST_STRING3)
        val trie = Trie(words[0])
        trie.add(words[1])
        trie.add(words[2])

        val list = trie.getAllWords()
        var i = 0
        for(word in list) {
            assertEquals(word, words[i++])
        }
    }

    @Test
    fun remove() {
        val trie = Trie(TEST_STRING1)
        trie.remove(TEST_STRING1)
        val list = trie.getAllWords()
        assertEquals(list.size, 0)
    }
}
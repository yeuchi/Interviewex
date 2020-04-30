package com.ctyeung.interviewex

import android.os.Bundle
import com.google.android.material.snackbar.Snackbar
import androidx.appcompat.app.AppCompatActivity
import android.view.Menu
import android.view.MenuItem
import com.ctyeung.interviewex.Sealed.Success
import com.ctyeung.interviewex.Sealed.handle
import com.ctyeung.Trie.Trie

import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        createSealed()
        createTries()
    }

    fun createSealed() {
        val success = Success<String>("woo hoo")
        handle(success)
    }

    fun createTries() {
        var trie: Trie = Trie("abc")
        trie.add("abd")
        val list = trie.getAllWords()

        var str:String = ""
        for(word in list) {
            str += " " + word
        }

        val result1 = trie.isWordMatch("abd")
        val result2 = trie.isWordMatch("abde")
    }
}

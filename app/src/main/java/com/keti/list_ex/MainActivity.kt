package com.keti.list_ex

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var testLsit = mutableListOf<String>()
        testLsit.add("a")
        testLsit.add("b")
        testLsit.add("c")

        Log.d("MainActivity",testLsit.toString())
        Log.d("MainActivity",testLsit[0])
        Log.d("MainActivity",testLsit[1])
    }
}
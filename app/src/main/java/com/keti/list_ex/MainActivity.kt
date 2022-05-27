package com.keti.list_ex

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.ListView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        /**
        var testLsit = mutableListOf<String>()
        testLsit.add("a")
        testLsit.add("b")
        testLsit.add("c")

        Log.d("MainActivity",testLsit.toString())
        Log.d("MainActivity",testLsit[0])
        Log.d("MainActivity",testLsit[1])

         */
        //MainActivity에서 listView를 Adapter로 넣어주는 과정

        val list_item = mutableListOf<ListViewModel>()

        list_item.add(ListViewModel("a","b"))
        list_item.add(ListViewModel("c","d"))
        list_item.add(ListViewModel("e","f"))

        val listView = findViewById<ListView>(R.id.mainlistview)

        val listAdapter = ListViewAdapter(list_item)
        listView.adapter = listAdapter
    }
}
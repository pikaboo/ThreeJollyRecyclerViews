package com.lenabru.recyclerviewtest

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {

    lateinit var column1: RecyclerView
    lateinit var column2: RecyclerView
    lateinit var column3: RecyclerView
    lateinit var adapter1: Adapter
    lateinit var adapter2: Adapter
    lateinit var adapter3: Adapter
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val column1Data = arrayListOf("Lena", "column1", "lala", "1", "2", "3", "1", "2", "3", "1", "2", "3", "1", "2", "3", "1", "2", "3")
        val column2Data = arrayListOf("Lena", "column2", "lala2", "11", "21", "31","11", "21", "31","11", "21", "31","11", "21", "31","11", "21", "31")
        val column3Data = arrayListOf("Lena", "column3", "lala3", "111", "211", "311","111", "211", "311","111", "211", "311","111", "211", "311","111", "211", "311")
        adapter1 = Adapter(column1Data)
        adapter2 = Adapter(column2Data)
        adapter3 = Adapter(column3Data)
        column1 = findViewById(R.id.firstColumn)
        column2 = findViewById(R.id.secondColumn)
        column3 = findViewById(R.id.thirdColumn)
        fun configRecyclerView(recyclerView: RecyclerView, adapter: Adapter) {
            recyclerView.layoutManager = LinearLayoutManager(this, RecyclerView.VERTICAL, false)
            recyclerView.adapter = adapter
        }
        configRecyclerView(column1, adapter1)
        configRecyclerView(column2, adapter2)
        configRecyclerView(column3, adapter3)
    }
}

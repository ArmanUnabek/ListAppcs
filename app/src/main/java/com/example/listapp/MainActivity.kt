package com.example.listapp

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val recyclerView: RecyclerView = findViewById(R.id.recyclerView)
        recyclerView.layoutManager = LinearLayoutManager(this)

        val countryList = listOf(
            Country("Vietnam", "98000000", R.drawable.flag_vietnam),
            Country("United States", "320000000", R.drawable.flag_usa),
            Country("Russia", "142000000", R.drawable.flag_russia)
        )

        val adapter = RecyclerAdapter(countryList)
        recyclerView.adapter = adapter
    }
}
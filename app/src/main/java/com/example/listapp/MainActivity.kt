package com.example.listapp

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.DividerItemDecoration
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.listapp.data.CountryData

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Инициализация RecyclerView
        val recyclerView: RecyclerView = findViewById(R.id.recyclerView)
        recyclerView.layoutManager = LinearLayoutManager(this)

        // Добавляем разделитель между элементами списка
        recyclerView.addItemDecoration(DividerItemDecoration(this, LinearLayoutManager.VERTICAL))

        // Включаем анимацию по умолчанию
        recyclerView.itemAnimator = androidx.recyclerview.widget.DefaultItemAnimator()

        // Получение списка стран из CountryData
        val countryList = CountryData.countries

        // Настройка адаптера
        val adapter = RecyclerAdapter(countryList)
        recyclerView.adapter = adapter
    }
}
package com.example.listapp.data

import com.example.listapp.Country
import com.example.listapp.R

object CountryData {
    val countries = listOf(
        Country("Vietnam", "98000000", R.drawable.flag_vietnam),
        Country("United States", "320000000", R.drawable.flag_usa),
        Country("Russia", "142000000", R.drawable.flag_russia),
        Country("China", "1400000000", R.drawable.flag_china)
    ).sortedBy { it.name }
}
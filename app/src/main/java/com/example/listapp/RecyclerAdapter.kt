package com.example.listapp

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import androidx.recyclerview.widget.RecyclerView

class RecyclerAdapter(private val countryList: List<Country>) :
    RecyclerView.Adapter<RecyclerAdapter.ViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view = LayoutInflater.from(parent.context)
            .inflate(R.layout.item_country, parent, false)
        return ViewHolder(view)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val country = countryList[position]
        holder.countryName.text = country.name
        holder.population.text = "Population: ${country.population}"
        holder.flagImage.setImageResource(country.flagResId)

        // Добавляем обработчик клика
        holder.itemView.setOnClickListener {
            Toast.makeText(
                holder.itemView.context,
                "You clicked on ${country.name}",
                Toast.LENGTH_SHORT
            ).show()
        }
    }

    override fun getItemCount(): Int {
        return countryList.size
    }

    class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val flagImage: ImageView = itemView.findViewById(R.id.flagImage)
        val countryName: TextView = itemView.findViewById(R.id.countryName)
        val population: TextView = itemView.findViewById(R.id.population)
    }
}
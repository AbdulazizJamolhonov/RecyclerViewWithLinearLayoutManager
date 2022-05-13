package com.example.homework13_1.adapders

import android.annotation.SuppressLint
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.homework13_1.R
import com.example.homework13_1.models.User
import kotlinx.android.synthetic.main.item_array.view.*
import kotlin.random.Random

class UserAdapter(private var list: List<User>) : RecyclerView.Adapter<UserAdapter.Vh>() {

    @SuppressLint("SetTextI18n")
    inner class Vh(itemView: View) : RecyclerView.ViewHolder(itemView) {
        fun onBind(user: User) {
            val r = Random.nextInt(100, 1000)
            val date = Random.nextInt(1, 30)
            var month = ""
            val year = Random.nextInt(1990, 2022)
            when (java.util.Random().nextInt(12)) {
                0 -> month = "January"
                1 -> month = "February"
                2 -> month = "March"
                3 -> month = "April"
                4 -> month = "May"
                5 -> month = "June"
                6 -> month = "July"
                7 -> month = "August"
                8 -> month = "September"
                9 -> month = "October"
                10 -> month = "November"
                11 -> month = "December"
            }
            itemView.item_name.text = user.name
            when (itemView.item_name.text) {
                "Apple" -> itemView.item_image.setImageResource(R.drawable.apple)
                "Bugatti" -> itemView.item_image.setImageResource(R.drawable.bugatti)
                "Play" -> itemView.item_image.setImageResource(R.drawable.play)
                "Windows" -> itemView.item_image.setImageResource(R.drawable.win_7)
                "Star" -> itemView.item_image.setImageResource(R.drawable.start)
            }
            itemView.item_views.text = "Views: $r"
            itemView.item_date.text = "$date $month $year"
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): Vh {
        return Vh(LayoutInflater.from(parent.context).inflate(R.layout.item_array, parent, false))
    }

    override fun onBindViewHolder(holder: Vh, position: Int) {
        holder.onBind(list[position])
    }

    override fun getItemCount(): Int = list.size
}
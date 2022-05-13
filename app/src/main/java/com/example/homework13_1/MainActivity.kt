package com.example.homework13_1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.homework13_1.adapders.UserAdapter
import com.example.homework13_1.models.User
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    private lateinit var list: ArrayList<User>
    private lateinit var userAdapter: UserAdapter
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        loadData()

        userAdapter = UserAdapter(list)
        rv.adapter = userAdapter
    }

    private fun loadData() {
        list = ArrayList()
            list.add(User(R.drawable.apple, "Apple"))
            list.add(User(R.drawable.bugatti, "Bugatti"))
            list.add(User(R.drawable.play, "Play"))
            list.add(User(R.drawable.win_7, "Windows"))
            list.add(User(R.drawable.start, "Star"))
    }
}
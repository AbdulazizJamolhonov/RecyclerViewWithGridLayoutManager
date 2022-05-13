package com.example.homework13_1

import android.graphics.Color
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.homework13_1.adapders.UserAdapter
import com.example.homework13_1.models.MyData
import com.example.homework13_1.models.User
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        loadData()

        val userAdapter = UserAdapter(MyData.myList)
        rv.adapter = userAdapter
    }

    private fun loadData() {
        MyData.myList = ArrayList()
        MyData.myList.add(User(Color.parseColor("#CE5E38"), R.drawable.ic_automotive, "Automotive"))
        MyData.myList.add(User(Color.parseColor("#A4622E"), R.drawable.ic_batteries, "Batteries"))
        MyData.myList.add(
            User(
                Color.parseColor("#B48B36"),
                R.drawable.ic_construction,
                "Construction"
            )
        )
        MyData.myList.add(
            User(
                Color.parseColor("#C0B23C"),
                R.drawable.ic_electronics,
                "Electronics"
            )
        )
        MyData.myList.add(User(Color.parseColor("#728E3E"), R.drawable.ic_garden, "Garden"))
        MyData.myList.add(User(Color.parseColor("#3B806C"), R.drawable.ic_glass, "Glass"))
        MyData.myList.add(User(Color.parseColor("#366F96"), R.drawable.ic_hazardous, "Hazardous"))
        MyData.myList.add(User(Color.parseColor("#215792"), R.drawable.ic_household, "Household"))
        MyData.myList.add(User(Color.parseColor("#513F67"), R.drawable.ic_metal, "Metal"))
        MyData.myList.add(User(Color.parseColor("#703960"), R.drawable.ic_paint, "Paint"))
        MyData.myList.add(User(Color.parseColor("#933D60"), R.drawable.ic_paper, "Paper"))
        MyData.myList.add(User(Color.parseColor("#B7544E"), R.drawable.ic_plastic, "Plastic"))
    }
}
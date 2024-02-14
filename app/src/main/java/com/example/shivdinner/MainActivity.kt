package com.example.shivdinner

import android.os.Bundle
import androidx.activity.ComponentActivity
import kotlinx.android.synthetic.main.activity_main.addfood
import kotlinx.android.synthetic.main.activity_main.SelectFood
import kotlinx.android.synthetic.main.activity_main.addfoodbutton
import kotlinx.android.synthetic.main.activity_main.desidebutton
import java.util.*

class MainActivity : ComponentActivity() {
    val foodlist = arrayListOf("Mahalaxmi","paneer","sarkari","didi","nilanga","80wala")

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        desidebutton.setOnClickListener {
            val random = java.util.Random()
            val randomFood =random.nextInt(foodlist.count())
            SelectFood.text=foodlist[randomFood]

        }
        addfoodbutton.setOnClickListener {
            val newFood = addfood.text.toString()
            if(newFood!=""){
            foodlist.add(newFood)}
            addfood.text.clear()
            println(foodlist)
        }






    }
}


package com.dimi.myapplicationgittesttt

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        println("prva verzija")
        println("druga verzija")
        println("treca verzija")
        var plant: Plant = Plant( "Ceercs", "sasasasa", "eastern redbud")
        println(plant.toString())
    }
}
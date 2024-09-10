package com.example.numerosaleatorios

import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import kotlin.random.Random

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btnGenerate: Button = findViewById(R.id.btnGenerate)
        val txtNumber: TextView = findViewById(R.id.txtNumber)

        btnGenerate.setOnClickListener {
            val randomNumber = Random.nextInt(0, 101)
            txtNumber.text = randomNumber.toString()
        }
    }
}

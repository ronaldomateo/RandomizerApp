package com.example.randomizerapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val rolled = findViewById<Button>(R.id.button)
        rolled.setOnClickListener {
            val intent = Intent(this, rollDice::class.java)

            startActivity(intent)
        }

        val flipCoin = findViewById<Button>(R.id.button2)
        flipCoin.setOnClickListener {
            val intent = Intent(this, coinFlipping::class.java)

            startActivity(intent)
        }
    }
}
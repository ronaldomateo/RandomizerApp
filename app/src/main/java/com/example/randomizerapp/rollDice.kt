package com.example.randomizerapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import kotlin.random.Random

class rollDice : AppCompatActivity() {

    lateinit var imageView: ImageView
    lateinit var button: Button

    var dice: IntArray = intArrayOf(
        R.drawable.alea_1,
        R.drawable.alea_2,
        R.drawable.alea_3,
        R.drawable.alea_4,
        R.drawable.alea_5,
        R.drawable.alea_6

    )

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_roll_dice)

        imageView = findViewById(R.id.imageView)
        button = findViewById(R.id.button3)

        button.setOnClickListener {
            var random = Random
            imageView.setImageResource(dice[random.nextInt(dice.size)])
        }

    }
}
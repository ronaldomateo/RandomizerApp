package com.example.randomizerapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import kotlin.random.Random

class coinFlipping : AppCompatActivity() {

    lateinit var imageView: ImageView
    lateinit var button: Button

    var coin: IntArray = intArrayOf(
        R.drawable.face,
        R.drawable.cross
    )

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_coin_flipping)

        imageView = findViewById(R.id.imageView2)
        button = findViewById(R.id.button4)

        button.setOnClickListener {
            var random = Random

            imageView.setImageResource(coin[random.nextInt(coin.size)])
        }

    }
}
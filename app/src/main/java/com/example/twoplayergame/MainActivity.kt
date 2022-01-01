package com.example.twoplayergame

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val button1: Button = findViewById(R.id.roll)
        val button2: Button = findViewById(R.id.button2)

        button1.setOnClickListener {
            val game1 = Intent(this@MainActivity, Game_1::class.java)
            startActivity(game1)
            Toast.makeText(this, "Roll The Dice!", Toast.LENGTH_SHORT).show()
        }

        button2.setOnClickListener {
            val game2 = Intent(this@MainActivity, Game_2::class.java)
            startActivity(game2)
            Toast.makeText(this, "Roll The Dice!", Toast.LENGTH_SHORT).show()
        }
    }
}
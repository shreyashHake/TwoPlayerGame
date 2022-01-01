package com.example.twoplayergame

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.Toast

class Game_2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_game2)
        val rollButton: Button = findViewById(R.id.roll1)
        rollButton.setOnClickListener {
            diceRoller()
            Toast.makeText(this, "Dice Rolled", Toast.LENGTH_SHORT).show()
        }
    }

    private fun diceRoller() {
        val dice = Dice(6)
        val diceRoll = dice.roll()
        val imageView: ImageView = findViewById(R.id.image)
        val drawableResource = when (diceRoll) {
            1 -> R.drawable.dice_1
            2 -> R.drawable.dice_2
            3 -> R.drawable.dice_3
            4 -> R.drawable.dice_4
            5 -> R.drawable.dice_5
            else -> R.drawable.dice_6
        }
        imageView.setImageResource(drawableResource)
        imageView.contentDescription = diceRoll.toString()
    }
}

class Dice(private val numberOfSides: Int) {
    fun roll(): Int {
        return (1..numberOfSides).random()
    }
}
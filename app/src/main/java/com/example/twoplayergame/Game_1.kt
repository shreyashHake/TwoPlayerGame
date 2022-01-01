package com.example.twoplayergame

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView

class Game_1 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_game1)
        val rollButton: Button = findViewById(R.id.roll)
        rollButton.setOnClickListener {
            val result1 : Int = rollDice1()
            val result2 : Int = rollDice2()
            declareWinner(result1, result2)
        }
    }

    private fun declareWinner(result1: Int, result2: Int) {
        val winnerText : TextView = findViewById(R.id.winner)
        if (result1 > result2) winnerText.text = getString(R.string.winMsg1)
        else if (result1 < result2) winnerText.text = getString(R.string.winMsg2)
        else winnerText.text = getString(R.string.winMsg3)
    }

    private fun rollDice1(): Int {
        val dice = Dice1(6)
        val diceRoll = dice.roll()
        val image: ImageView = findViewById(R.id.image1)
        val drawableResource = when (diceRoll) {
            1 -> R.drawable.dice_1
            2 -> R.drawable.dice_2
            3 -> R.drawable.dice_3
            4 -> R.drawable.dice_4
            5 -> R.drawable.dice_5
            else -> R.drawable.dice_6
        }
        image.setImageResource(drawableResource)
        image.contentDescription = diceRoll.toString()
        return diceRoll
    }

    private fun rollDice2(): Int {
        val dice = Dice1(6)
        val diceRoll = dice.roll()
        val image: ImageView = findViewById(R.id.image2)
        val drawableResource = when (diceRoll) {
            1 -> R.drawable.dice_1
            2 -> R.drawable.dice_2
            3 -> R.drawable.dice_3
            4 -> R.drawable.dice_4
            5 -> R.drawable.dice_5
            else -> R.drawable.dice_6
        }
        image.setImageResource(drawableResource)
        image.contentDescription = diceRoll.toString()
        return diceRoll
    }
}

class Dice1(private val numOfSides: Int) {
    fun roll(): Int {
        return (1..numOfSides).random()
    }
}
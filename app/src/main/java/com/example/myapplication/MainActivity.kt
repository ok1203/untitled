package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val resultText: TextView = findViewById(R.id.result_text)
        resultText.text = "Dice Rolled!"
        val rollButton: Button = findViewById(R.id.roll_button)
        rollButton.setOnClickListener { rollDice() }
        val rollButton2: Button = findViewById(R.id.roll_button2)
        rollButton2.setOnClickListener { addDice() }
    }

    var randomInt = 0

    private fun rollDice() {
        val resultText: TextView = findViewById(R.id.result_text)
        randomInt = (1..6).random()
        resultText.text = randomInt.toString()
    }
    private fun addDice() {
        val resultText: TextView = findViewById(R.id.result_text)
        var resultInt = when (randomInt) {
            6 -> 6
            else -> {
                randomInt.toString().toInt() + 1
            }
        }
    randomInt = resultInt
        resultText.text = resultInt.toString()
    }
}
package com.example.rolldice

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
// found the Button id and applied set on click listener and two functions to roll dices displaying in 2 views.
        val rollButton: Button = findViewById(R.id.button)
        rollButton.setOnClickListener {
            rollDice1()
            rollDice2()
        }
    }

// made the first dice roll function for 1 textview and to better organize the code made this
// separate fun to roll dice and the display the result in the first textview.
    private fun rollDice1() {

        val dice = Dice(6)
        val rollDice = dice.randomRoll()
        val resultTextView: TextView = findViewById(R.id.textView)
        resultTextView.text = rollDice.toString()

    }

    // similar to the one above, made a new fun for separate display of second textview.
    private fun rollDice2() {

        val dice = Dice(6)
        val rollDice = dice.randomRoll()
        val resultTextView: TextView = findViewById(R.id.textView2)
        resultTextView.text = rollDice.toString()
    }
}

/**
 * Defining the class of Dice which has the property to randomly roll the dice from 1..numSides to
 * generate random numbers.
 */
class Dice(private val numSides: Int) {

    fun randomRoll(): Int {
        return (1..numSides).random()
    }
}
package com.example.fromcodelab

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val rollButton = findViewById<Button>(R.id.rollButton)
        val SecondRoll = findViewById<Button>(R.id.rollButton2)
        rollButton.setOnClickListener { rollDice() }
        SecondRoll.setOnClickListener { secondRolled() }
    }
    // this is a basic function (method) that handles the toast message
    // here, we also changed the default text from hello world to Dice Has Changed

    private fun rollDice(){
        Toast.makeText(this, "This was Clicked", Toast.LENGTH_LONG).show()
        val ResultText = findViewById<TextView>(R.id.result_of_rolled)
        ResultText.text = "Dice Has Changed"

    }
    val RandomInt = (1..10).random()
    private fun secondRolled(){
        val SecondResult = findViewById<TextView>(R.id.number_of_rolled)
        SecondResult.text = RandomInt.toString()

    }
}
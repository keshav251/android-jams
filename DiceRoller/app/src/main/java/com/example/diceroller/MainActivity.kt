package com.example.diceroller

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.*

class MainActivity : AppCompatActivity() {
    lateinit var diceImage : ImageView
    lateinit var diceImage2 : ImageView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        diceImage = findViewById(R.id.dice_image)
        diceImage2 = findViewById(R.id.dice_image_2)
        val rollButton: Button = findViewById(R.id.roll_button)
        rollButton.setOnClickListener { rollDice() }
        val clearButton: Button = findViewById(R.id.clear_button)
        clearButton.setOnClickListener{clear()}

       // val resultText: TextView = findViewById(R.id.result_text)
      //  val countButton: Button = findViewById(R.id.button)
      //  countButton.setOnClickListener { countUp() }


        // resultText.text = "Dice Rolled!"


    }


    private fun getRandomDiceImage(): Int{
        val randomInt = (1..6).random()
        return  when (randomInt) {
            1 -> R.drawable.dice_1
            2 -> R.drawable.dice_2
            3 -> R.drawable.dice_3
            4 -> R.drawable.dice_4
            5 -> R.drawable.dice_5
            else -> R.drawable.dice_6
        }
    }
    private fun clear(){
        diceImage.setImageResource(R.drawable.empty_dice)
        diceImage2.setImageResource(R.drawable.empty_dice)
    }
    private fun rollDice() {
        //Toast.makeText(this, "button clicked",
        //  Toast.LENGTH_SHORT).show()
       // val resultText: TextView = findViewById(R.id.result_text)

        //val randomInt = (1..6).random()
        //resultText.text = randomInt.toString()

 /*       val drawableResource = when (randomInt) {
            1 -> R.drawable.dice_1
            2 -> R.drawable.dice_2
            3 -> R.drawable.dice_3
            4 -> R.drawable.dice_4
            5 -> R.drawable.dice_5
            else -> R.drawable.dice_6
        }*/
        diceImage.setImageResource(getRandomDiceImage())
        diceImage2.setImageResource(getRandomDiceImage())

    }

/*    private fun countUp() {
        //val resultText: TextView = findViewById(R.id.result_text)
        val diceImage: ImageView = findViewById(R.id.dice_image)
        if (resultText.text == "Hello World!") {
            resultText.text = "1"
        } else {
            var result = resultText.text.toString().toInt()
            if (result < 6) {
                result++
                resultText.text = result.toString()
            }
        }
    }*/
}
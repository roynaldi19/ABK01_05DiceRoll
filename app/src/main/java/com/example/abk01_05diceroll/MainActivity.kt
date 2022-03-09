package com.example.abk01_05diceroll

import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.example.abk01_05diceroll.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var activityMainBinding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        activityMainBinding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(activityMainBinding.root)

        //lempar dadu pertama saat aplikasi di buka
        rollDice()

        activityMainBinding.btnRoll.setOnClickListener {
            rollDice()
            Toast.makeText(this, "Dice Rolled!", Toast.LENGTH_SHORT).show()
        }
    }

    private fun rollDice() {
        val dice = Dice(6)
        when (dice.roll()) {
            1 -> activityMainBinding.imgRoll.setImageResource(R.drawable.dice_1)
            2 -> activityMainBinding.imgRoll.setImageResource(R.drawable.dice_2)
            3 -> activityMainBinding.imgRoll.setImageResource(R.drawable.dice_3)
            4 -> activityMainBinding.imgRoll.setImageResource(R.drawable.dice_4)
            5 -> activityMainBinding.imgRoll.setImageResource(R.drawable.dice_5)
            6 -> activityMainBinding.imgRoll.setImageResource(R.drawable.dice_6)
        }
    }
}

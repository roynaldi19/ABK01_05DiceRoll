package com.example.abk01_05diceroll

class Dice(private val numSides: Int) {
    fun roll(): Int {
        return (1..numSides).random()
    }
}
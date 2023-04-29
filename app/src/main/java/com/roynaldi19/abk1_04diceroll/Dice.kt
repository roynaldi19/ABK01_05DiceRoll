package com.roynaldi19.abk1_04diceroll

class Dice(private val numSides: Int) {
    fun roll(): Int {
        return (1..numSides).random()
    }
}
package com.roynaldi19.gd1_01diceroll

class Dice(private val numSides: Int) {
    fun roll(): Int {
        return (1..numSides).random()
    }
}
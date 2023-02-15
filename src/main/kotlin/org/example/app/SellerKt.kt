package org.example.app

import org.example.app.Category.APPRENTICE
import org.example.app.Category.NEWBIE
import org.example.app.Category.SEMI_SENIOR
import org.example.app.Category.SENIOR

abstract class SellerKt(
    val name: String,
    var sells: Int,
) {
    protected var points: Int = 0
    protected var category: Category = NEWBIE

    fun displayInfo() =
        let {
            calculatePoints()
            recategorize()
            displayData()
        }

    fun sell() {
        sells++
    }

    abstract fun calculatePoints()

    private fun recategorize() =
        when {
            points.lessThan(20) -> category = NEWBIE
            points.betweenOf(20, 30) -> category = APPRENTICE
            points.betweenOf(31, 40) -> category = SEMI_SENIOR
            points.greaterThan(41) -> category = SENIOR
            else -> Unit
        }

    private fun displayData() {
        println("Name: $name")
        println("Points: $points")
        println("Category: $category")
    }


    private fun Int.lessThan(value: Int) = this < value
    private fun Int.greaterThan(value: Int) = this > value
    private fun Int.betweenOf(bottom: Int, top: Int) = this in bottom..top

}
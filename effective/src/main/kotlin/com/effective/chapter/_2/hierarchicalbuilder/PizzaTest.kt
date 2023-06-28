package com.effective.chapter._2.hierarchicalbuilder

object PizzaTest {
    @JvmStatic
    fun main(args: Array<String>) {
        val pizza = NyPizza(
            toppings = setOf(Topping.SAUSAGE, Topping.ONION),
            size = NyPizza.Size.SMALL
        )
        val calzone = Calzone(
            toppings = setOf(Topping.HAM),
            sauceInside = true
        )
        println(pizza)
        println(calzone)
    }
}
package com.effective.chapter._2.hierarchicalbuilder

enum class Topping {
    HAM,
    MUSHROOM,
    ONION,
    PEPPER,
    SAUSAGE
}

abstract class Pizza(val toppings: Set<Topping>)
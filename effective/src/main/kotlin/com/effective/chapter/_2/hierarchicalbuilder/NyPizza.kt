package com.effective.chapter._2.hierarchicalbuilder

class NyPizza(
    toppings: Set<Topping>,
    val size: Size
) : Pizza(toppings) {

    enum class Size {
        SMALL,
        MEDIUM,
        LARGE
    }

    override fun toString() = "$toppings 로 토핑한 뉴욕 피자"
}
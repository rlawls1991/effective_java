package com.effective.chapter._2.hierarchicalbuilder

class Calzone(
    toppings: Set<Topping>,
    val sauceInside: Boolean = false
) : Pizza(toppings) {

    override fun toString() =
        "${toppings}로 토핑한 칼초네 피자 (소스는 ${if (sauceInside) "안" else "바깥"}에)"
}
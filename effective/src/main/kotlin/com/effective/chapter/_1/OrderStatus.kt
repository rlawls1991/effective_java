package com.effective.chapter._1


enum class OrderStatus(private val number: Int) {
    PREPARING(0),
    SHIPPED(1),
    DELIVERING(2),
    DELIVERED(3)
}
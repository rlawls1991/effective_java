package com.effective.chapter._1


object ListQuiz {
    @JvmStatic
    fun main(args: Array<String>) {
        val numbers: ArrayList<Any?> = ArrayList()
        numbers.add(100)
        numbers.add(20)
        numbers.add(44)
        numbers.add(3)
        println(numbers)
        val desc = numbers.sortByDescending { number -> number as Comparable<Any> }
        println(numbers)
    }
}
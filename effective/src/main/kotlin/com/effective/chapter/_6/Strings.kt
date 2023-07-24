package com.effective.chapter._6


object Strings {
    @JvmStatic
    fun main(args: Array<String>) {
        val hello = "hello"

        //TODO 이 방법은 권장하지 않습니다.
        val hello2 = "hello"
        val hello3 = "hello"
        println(hello === hello2)
        println(hello == hello2)
        println(hello === hello3)
        println(hello == hello3)
    }
}


package com.effective.chapter._4


object DefaultUtilityClass {
    fun hello(): String {
        return UtilityClass.hello()
    }

    @JvmStatic
    fun main(args: Array<String>) {
        hello()
    }
}

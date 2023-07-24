package com.effective.chapter._6

import java.util.regex.Pattern


object RegularExpression {
    private val SPLIT_PATTERN = Pattern.compile(",")

    @JvmStatic
    fun main(args: Array<String>) {
        val start = System.nanoTime()
        for (j in 0..9999) {
            val name = "keesun,whiteship"
            name.split(",".toRegex()).dropLastWhile { it.isEmpty() }.toTypedArray()
            //            SPLIT_PATTERN.split(name);
        }
        println(System.nanoTime() - start)
    }
}
package com.effective.chapter._6

import java.util.regex.Pattern


object RomanNumerals {
    // 코드 6-1 성능을 훨씬 더 끌어올릴 수 있다!
    private fun isRomanNumeralSlow(s: String): Boolean {
        return s.matches("^(?=.)M*(C[MD]|D?C{0,3})(X[CL]|L?X{0,3})(I[XV]|V?I{0,3})$".toRegex())
    }

    // 코드 6-2 값비싼 객체를 재사용해 성능을 개선한다.
    private val ROMAN = Pattern.compile(
        "^(?=.)M*(C[MD]|D?C{0,3})(X[CL]|L?X{0,3})(I[XV]|V?I{0,3})$"
    )

    fun isRomanNumeralFast(s: String): Boolean {
        return ROMAN.matcher(s).matches()
    }

    @JvmStatic
    fun main(args: Array<String>) {
        var result = false
        val start = System.nanoTime()
        for (j in 0..99) {
            //TODO 성능 차이를 확인하려면 xxxSlow 메서드를 xxxFast 메서드로 바꿔 실행해보자.
//            result = isRomanNumeralFast("MCMLXXVI")
            result = isRomanNumeralSlow("MCMLXXVI")
        }
        val end = System.nanoTime()
        println(end - start)
        println(result)
    }
}



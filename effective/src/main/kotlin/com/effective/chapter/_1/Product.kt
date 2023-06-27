package com.effective.chapter._1

import java.lang.Boolean
import java.util.*
import kotlin.Array
import kotlin.String


object Product {
    @JvmStatic
    fun main(args: Array<String>) {
        /*
            2. 호출될 때마다 인스턴스를 새로 생성하지 않아도 된다.
            참고) 코틀린에서 싱글톤 패턴은 object로 사용하면 편하게 사용이 가능하다
         */
        val settings1 = Settings
        val settings2 = Settings
        println(settings1)
        println(settings2)
        println(settings1 == settings1) // 둘의 객체가 같으면 true
        Boolean.valueOf(false)
        /*
            4. 입력 매개변수에 따라 매번 다른 클래스의 객체를 반환할 수 있다.
         */
        EnumSet.allOf(Difficulty::class.java)
    }
}
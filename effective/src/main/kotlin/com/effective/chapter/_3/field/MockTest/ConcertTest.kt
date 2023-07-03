package com.effective.chapter._3.field.MockTest

import com.effective.chapter._3.field.Concert

object ConcertTest {
    @JvmStatic
    fun main(args: Array<String>) {
        val concert = Concert(MockElvis())
        concert.perform()

        println(concert.isLightsOn())
        println(concert.isMainStageOpen())
    }
}

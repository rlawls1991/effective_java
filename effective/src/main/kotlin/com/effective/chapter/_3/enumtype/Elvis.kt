package com.effective.chapter._3.enumtype


enum class Elvis {
    INSTANCE;

    fun leaveTheBuilding() {
        println("기다려 자기야, 지금 나갈께!")
    }

    companion object {
        // 이 메서드는 보통 클래스 바깥(다른 클래스)에 작성해야 한다!
        @JvmStatic
        fun main(args: Array<String>) {
            val elvis = INSTANCE
            elvis.leaveTheBuilding()
        }
    }
}

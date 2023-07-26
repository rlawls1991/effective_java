package com.effective.chapter._07.reference

import java.lang.ref.SoftReference


object SoftReferenceExample {
    @Throws(InterruptedException::class)
    @JvmStatic
    fun main(args: Array<String>) {
        var strong: Any? = Any()
        val soft = SoftReference(strong)
        strong = null
        System.gc()
        Thread.sleep(3000L)

        // TODO 거의 안 없어집니다.
        //  왜냐면 메모리가 충분해서.. 굳이 제거할 필요가 없으니까요.
        println(soft.get())
    }
}


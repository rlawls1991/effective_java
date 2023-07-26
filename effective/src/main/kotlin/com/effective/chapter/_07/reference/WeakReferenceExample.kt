package com.effective.chapter._07.reference

import java.lang.ref.WeakReference


object WeakReferenceExample {
    @Throws(InterruptedException::class)
    @JvmStatic
    fun main(args: Array<String>) {
        var strong: Any? = Any()
        val weak = WeakReference(strong)
        strong = null
        System.gc()
        Thread.sleep(3000L)

        // TODO 거의 없어집니다.
        //  왜냐면 약하니까(?)...
        println(weak.get())
    }
}
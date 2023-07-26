package com.effective.chapter._07.reference

import java.lang.ref.ReferenceQueue

object PhantomReferenceExample {
    @Throws(InterruptedException::class)
    @JvmStatic
    fun main(args: Array<String>) {
        var strong: BigObject? = BigObject()
        val rq: ReferenceQueue<BigObject> = ReferenceQueue<BigObject>()
        val phantom: BigObjectReference<BigObject> = BigObjectReference(strong!!, rq)

        strong = null

        System.gc()
        Thread.sleep(3000L)

        // TODO 팬텀은 유령이니까..
        // 죽었지만.. 사라지진 않고 큐에 들어간다
        println(phantom.isEnqueued)

        var reference = rq.poll()
        while (reference != null) {
            val bigObjectCleaner = reference as BigObjectReference
            bigObjectCleaner.cleanUp()
            reference.clear()
            // 아래 코드가 마지막으로 등장해야 함
            reference = rq.poll()
        }
    }
}
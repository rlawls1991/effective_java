package com.effective.chapter._07.executor

import java.util.concurrent.Callable
import java.util.concurrent.ExecutionException
import java.util.concurrent.Executors


object ExecutorsExample {
    @Throws(ExecutionException::class, InterruptedException::class)
    @JvmStatic
    fun main(args: Array<String>) {
        val service = Executors.newFixedThreadPool(10)
        val submit = service.submit(Task())
        println(Thread.currentThread().toString() + " hello")
        println(submit.get())
        service.shutdown()
    }

    internal class Task : Callable<String> {
        @Throws(Exception::class)
        override fun call(): String {
            Thread.sleep(2000L)
            return Thread.currentThread().toString() + " world"
        }
    }
}

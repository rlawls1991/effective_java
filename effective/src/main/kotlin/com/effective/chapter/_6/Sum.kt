package com.effective.chapter._6


object Sum {
    private fun sum(): Long {
        // TODO Long을 long으로 변경하여 실행해 보세요.
        var sum = 0L
        for (i in 0..Int.MAX_VALUE) sum += i
        return sum
    }

    @JvmStatic
    fun main(args: Array<String>) {
        val start = System.nanoTime()
        val x = sum()
        val end = System.nanoTime()
        println(((end - start) / 1000000.0).toString() + " ms.")
        println(x)
    }
}

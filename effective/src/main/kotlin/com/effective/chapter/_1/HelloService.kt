package com.effective.chapter._1


interface HelloService {
    fun hello(): String
    fun bye(): String {
        return "bye"
    }

    companion object {
        fun hi(): String {
            prepareMessage()
            return "hi"
        }

        private fun prepareMessage() {}
        fun hi1(): String {
            prepareMessage()
            return "hi"
        }

        fun hi2(): String {
            prepareMessage()
            return "hi"
        }
    }
}


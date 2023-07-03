package com.effective.chapter._3.field

import java.io.Serializable


class Elvis private constructor() : IElvis, Serializable {
    init {
        if (created) {
            throw UnsupportedOperationException("can't be created by constructor.")
        }
        created = true
    }

    override fun leaveTheBuilding() {
        println("Whoa baby, I'm outta here!")
    }

    override fun sing() {
        println("I'll have a blue~ Christmas without you~")
    }

    private fun readResolve(): Elvis {
        return INSTANCE
    }

    companion object {
        /**
         * 싱글톤 오브젝트
         */
        private var created: Boolean = false
        val INSTANCE: Elvis by lazy { Elvis() }

        @JvmStatic
        fun main(args: Array<String>) {
            val elvis = INSTANCE
            elvis.leaveTheBuilding()
            elvis.sing()
        }
    }
}

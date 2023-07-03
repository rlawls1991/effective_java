package com.effective.chapter._3.field


object ElvisReflection {
    @JvmStatic
    fun main(args: Array<String>) {
        try {
            val defaultConstructor = Elvis::class.java.getDeclaredConstructor()
            defaultConstructor.isAccessible = true
            val elvis1 = defaultConstructor.newInstance()
            val elvis2 = defaultConstructor.newInstance()
            Elvis.INSTANCE.sing()
        } catch (e: Exception) {
            e.printStackTrace()
        }
    }
}

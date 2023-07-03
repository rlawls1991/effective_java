package com.effective.chapter._3.enumtype


object EnumElvisReflection {
    @JvmStatic
    fun main(args: Array<String>) {
        try {
            val declaredConstructor = Elvis::class.java.getDeclaredConstructor()
            println(declaredConstructor)
        } catch (e: NoSuchMethodException) {
            e.printStackTrace()
        }
    }
}

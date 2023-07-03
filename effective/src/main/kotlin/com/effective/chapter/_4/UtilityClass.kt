package com.effective.chapter._4


object UtilityClass {
    /**
     * 이 클래스는 인스턴스를 만들 수 없습니다.
     */
    //    private UtilityClass() {
    //        throw new AssertionError();
    //    }
    fun hello(): String {
        return "hello"
    }

    @JvmStatic
    fun main(args: Array<String>) {
        val hello = hello()
        val utilityClass = UtilityClass
        hello()
    }
}

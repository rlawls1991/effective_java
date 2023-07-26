package com.effective.chapter._07.stack

import java.util.*

// 코드 7-1 메모리 누수가 일어나는 위치는 어디인가? (36쪽)
class Stack {
    private var elements: Array<Any?>
    private var size = 0

    init {
        elements = arrayOfNulls(DEFAULT_INITIAL_CAPACITY)
    }

    fun push(e: Any?) {
        ensureCapacity()
        elements[size++] = e
    }
    //    public Object pop() {
    //        if (size == 0)
    //            throw new EmptyStackException();
    //        return elements[--size];
    //    }
    /**
     * 원소를 위한 공간을 적어도 하나 이상 확보한다.
     * 배열 크기를 늘려야 할 때마다 대략 두 배씩 늘린다.
     */
    private fun ensureCapacity() {
        if (elements.size == size) elements = Arrays.copyOf(elements, 2 * size + 1)
    }

    // 코드 7-2 제대로 구현한 pop 메서드 (37쪽)
    fun pop(): Any? {
        if (size == 0) throw EmptyStackException()
        val result = elements[--size]
        elements[size] = null // 다 쓴 참조 해제
        return result
    }

    companion object {
        private const val DEFAULT_INITIAL_CAPACITY = 16

        @JvmStatic
        fun main(args: Array<String>) {
            val stack = Stack()
            for (arg in args) stack.push(arg)
            while (true) System.err.println(stack.pop())
        }
    }
}


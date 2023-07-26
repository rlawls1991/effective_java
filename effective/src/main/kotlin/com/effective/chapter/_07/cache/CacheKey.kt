package com.effective.chapter._07.cache

import java.time.LocalDateTime


class CacheKey(private val value: Int) {
    val created: LocalDateTime

    init {
        created = LocalDateTime.now()
    }

    override fun equals(o: Any?): Boolean {
        return value == o
    }

    override fun hashCode(): Int {
        return value.hashCode()
    }

    override fun toString(): String {
        return "CacheKey{" +
                "value=" + value +
                ", created=" + created +
                '}'
    }
}


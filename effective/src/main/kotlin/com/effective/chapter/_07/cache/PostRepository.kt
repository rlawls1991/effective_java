package com.effective.chapter._07.cache

import java.util.*


class PostRepository {
    private val cache: MutableMap<CacheKey, Post>

    init {
        cache = WeakHashMap()
    }

    fun getPostById(key: CacheKey): Post? {
        return if (cache.containsKey(key)) {
            cache[key]
        } else {
            // TODO DB에서 읽어오거나 REST API를 통해 읽어올 수 있습니다.
            val post = Post()
            cache[key] = post
            post
        }
    }

    fun getCache(): Map<CacheKey, Post> {
        return cache
    }
}
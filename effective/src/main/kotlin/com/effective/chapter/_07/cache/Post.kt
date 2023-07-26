package com.effective.chapter._07.cache


class Post {
    var id: Int? = null
    var title: String? = null
    var content: String? = null

    fun finalize() {
        println("gc called")
    }
}

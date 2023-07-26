package com.effective.chapter._07.listener

import java.lang.ref.WeakReference
import java.util.*


class ChatRoom {
    private val users: MutableList<WeakReference<User>>

    init {
        users = ArrayList()
    }

    fun addUser(user: User) {
        users.add(WeakReference(user))
    }

    fun sendMessage(message: String?) {
        users.forEach { wr -> Objects.requireNonNull(wr.get()?.receive(message)) }
    }


    fun getUsers(): List<WeakReference<User>> {
        return users
    }
}



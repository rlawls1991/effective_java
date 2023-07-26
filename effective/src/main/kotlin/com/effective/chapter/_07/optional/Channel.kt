package com.effective.chapter._07.optional

import java.util.*


class Channel {
    private val numOfSubscribers = 0
    fun defaultMemberShip(): Optional<MemberShip> {
        return if (numOfSubscribers < 2000) {
            Optional.empty()
        } else {
            Optional.of(MemberShip())
        }
    }
}
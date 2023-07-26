package com.effective.chapter._07.optional

import org.junit.jupiter.api.Test


internal class ChannelTest {
    @Test
    fun npe() {
        val channel = Channel()
        val optional = channel.defaultMemberShip()
        optional.ifPresent(MemberShip::hello)
    }
}
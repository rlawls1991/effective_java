package com.effective.chapter._3.field.MockTest

import com.effective.chapter._3.field.IElvis


class MockElvis : IElvis {
    override fun leaveTheBuilding() {}
    override fun sing() {
        println("You ain't nothin' but a hound dog.")
    }
}

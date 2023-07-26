package com.effective.chapter._07.reference

import java.lang.ref.PhantomReference
import java.lang.ref.ReferenceQueue


class BigObjectReference<BigObject>(referent: BigObject, q: ReferenceQueue<in BigObject>) :
    PhantomReference<BigObject>(referent, q) {
    fun cleanUp() {
        println("clean up")
    }
}


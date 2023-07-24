package com.effective.chapter._6


class Deprecation {

    @Deprecated(
        """in favor of
      {@link #Deprecation(String)}"""
    )
    constructor()

    private var name: String? = null

    constructor(name: String?) {
        this.name = name
    }
}


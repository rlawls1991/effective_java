package com.effective.chapter._5


interface Dictionary {
    operator fun contains(word: String): Boolean
    fun closeWordsTo(typo: String): List<String>?
}


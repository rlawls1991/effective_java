package com.effective.chapter._5


class DefaultDictionary : Dictionary {
    override operator fun contains(word: String): Boolean {
        return false
    }

    override fun closeWordsTo(typo: String): List<String>? {
        return null
    }
}


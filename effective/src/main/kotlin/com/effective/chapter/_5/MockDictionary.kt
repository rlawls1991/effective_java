package com.effective.chapter._5


class MockDictionary : Dictionary {
    override fun contains(word: String): Boolean {
        return false
    }

    override fun closeWordsTo(typo: String): List<String>? {
        return null
    }
}


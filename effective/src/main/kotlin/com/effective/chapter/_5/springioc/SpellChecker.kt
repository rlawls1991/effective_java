package com.effective.chapter._5.springioc

import com.effective.chapter._5.Dictionary
import org.springframework.stereotype.Component

@Component
class SpellChecker(dictionary: Dictionary) {
    private val dictionary: Dictionary

    init {
        this.dictionary = dictionary
    }

    fun isValid(word: String): Boolean {
        // TODO 여기 SpellChecker 코드
        return dictionary.contains(word)
    }

    fun suggestions(typo: String): List<String> {
        // TODO 여기 SpellChecker 코드
        return dictionary.closeWordsTo(typo)!!
    }
}


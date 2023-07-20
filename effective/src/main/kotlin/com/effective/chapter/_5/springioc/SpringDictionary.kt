package com.effective.chapter._5.springioc

import com.effective.chapter._5.Dictionary
import org.springframework.stereotype.Component


@Component
class SpringDictionary : Dictionary {
    override operator fun contains(word: String): Boolean {
        println("contains $word")
        return false
    }

    override fun closeWordsTo(typo: String): List<String> {
        TODO("Not yet implemented")
    }
    
}


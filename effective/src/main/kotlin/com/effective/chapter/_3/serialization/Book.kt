package com.effective.chapter._3.serialization

import java.io.Serializable
import java.time.LocalDate


class Book(var isbn: String, var title: String, author: String?, var published: LocalDate) :
    Serializable {
    private val name: String? = null

    @Transient
    var numberOfSold = 0

    override fun toString(): String {
        return "Book{" +
                "isbn='" + isbn + '\'' +
                ", title='" + title + '\'' +
                ", published=" + published +
                ", numberOfSold=" + numberOfSold +
                '}'
    }

    companion object {
        private const val serialVersionUID = 1L
    }
}
package com.effective.chapter._5.springioc

import org.springframework.context.ApplicationContext
import org.springframework.context.annotation.AnnotationConfigApplicationContext


object App {
    @JvmStatic
    fun main(args: Array<String>) {
        val applicationContext: ApplicationContext =
            AnnotationConfigApplicationContext(AppConfig::class.java)
        val spellChecker: SpellChecker = applicationContext.getBean(SpellChecker::class.java)
        spellChecker.isValid("")
    }
}
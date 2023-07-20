package com.effective.chapter._5.springioc

import org.springframework.context.annotation.ComponentScan
import org.springframework.context.annotation.Configuration

@Configuration
@ComponentScan(basePackageClasses = [AppConfig::class])
class AppConfig

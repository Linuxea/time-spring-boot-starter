package com.linuxea.spring.boot.starter.configuration

import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty
import org.springframework.boot.context.properties.EnableConfigurationProperties
import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration
import java.text.SimpleDateFormat

@Configuration
@EnableConfigurationProperties(DateFormatterProperties::class)
@ConditionalOnProperty(prefix = "date-time-formatter", name = ["enabled"], havingValue = "true")
open class DateFormatterConfiguration {

    @Autowired
    private lateinit var dateFormatterProperties: DateFormatterProperties

    @Bean(name = ["myDateFormatter"])
    open fun dateFormatter(): SimpleDateFormat {
        println("初始化 myDateFormatter ${dateFormatterProperties.pattern}")
        return SimpleDateFormat(dateFormatterProperties.pattern)
    }


}
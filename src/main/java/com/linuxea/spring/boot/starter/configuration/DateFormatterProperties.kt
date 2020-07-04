package com.linuxea.spring.boot.starter.configuration

import org.springframework.boot.context.properties.ConfigurationProperties

@ConfigurationProperties("date-time-formatter")
open class DateFormatterProperties {

    var pattern = "yyyy-MM-dd HH:mm:ss"


}
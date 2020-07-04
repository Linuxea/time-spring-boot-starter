package com.linuxea.spring.boot.starter

import org.springframework.boot.ApplicationArguments
import org.springframework.boot.ApplicationRunner
import org.springframework.boot.SpringApplication
import org.springframework.boot.autoconfigure.SpringBootApplication
import java.text.SimpleDateFormat
import java.util.*
import javax.annotation.Resource


@SpringBootApplication
open class FirstStarterApplication : ApplicationRunner {

    @Throws(Exception::class)
    override fun run(args: ApplicationArguments) {
        println(simpleDateFormat.format(Date()))
    }

    @Resource(name = "myDateFormatter")
    private lateinit var simpleDateFormat: SimpleDateFormat

    companion object {
        @JvmStatic
        fun main(args: Array<String>) {
            SpringApplication.run(FirstStarterApplication::class.java, *args)
        }
    }
}
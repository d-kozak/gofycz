package io.dkozak.gofycz

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class GofyczApplication

fun main(args: Array<String>) {
    runApplication<GofyczApplication>(*args)
}

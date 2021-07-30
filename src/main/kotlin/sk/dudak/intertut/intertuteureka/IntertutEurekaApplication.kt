package sk.dudak.intertut.intertuteureka

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer

@SpringBootApplication
@EnableEurekaServer
class IntertutEurekaApplication

fun main(args: Array<String>) {
    runApplication<IntertutEurekaApplication>(*args)
}

package top.ordinaryroad.hello_docker

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
open class HelloDockerApplication {
    companion object {
        @JvmStatic
        fun main(args: Array<String>) {
            runApplication<HelloDockerApplication>(*args)
        }
    }
}
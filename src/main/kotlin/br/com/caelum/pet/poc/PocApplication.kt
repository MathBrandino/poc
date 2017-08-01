package br.com.caelum.pet.poc

import br.com.caelum.pet.poc.model.Usuario
import org.springframework.boot.SpringApplication
import org.springframework.boot.autoconfigure.SpringBootApplication

@SpringBootApplication
class PocApplication

fun main(args: Array<String>) {
    SpringApplication.run(PocApplication::class.java, *args)
}

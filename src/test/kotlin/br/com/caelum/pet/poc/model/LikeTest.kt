package br.com.caelum.pet.poc.model

import org.junit.Assert.*
import org.junit.Test
import java.time.LocalDateTime

class LikeTest {

    @Test
    fun testaLike() {

        val user = Usuario(login = "matheus", senha = "teste123")

        val data = LocalDateTime.of(2017, 2, 7, 10, 30)
        val tweet = Tweet("Teste", user, data)
        val like = Like(user, tweet)

        assertEquals("matheus",like.usuario.login)
        assertEquals("Teste",like.tweet.msg)

    }
}
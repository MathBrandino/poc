package br.com.caelum.pet.poc.model

import org.junit.Assert.*
import org.junit.Test
import java.time.LocalDateTime

class TweetTest {


    @Test
    fun testeTweet() {

        var user = Usuario(login = "matheus", senha = "123teste")
        val data = LocalDateTime.of(2017, 2, 7, 10, 30)
        var tweet = Tweet("Teste", user, data)

        assertEquals("matheus", tweet.usuario.login)
        assertEquals("Teste", tweet.msg)
        assertEquals(7, tweet.data.dayOfMonth)
        assertEquals(0, tweet.likes.size)
    }
}
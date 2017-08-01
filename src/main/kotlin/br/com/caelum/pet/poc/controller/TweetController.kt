package br.com.caelum.pet.poc.controller

import br.com.caelum.pet.poc.model.Tweet
import br.com.caelum.pet.poc.model.Usuario
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.*
import java.net.URI
import java.time.LocalDateTime

@RestController
@RequestMapping("tweets")
class TweetController {

    @GetMapping("/")
    fun findOne(): Tweet {
        return Tweet("Teste", Usuario(login = "leticia", senha = "23teste"), LocalDateTime.of(2017, 7, 31, 21, 0))
    }

    @PostMapping("/")
    fun save(@RequestBody tweet: Tweet): ResponseEntity<Tweet> {

        val uri = URI.create("/tweets/${tweet.usuario.login}/${tweet.likes.size}")
        return ResponseEntity.created(uri).body(tweet);
    }
}
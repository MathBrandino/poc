package br.com.caelum.pet.poc.model

import java.time.LocalDateTime

data class Tweet(var msg: String = "", var usuario: Usuario = Usuario(), var data: LocalDateTime = LocalDateTime.now(), var likes: List<Like> = ArrayList<Like>()) {

    fun add(like: Like) {
        likes.plus(like)
    }
}
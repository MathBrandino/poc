package br.com.caelum.pet.poc.controller

import br.com.caelum.pet.poc.dao.UsuarioRepository
import br.com.caelum.pet.poc.model.Usuario
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.*
import java.net.URI

@RestController
@RequestMapping("usuarios")
class UsuarioController(val usuarioRepository: UsuarioRepository) {


    @GetMapping("/")
    fun findAll(): MutableIterable<Usuario>? {

        return usuarioRepository.findAll();
    }

    @PostMapping("/")
    fun save(@RequestBody usuario: Usuario): ResponseEntity<Usuario> {

        val uri = URI.create("/usuario/${usuario.login}")

        usuarioRepository.save(usuario)

        return ResponseEntity.created(uri).body(usuario);
    }
}
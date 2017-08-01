package br.com.caelum.pet.poc.model

import org.junit.Assert.*
import org.junit.Test

class UsuarioTest {

    @Test
    fun testeUsuario() {

        var usuario = Usuario(login = "Matheus", senha = "Teste123")


        assertEquals("Matheus", usuario.login.trim())

    }
}


package br.com.caelum.pet.poc.controller

import org.json.JSONObject
import org.junit.Assert.*
import org.junit.Test
import org.junit.runner.RunWith
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc
import org.springframework.boot.test.context.SpringBootTest
import org.springframework.http.MediaType
import org.springframework.test.context.junit4.SpringRunner
import org.springframework.test.web.servlet.MockMvc
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders.*
import org.springframework.test.web.servlet.result.MockMvcResultMatchers.*

import org.hamcrest.Matchers.*

@RunWith(SpringRunner::class)
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
@AutoConfigureMockMvc
class UsuarioControllerTest {

    @Autowired
    lateinit var mvc: MockMvc

    @Test
    fun deveSalvarUmUsuario() {

        var jsonObject = JSONObject()
                .put("login", "fernando")
                .put("senha", "123")

        mvc.perform(
                post("/usuarios/").content(jsonObject.toString()).header("Content-Type", MediaType.APPLICATION_JSON)
        )
                .andExpect(status().isCreated)
                .andExpect(header().string("Location", "/usuario/fernando"))
                .andExpect(jsonPath("$.login", `is`("fernando")))
                .andExpect(jsonPath("$.senha", `is`("123")))


    }

}
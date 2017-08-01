package br.com.caelum.pet.poc.dao

import br.com.caelum.pet.poc.model.Usuario
import org.bson.types.ObjectId
import org.springframework.data.repository.CrudRepository

interface UsuarioRepository : CrudRepository<Usuario, ObjectId> {


}
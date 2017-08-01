package br.com.caelum.pet.poc.model

import org.bson.types.ObjectId
import org.springframework.data.annotation.Id
import org.springframework.data.mongodb.core.mapping.Document
import javax.annotation.Generated

@Document
data class Usuario(
        @Id
        @Generated
        var id: ObjectId = ObjectId(),
        var login: String = "",
        var senha: String = ""
)



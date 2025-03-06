package br.com.fiap.easycit.model

import androidx.room.Entity
import androidx.room.PrimaryKey
import java.time.LocalDate

@Entity(tableName = "tb_usuario")
data class Usuario(

    @PrimaryKey(autoGenerate = true)
    val id: Long = 0,

    val cpf: String = "",
    val nome: String = "",
    val email: String = "",
    val telefone: String = "",
    //val dataNasc: LocalDate? = null,
    val dataNasc: String = "",
    val cep: String = "",
    val nroEndereco: Int = 0,
    val username: String = "",
    val password: String = ""
)
package br.com.fiap.easycit.database.dao

import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Insert
import androidx.room.Query
import androidx.room.Update
import br.com.fiap.easycit.model.Usuario

@Dao
interface UsuarioDao {
    
    @Insert
    fun salvar(usuario: Usuario): Long

    @Update
    fun atualizar(usuario: Usuario): Int

    @Delete
    fun excluir(usuario: Usuario): Int

    @Query("SELECT * FROM tb_usuario WHERE id = :id")
    fun consultarUsuarioPorId(id: Long): Usuario

    @Query("SELECT * FROM tb_usuario ORDER BY nome ASC")
    fun listarUsuarios(): List<Usuario>
}
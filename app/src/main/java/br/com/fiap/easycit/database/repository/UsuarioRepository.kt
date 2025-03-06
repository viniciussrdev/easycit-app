package br.com.fiap.easycit.database.repository

import android.content.Context
import br.com.fiap.easycit.database.dao.EasyCitDatabase
import br.com.fiap.easycit.model.Usuario

class UsuarioRepository(context: Context) {

    var db = EasyCitDatabase.getDatabase(context).usuarioDao()

    fun salvar(usuario: Usuario): Long {
        return db.salvar(usuario)
    }

    fun atualizar(usuario: Usuario): Int {
        return db.atualizar(usuario)
    }

    fun excluir(usuario: Usuario): Int {
        return db.excluir(usuario)
    }

    fun consultarUsuarioPorId(id: Long): Usuario {
        return db.consultarUsuarioPorId(id)
    }

    fun listarUsuarios(): List<Usuario> {
        return db.listarUsuarios()
    }
}
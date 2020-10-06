package br.com.unicid.aplicativodentista.dao

import android.content.ContentValues
import android.content.Context
import android.database.sqlite.SQLiteDatabase
import br.com.unicid.aplicativodentista.database.UsuarioDatabase
import br.com.unicid.aplicativodentista.model.Usuario

class UsuarioDAO(context: Context?) {
    private val usuarioDB: UsuarioDatabase
    private val banco: SQLiteDatabase

    init {
        usuarioDB = UsuarioDatabase(context!!)
        banco = usuarioDB.writableDatabase
    }

    fun salvarUsuario(usuario: Usuario): Long {
        val values = ContentValues()
        values.put("NOME", usuario.nome)
        values.put("CPF", usuario.cpf)
        values.put("CRO", usuario.cro)
        values.put("EMAIL", usuario.email)
        values.put("SENHA", usuario.senha)
        return banco.insert("USUARIO", null, values)
    }
}
package br.com.unicid.aplicativodentista.database

import android.content.ContentValues
import br.com.unicid.aplicativodentista.model.Usuario

fun NovoUsuarioDatabase.inserirUsuario (item : Usuario): Long {

   val idUsuario = writableDatabase.insert("TB_USUARIOS", null, ContentValues().apply {
        put("NOME", item.Nome)
        put("CPF", item.CPF)
        put("CRO", item.CRO)
        put("EMAIL", item.Email)
        put("CELULAR", item.Celular)
        put("TELEFONE", item.Telefone)
        put("SENHA", item.Senha)
        put("C_SENHA", item.Co_senha)
    })

    return idUsuario
}
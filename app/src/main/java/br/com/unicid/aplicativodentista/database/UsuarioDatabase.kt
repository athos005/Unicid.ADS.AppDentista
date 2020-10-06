package br.com.unicid.aplicativodentista.database

import android.content.Context
import android.database.sqlite.SQLiteDatabase
import android.database.sqlite.SQLiteOpenHelper

class UsuarioDatabase(context: Context):SQLiteOpenHelper(context, "usuario.db", null, 1) {


    override fun onCreate(db: SQLiteDatabase?) { //Criação do Banco de Dados

        val sql = """
            CREATE TABLE USUARIO(
            ID INTEGER PRIMARY KEY AUTOINCREMENT,
            NOME TEXT,
            CPF INTEGER,
            CRO TEXT,
            EMAIL TEXT,
            SENHA TEXT)
        """.trimIndent()

        db?.execSQL(sql)
    }

    override fun onUpgrade(db: SQLiteDatabase?, oldVersion: Int, newVersion: Int) { //Atualização de Versão do Banco de Dados
        db?.execSQL("DROP TABLE IF EXISTS USUARIO")
        onCreate(db)
    }


}
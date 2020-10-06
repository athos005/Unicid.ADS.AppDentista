package br.com.unicid.aplicativodentista.database

import android.content.Context
import android.database.sqlite.SQLiteDatabase
import android.database.sqlite.SQLiteOpenHelper

class PacienteDatabase(context: Context) : SQLiteOpenHelper(context, "paciente.db", null, 1) {


    override fun onCreate(db: SQLiteDatabase?) { //Criação do Banco de Dados

        val sql = """
            CREATE TABLE PACIENTE(
            COD_PACIENTE INTEGER PRIMARY KEY AUTOINCREMENT,
            NOME TEXT,
            CPF INTEGER,
            RG TEXT,
            EMAIL TEXT,
            CELULAR TEXT,
            TELEFONE TEXT)
        """.trimIndent()

        db?.execSQL(sql)
    }

    override fun onUpgrade(
        db: SQLiteDatabase?,
        oldVersion: Int,
        newVersion: Int
    ) { //Atualização de Versão do Banco de Dados
        db?.execSQL("DROP TABLE IF EXISTS PACIENTE")
        onCreate(db)
    }


}
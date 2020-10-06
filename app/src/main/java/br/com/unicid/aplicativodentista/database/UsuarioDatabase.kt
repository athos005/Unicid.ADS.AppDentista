package br.com.unicid.aplicativodentista.database

import android.content.Context
import android.database.sqlite.SQLiteDatabase
import android.database.sqlite.SQLiteOpenHelper

class UsuarioDatabase(context: Context):SQLiteOpenHelper(context, "usuario.db", null, 1) {


    override fun onCreate(db: SQLiteDatabase?) { //Criação do Banco de Dados

        db?.execSQL("CREATE TABLE USUARIO(ID_USUARIO INTEGER PRIMARY KEY AUTOINCREMENT, " +
                "NOME VARCHAR(50), " +
                "CPF INTEGER, " +
                "CRO VARCHAR(50), " +
                "EMAIL VARCHAR(50), " +
                "SENHA VARCHAR(50)")

    }

    override fun onUpgrade(db: SQLiteDatabase?, oldVersion: Int, newVersion: Int) { //Atualização de Versão do Banco de Dados
//        db?.execSQL("DROP TABLE IF EXISTS USUARIO")
//        onCreate(db)
    }


}
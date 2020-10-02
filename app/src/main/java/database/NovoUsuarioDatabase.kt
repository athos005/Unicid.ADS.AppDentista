package database

import android.content.Context
import android.database.sqlite.SQLiteDatabase
import android.database.sqlite.SQLiteOpenHelper

class NovoUsuarioDatabase(
    context: Context
):SQLiteOpenHelper(context, "usuario.db", null, 1) {


    override fun onCreate(db: SQLiteDatabase?) {

        val sql = """
            CREATE TABLE TB_USUARIOS(
            ID INTEGER PRIMARY KEY AUTOINCREMENT,
            NOME TEXT,
            CPF INTEGER,
            CRO INTEGER,
            EMAIL TEXT,
            CELULAR INTEGER,
            TELEFONE INTEGER,
            SENHA INTEGER,
            C_SENHA)
        """.trimIndent()

        db?.execSQL(sql)
    }

    override fun onUpgrade(db: SQLiteDatabase?, oldVersion: Int, newVersion: Int) {
        db?.execSQL("DROP TABLE IF EXISTS TB_USUARIOS")
        onCreate(db)
    }


}
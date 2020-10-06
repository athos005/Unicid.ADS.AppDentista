package br.com.unicid.aplicativodentista.database

import android.content.ContentValues
import android.content.Context
import android.database.sqlite.SQLiteDatabase
import br.com.unicid.aplicativodentista.model.Paciente
import br.com.unicid.aplicativodentista.model.Usuario

class PacienteDAO(context: Context?){

    private var pacienteDB: PacienteDatabase? = null
    private var banco: SQLiteDatabase

    init {
        pacienteDB = PacienteDatabase(context!!)
        banco = pacienteDB!!.writableDatabase
    }

    fun salvarPaciente(paciente : Paciente): Long {
        val values = ContentValues()
        values.put("NOME", paciente.nomePaciente)
        values.put("CPF", paciente.cpfPaciente)
        values.put("RG", paciente.rgPaciente)
        values.put("EMAIL", paciente.emailPaciente)
        values.put("CELULAR", paciente.celularPaciente)
        values.put("TELEFONE", paciente.telefonePaciente)
        return banco.insert("PACIENTE", null, values)
    }
}
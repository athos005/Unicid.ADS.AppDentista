package br.com.unicid.aplicativodentista.dao

import android.content.ContentValues
import android.content.Context
import android.database.sqlite.SQLiteDatabase
import android.widget.ListView
import br.com.unicid.aplicativodentista.database.PacienteDatabase
import br.com.unicid.aplicativodentista.model.Paciente
import java.util.ArrayList

class PacienteDAO(context: Context?) {

    private var pacienteDB: PacienteDatabase? = null
    private var banco: SQLiteDatabase

    init {
        pacienteDB = PacienteDatabase(context!!)
        banco = pacienteDB!!.writableDatabase
    }

    fun salvarPaciente(paciente: Paciente): Long {
        val values = ContentValues()
        values.put("NOME", paciente.nomePaciente)
        values.put("CPF", paciente.cpfPaciente)
        values.put("RG", paciente.rgPaciente)
        values.put("EMAIL", paciente.emailPaciente)
        values.put("CELULAR", paciente.celularPaciente)
        values.put("TELEFONE", paciente.telefonePaciente)
        return banco.insert("PACIENTE", null, values)
    }

    private val listView: ListView? = null
    private val paciente: List<Paciente>? = null
    private val pacientes: List<Paciente> = ArrayList()

    fun listarPacientes(): List<Paciente> {
        val listaPacientes: MutableList<Paciente> = ArrayList()
        val cursor = banco!!.query(
            "PACIENTE", arrayOf("COD_PACIENTE", "NOME", "CPF", "RG", "EMAIL", "CELULAR", "TELEFONE"),
            null,
            null,
            null,
            null,
            null
        )
        while (cursor.moveToNext()) {
            val pacienteListado = Paciente()
            pacienteListado.codPaciente = cursor.getInt(0)
            pacienteListado.nomePaciente = cursor.getString(1)
            pacienteListado.cpfPaciente = cursor.getInt(2)
            pacienteListado.rgPaciente = cursor.getString(3)
            pacienteListado.emailPaciente = cursor.getString(4)
            pacienteListado.celularPaciente = cursor.getString(5)
            pacienteListado.telefonePaciente = cursor.getString(6)
            listaPacientes.add(pacienteListado)
        }
        return listaPacientes
    }
}

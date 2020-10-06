//package br.com.unicid.aplicativodentista.ui.activity
//
//import android.R
//import android.content.Context
//import android.database.sqlite.SQLiteDatabase
//import android.widget.ArrayAdapter
//import android.widget.ListView
//import br.com.unicid.aplicativodentista.database.PacienteDatabase
//import br.com.unicid.aplicativodentista.model.Paciente
//import java.util.*
//
//class teste : Context() {
//    private val listView: ListView? = null
//    private val paciente: List<Paciente>? = null
//    private val pacientes: List<Paciente> = ArrayList()
//    private val pacienteDB: PacienteDatabase? = null
//    private val banco: SQLiteDatabase? = null
//    fun listarPacientes(): List<Paciente> {
//        val listaPacientes: MutableList<Paciente> = ArrayList()
//        val cursor = banco!!.query(
//            "ALUNO", arrayOf("COD_PACIENTE", "NOME", "CPF", "RG", "EMAIL", "CELULAR", "TELEFONE"),
//            null,
//            null,
//            null,
//            null,
//            null
//        )
//        while (cursor.moveToNext()) {
//            val pacienteListado = Paciente()
//            pacienteListado.codPaciente = cursor.getInt(0)
//            pacienteListado.nomePaciente = cursor.getString(1)
//            pacienteListado.cpfPaciente = cursor.getInt(2)
//            pacienteListado.rgPaciente = cursor.getString(3)
//            pacienteListado.emailPaciente = cursor.getString(4)
//            pacienteListado.celularPaciente = cursor.getString(5)
//            pacienteListado.telefonePaciente = cursor.getString(6)
//            listaPacientes.add(pacienteListado)
//        }
//        return listaPacientes
//    }
//
//    private val pacienteFiltrados: MutableList<Paciente> = ArrayList()
//    fun a() {
//        pacienteFiltrados.addAll(pacientes)
//        val adaptador = ArrayAdapter<Paciente>(this, R.layout.simple_list_item_1)
//        listView!!.adapter = adaptador
//    }
//}
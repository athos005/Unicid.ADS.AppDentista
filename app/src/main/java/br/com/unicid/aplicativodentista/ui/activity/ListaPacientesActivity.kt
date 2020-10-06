package br.com.unicid.aplicativodentista.ui.activity

import android.content.Intent
import android.os.Bundle
import android.support.design.widget.FloatingActionButton
import android.support.v7.app.AppCompatActivity
import android.view.View
import android.widget.ArrayAdapter
import android.widget.Button
import android.widget.ListView
import android.widget.Toast
import br.com.unicid.aplicativodentista.R
import br.com.unicid.aplicativodentista.dao.PacienteDAO
import br.com.unicid.aplicativodentista.model.Paciente
import kotlinx.android.synthetic.main.activity_lista_pacientes.*
import java.util.*


class ListaPacientesActivity : AppCompatActivity() {

    private var listView: ListView? = null
    private var daoPaciente: PacienteDAO? = null
    private var pacientes: List<Paciente>? = null
    private var pacienteFiltrados: MutableList<Paciente> = ArrayList()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_lista_pacientes)

        listView = findViewById(R.id.lstPacienteCadastrados)

        daoPaciente = PacienteDAO(this)
        pacientes = daoPaciente?.listarPacientes()
        pacienteFiltrados.addAll(pacientes!!)

        val adaptador = ArrayAdapter<Paciente>(this,
            android.R.layout.simple_list_item_1,
            pacientes!!
        )
        listView!!.adapter = adaptador

        btnNovoPaciente.setOnClickListener() {
            //Toast.makeText(this, "TESTE", Toast.LENGTH_SHORT).show()
            novaTela()
            finish()
        }
    }

    fun novaTela() {
        val intent = Intent(this, DadosPacienteActivity::class.java).apply {  }
        startActivity(intent)
    }
}


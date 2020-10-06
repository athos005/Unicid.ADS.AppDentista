package br.com.unicid.aplicativodentista.ui.activity

import android.annotation.SuppressLint
import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.EditText
import android.widget.Toast
import br.com.unicid.aplicativodentista.R
import br.com.unicid.aplicativodentista.dao.PacienteDAO
import br.com.unicid.aplicativodentista.model.Paciente
import kotlinx.android.synthetic.main.activity_dados_paciente.*

class DadosPacienteActivity : AppCompatActivity() {

    var nomePaciente: EditText? = null
    var cpfPaciente: EditText? = null
    var rgPaciente: EditText? = null
    var emailPaciente: EditText? = null
    var celularPaciente: EditText? = null
    var telefonePaciente: EditText? = null
    var daoPaciente : PacienteDAO? = null

    @SuppressLint("ResourceType")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_dados_paciente)
       // setSupportActionBar(findViewById(R.id.my_toolbar))
        setTitle("Novo Paciente")

        nomePaciente = findViewById(R.id.txtPacienteNome)
        cpfPaciente = findViewById(R.id.txtPacienteCpf)
        rgPaciente = findViewById(R.id.txtPacienteEmail)
        emailPaciente = findViewById(R.id.txtPacienteEmail)
        celularPaciente = findViewById(R.id.txtPacienteCelular)
        telefonePaciente = findViewById(R.id.txtPacienteTelefone)
        daoPaciente = PacienteDAO(this)

        btnSalvarPaciente.setOnClickListener() {
            salvarPaciente()
            finish()
            novaTela()
        }
    }

    fun salvarPaciente() {
        val novoPaciente = Paciente()
        novoPaciente.nomePaciente = nomePaciente?.text.toString()
        novoPaciente.cpfPaciente = cpfPaciente?.text.toString().toInt()
        novoPaciente.rgPaciente = rgPaciente?.text.toString()
        novoPaciente.emailPaciente = emailPaciente?.text.toString()
        novoPaciente.celularPaciente = celularPaciente?.text.toString()
        novoPaciente.telefonePaciente = telefonePaciente!!.text.toString()
        val id = daoPaciente?.salvarPaciente(novoPaciente)
        Toast.makeText(this, "Paciente cadastrato com id $id", Toast.LENGTH_SHORT).show()
    }

    fun novaTela() {
        val intent = Intent(this, ListaPacientesActivity::class.java).apply {  }
        startActivity(intent)
    }
}
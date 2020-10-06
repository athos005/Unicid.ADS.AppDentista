package br.com.unicid.aplicativodentista.ui.activity

import android.annotation.SuppressLint
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import br.com.unicid.aplicativodentista.R

class DadosPacienteActivity : AppCompatActivity() {
    @SuppressLint("ResourceType")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_dados_paciente)
       // setSupportActionBar(findViewById(R.id.my_toolbar))
        setTitle("Novo Paciente")
    }
}
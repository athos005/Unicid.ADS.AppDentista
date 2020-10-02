package br.com.unicid.aplicativodentista.ui.activity

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import br.com.unicid.aplicativodentista.R
import database.NovoUsuarioDatabase
import database.inserirUsuario

class NovoUsuarioAcitivity : AppCompatActivity() {

    private lateinit var txtCadastroUsuarioNome: EditText
    private lateinit var txtCadastroUsuarioCPF: EditText
    private lateinit var txtCadastroUsuarioCRO: EditText
    private lateinit var txtCadastroUsuarioEmail: EditText
    private lateinit var txtCadastroUsuarioCelular: EditText
    private lateinit var txtCadastroUsuarioTelefone: EditText
    private lateinit var txtCadastroUsuarioSenha: EditText
    private lateinit var txtCadastroUsuarioConfirmaSenha: EditText
    private lateinit var btnCadastroUsuarioConfirmar: Button

    private lateinit var database: NovoUsuarioDatabase

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_novo_usuario)

        txtCadastroUsuarioNome = findViewById(R.id.txtCadastroUsuarioNome)
        txtCadastroUsuarioCPF = findViewById(R.id.txtCadastroUsuarioCPF)
        txtCadastroUsuarioCRO = findViewById(R.id.txtCadastroUsuarioCRO)
        txtCadastroUsuarioEmail = findViewById(R.id.txtCadastroUsuarioEmail)
        txtCadastroUsuarioCelular = findViewById(R.id.txtCadastroUsuarioCelular)
        txtCadastroUsuarioTelefone = findViewById(R.id.txtCadastroUsuarioTelefone)
        txtCadastroUsuarioSenha = findViewById(R.id.txtCadastroUsuarioSenha)
        txtCadastroUsuarioConfirmaSenha = findViewById(R.id.txtCadastroUsuarioConfirmaSenha)
        btnCadastroUsuarioConfirmar = findViewById(R.id.btnCadastroUsuarioConfirmar)

        database = NovoUsuarioDatabase(this)

        btnCadastroUsuarioConfirmar.setOnClickListener {
            salvarUsuario()
        }
    }

    private fun salvarUsuario(){

        val usuario = Usuario(
            Nome = txtCadastroUsuarioNome.text.toString(),
            CPF = txtCadastroUsuarioCPF.text.toString(),
            CRO = txtCadastroUsuarioCRO.text.toString(),
            Email = txtCadastroUsuarioEmail.text.toString(),
            Celular = txtCadastroUsuarioCelular.text.toString(),
            Telefone = txtCadastroUsuarioTelefone.text.toString(),
            Senha = txtCadastroUsuarioSenha.text.toString(),
            Co_senha = txtCadastroUsuarioConfirmaSenha.text.toString()

        )

        val idUsuario = database.inserirUsuario(usuario)

        if (idUsuario == -1L) {
            Toast.makeText(this,"Erro ao inserir", Toast.LENGTH_SHORT).show()
        } else {
            Toast.makeText(this, "Usuario inserido com sucesso id: $idUsuario", Toast.LENGTH_SHORT).show()
        }

    }
}
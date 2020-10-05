package br.com.unicid.aplicativodentista.ui.activity

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import br.com.unicid.aplicativodentista.R
import br.com.unicid.aplicativodentista.model.Usuario
import kotlinx.android.synthetic.main.activity_novo_usuario.*

class UsuarioAcitivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_novo_usuario)

        val usuario = Usuario()


        btnUsuarioCadastrar.setOnClickListener {
            usuario.salvarUsuario(
                nomeUsuario = txtUsuarioNome.text.toString(),
                cpfUsuario = txtCroUsuario.text.toString().toInt(),
                croUsuario = txtCroUsuario.text.toString().toInt(),
                emailUsuario = txtUsuarioEmail.text.toString(),
                senhaUsuario = txtUsuarioSenha.text.toString()
            )
        }

//    private lateinit var txtCadastroUsuarioNome: EditText
//    private lateinit var txtCadastroUsuarioCPF: EditText
//    private lateinit var txtCadastroUsuarioCRO: EditText
//    private lateinit var txtCadastroUsuarioEmail: EditText
//    private lateinit var txtCadastroUsuarioCelular: EditText
//    private lateinit var txtCadastroUsuarioTelefone: EditText
//    private lateinit var txtCadastroUsuarioSenha: EditText
//    private lateinit var txtCadastroUsuarioConfirmaSenha: EditText
//    private lateinit var btnCadastroUsuarioConfirmar: Button
//
//    private lateinit var database: UsuarioDatabase

//        txtCadastroUsuarioNome = findViewById(R.id.txtCadastroUsuarioNome)
//        txtCadastroUsuarioCPF = findViewById(R.id.txtCadastroUsuarioCPF)
//        txtCadastroUsuarioCRO = findViewById(R.id.txtCadastroUsuarioCRO)
//        txtCadastroUsuarioEmail = findViewById(R.id.txtCadastroUsuarioEmail)
//        txtCadastroUsuarioCelular = findViewById(R.id.txtCadastroUsuarioCelular)
//        txtCadastroUsuarioTelefone = findViewById(R.id.txtCadastroUsuarioTelefone)
//        txtCadastroUsuarioSenha = findViewById(R.id.txtCadastroUsuarioSenha)
//        txtCadastroUsuarioConfirmaSenha = findViewById(R.id.txtCadastroUsuarioConfirmaSenha)
//        btnCadastroUsuarioConfirmar = findViewById(R.id.btnCadastroUsuarioConfirmar)
//
//        database = UsuarioDatabase(this)
//
//        btnCadastroUsuarioConfirmar.setOnClickListener {
//            if (txtCadastroUsuarioNome.text.toString()
//                    .isEmpty() || txtCadastroUsuarioCPF.text.toString().isEmpty() ||
//                txtCadastroUsuarioEmail.text.toString()
//                    .isEmpty() || txtCadastroUsuarioCelular.text.toString().isEmpty()
//                || txtCadastroUsuarioSenha.text.toString().isEmpty()
//            ) {
//                Toast.makeText(this, "Preencha Todos os Campos ", Toast.LENGTH_SHORT).show()
//            } else if (!txtCadastroUsuarioSenha.text.toString()
//                    .equals(txtCadastroUsuarioConfirmaSenha.text.toString())
//            ) {
//                Toast.makeText(this, "Senhas Diferentes!", Toast.LENGTH_SHORT).show()
//            } else {
//                salvarUsuario()
//            }
//        }
    }
}



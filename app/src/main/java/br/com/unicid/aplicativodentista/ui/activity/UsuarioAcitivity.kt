package br.com.unicid.aplicativodentista.ui.activity

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.EditText
import android.widget.Toast
import br.com.unicid.aplicativodentista.R
import br.com.unicid.aplicativodentista.database.UsuarioDAO
import br.com.unicid.aplicativodentista.model.Usuario
import kotlinx.android.synthetic.main.activity_usuario.*

class UsuarioAcitivity : AppCompatActivity() {

    var nomeUsuario: EditText? = null
    var cpfUsuario: EditText? = null
    var croUsuario: EditText? = null
    var emailUsuario: EditText? = null
    var senhaUsuario: EditText? = null
    var confirmaSenhaUsuario: EditText? = null
    var daoUsuario : UsuarioDAO? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_usuario)

        nomeUsuario = findViewById(R.id.txtUsuarioNome)
        cpfUsuario = findViewById(R.id.txtUsuarioCpf)
        croUsuario = findViewById(R.id.txtUsuarioEmail)
        emailUsuario = findViewById(R.id.txtUsuarioEmail)
        senhaUsuario = findViewById(R.id.txtUsuarioSenha)
        confirmaSenhaUsuario = findViewById(R.id.txtUsuarioConfirmaSenha)
        daoUsuario = UsuarioDAO(this)

        btnCadastrarUsuario.setOnClickListener() {
            salvarUsuario()
        }
    }

    fun salvarUsuario() {
        val novoUsuario = Usuario()
        novoUsuario.nome = nomeUsuario?.text.toString()
        novoUsuario.cpf = cpfUsuario?.text.toString().toInt()
        novoUsuario.cro = croUsuario?.text.toString()
        novoUsuario.email = emailUsuario?.text.toString()
        novoUsuario.senha = senhaUsuario?.text.toString()
        novoUsuario.confirmarSenha = confirmaSenhaUsuario!!.text.toString()
        val id = daoUsuario?.salvarUsuario(novoUsuario)
        Toast.makeText(this, "Usuario cadastrato com id $id", Toast.LENGTH_SHORT).show()
    }
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
//    }
//}
//            if(txtCadastroUsuarioNome.text.toString().isEmpty() || txtCadastroUsuarioCPF.text.toString().isEmpty() ||
//                    txtCadastroUsuarioEmail.text.toString().isEmpty() || txtCadastroUsuarioCelular.text.toString().isEmpty()
//                || txtCadastroUsuarioSenha.text.toString().isEmpty()){
//                Toast.makeText(this,"Preencha Todos os Campos ", Toast.LENGTH_SHORT).show()
//            }else if (!txtCadastroUsuarioSenha.text.toString().equals(txtCadastroUsuarioConfirmaSenha.text.toString())){
//                Toast.makeText(this,"Senhas Diferentes!", Toast.LENGTH_SHORT).show()
//            }else {
//                salvarUsuario()
//            }
//        }
//    }
//
//    private fun salvarUsuario(){
//
//        val usuario = Usuario(
//            Nome = txtCadastroUsuarioNome.text.toString(),
//            CPF = txtCadastroUsuarioCPF.text.toString(),
//            CRO = txtCadastroUsuarioCRO.text.toString(),
//            Email = txtCadastroUsuarioEmail.text.toString(),
//            Celular = txtCadastroUsuarioCelular.text.toString(),
//            Telefone = txtCadastroUsuarioTelefone.text.toString(),
//            Senha = txtCadastroUsuarioSenha.text.toString(),
//            Co_senha = txtCadastroUsuarioConfirmaSenha.text.toString()
//
//        )
//
//        val idUsuario = database.inserirUsuario(usuario)
//
//        if (idUsuario == -1L) {
//            Toast.makeText(this,"Erro ao inserir", Toast.LENGTH_SHORT).show()
//        } else {
//            Toast.makeText(this, "Usuario inserido com sucesso id: $idUsuario", Toast.LENGTH_SHORT).show()
//        }
//


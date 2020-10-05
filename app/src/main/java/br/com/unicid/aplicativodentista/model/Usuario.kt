package br.com.unicid.aplicativodentista.model

import android.text.Editable

class Usuario {
    var nome = ""
    var cpf = 0
    var cro = 0
    var email = ""
    var senha = ""
    var td: Int? = null //TABELA?

    fun salvarUsuario(
        nomeUsuario: String,
        cpfUsuario: Int,
        croUsuario: Int,
        emailUsuario: String,
        senhaUsuario: String
    ) {
        this.nome = nomeUsuario
        this.cpf = cpfUsuario
        this.cro = croUsuario
        this.email = emailUsuario
        this.senha = senhaUsuario
    }
}


//    val idUsuario = database.inserirUsuario(usuario)
//
//    if (idUsuario == -1L) {
//        Toast.makeText(this, "Erro ao inserir", Toast.LENGTH_SHORT).show()
//    } else {
//        Toast.makeText(this, "Usuario inserido com sucesso id: $idUsuario", Toast.LENGTH_SHORT)
//            .show()
//    }




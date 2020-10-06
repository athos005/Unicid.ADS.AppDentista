package br.com.unicid.aplicativodentista.model

import java.io.Serializable

class Usuario : Serializable {
    var nome = ""
    var cpf = 0
    var cro = ""
    var email = ""
    var senha = ""
    var confirmarSenha = ""
    var codUsuario: Int? =  null
}
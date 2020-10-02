package br.com.unicid.aplicativodentista.ui.activity

data class Usuario (

    val Nome: String,
    val CPF: String,
    val CRO: String,
    val Email: String,
    val Celular: String,
    val Telefone: String,
    val Senha: String,
    val Co_senha: String,
    val Id: Int? =  null
)
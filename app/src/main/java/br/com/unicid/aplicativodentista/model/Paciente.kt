package br.com.unicid.aplicativodentista.model

import java.io.Serializable

class Paciente: Serializable {

    var codPaciente = 0
    var nomePaciente = ""
    var cpfPaciente = 0
    var rgPaciente = ""
    var emailPaciente = ""
    var telefonePaciente = ""
    var celularPaciente = ""

    override fun toString(): String {
        return nomePaciente;
    }
}


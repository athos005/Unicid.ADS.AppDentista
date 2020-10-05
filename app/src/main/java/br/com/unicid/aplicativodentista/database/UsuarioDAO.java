package br.com.unicid.aplicativodentista.database;

import android.content.ContentValues;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;

import br.com.unicid.aplicativodentista.model.Usuario;

public class UsuarioDAO {

    private UsuarioDatabase usuarioDB;
    private SQLiteDatabase banco;

    public UsuarioDAO(Context context) {
        usuarioDB = new UsuarioDatabase(context);
        banco = usuarioDB.getWritableDatabase();
    }

    public long salvar(Usuario usuario) {
        ContentValues values = new ContentValues();
        values.put("NOME", usuario.getNome());
        values.put("CPF", usuario.getCPF());
        values.put("CRO", usuario.getCRO());
        values.put("EMAIL", usuario.getEmail());
        values.put("SENHA", usuario.getSenha());
        return banco.insert("USUARIO", null, values);
    }
}

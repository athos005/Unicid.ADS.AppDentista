package br.com.unicid.aplicativodentista.ui.activity;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import br.com.unicid.aplicativodentista.R;

public class LoginUsuarioActivity extends AppCompatActivity {

    private EditText txtLoginEmail;
    private EditText txtLoginsenha;
    private Button btnAcessarApp;
    private TextView btnNovoUsuario;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login_usuario);

        abrirActivityNovoUsuario();
        acessarAplictivo();
    }

    private void abrirActivityNovoUsuario(){
        btnNovoUsuario = findViewById(R.id.btnLoginNovoUsuario);
        btnNovoUsuario.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(LoginUsuarioActivity.this,
                        UsuarioActivity.class);
                startActivity(intent);
            }
        });
    }

    private void acessarAplictivo(){
        btnAcessarApp = findViewById(R.id.btnAcessarApp);
        btnAcessarApp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(LoginUsuarioActivity.this,
                        AgendaActivity.class);
                startActivity(intent);
            }
        });
    }
}


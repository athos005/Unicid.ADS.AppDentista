package br.com.unicid.aplicativodentista.ui.activity;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.design.widget.BottomNavigationView;
import android.support.design.widget.FloatingActionButton;
import android.support.v7.app.AppCompatActivity;
import android.view.MenuItem;
import android.view.View;

import br.com.unicid.aplicativodentista.R;

public class ListaPacientes extends AppCompatActivity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lista_pacientes);

        menuNavegacao();
        abrirActivityNovoPaciente();

    }

    private void menuNavegacao(){
        BottomNavigationView bottomNavigationView = (BottomNavigationView) findViewById(R.id.menuNavegacaoListaPacientes);
        bottomNavigationView.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {

                Intent intent;
                switch (item.getItemId()) {
                    case R.id.menu_pacientes:
                        intent = new Intent(ListaPacientes.this,
                                ListaPacientes.class);
                        startActivity(intent);
                        break;
                    case R.id.menu_agenda:
                        intent = new Intent(ListaPacientes.this,
                                AgendaActivity.class);
                        startActivity(intent);
                        break;
                }
                return true;
            }
        });
    }

    private void abrirActivityNovoPaciente(){
        FloatingActionButton btnNovoPaciente = (FloatingActionButton) findViewById(R.id.btnNovoPaciente);
        btnNovoPaciente.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(ListaPacientes.this,
                        PacienteActivity.class);
                startActivity(intent);
            }
        });
    }
}

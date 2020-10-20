package br.com.unicid.aplicativodentista.ui.activity;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.design.widget.BottomNavigationView;
import android.support.v7.app.AppCompatActivity;
import android.view.MenuItem;

import br.com.unicid.aplicativodentista.R;

public class AgendaActivity extends AppCompatActivity {

    private BottomNavigationView menuNavegacaoAgenda;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_agenda);

        BottomNavigationView bottomNavigationView = (BottomNavigationView) findViewById(R.id.menuNavegacaoAgenda);
        bottomNavigationView.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {

                Intent intent;
                switch (item.getItemId()) {
                    case R.id.menu_pacientes:
                        intent = new Intent(AgendaActivity.this,
                                ListaPacientes.class);
                        startActivity(intent);
                        break;
                    case R.id.menu_agenda:
                        intent = new Intent(AgendaActivity.this,
                                AgendaActivity.class);
                        startActivity(intent);
                        break;
                    case R.id.menu_configuracoes:

                        break;
                }
                return true;
            }
        });

        bottomNavigationView.setOnNavigationItemReselectedListener(new BottomNavigationView.OnNavigationItemReselectedListener() {
            @Override
            public void onNavigationItemReselected(@NonNull MenuItem item) {

                Intent intent;
                switch (item.getItemId()) {
                    case R.id.menu_pacientes:
                        intent = new Intent(AgendaActivity.this,
                                ListaPacientes.class);
                        startActivity(intent);
                        break;
                    case R.id.menu_agenda:
                        intent = new Intent(AgendaActivity.this,
                                AgendaActivity.class);
                        startActivity(intent);
                        break;
                    case R.id.menu_configuracoes:

                        break;
                }
            }
        });
    }
}

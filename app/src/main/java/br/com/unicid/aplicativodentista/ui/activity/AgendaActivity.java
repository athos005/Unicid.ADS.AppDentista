package br.com.unicid.aplicativodentista.ui.activity;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.design.widget.FloatingActionButton;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

import br.com.unicid.aplicativodentista.R;

public class AgendaActivity extends AppCompatActivity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_agenda);
        setTitle("Agenda");

        FloatingActionButton btnAgendarNovaConsulta = findViewById(R.id.btnAgendarNovaConsulta);
        btnAgendarNovaConsulta.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                Intent intent = new Intent(AgendaActivity.this,
                        AgendamentoActivity.class);
                startActivity(intent);
            }
        });
    }
}

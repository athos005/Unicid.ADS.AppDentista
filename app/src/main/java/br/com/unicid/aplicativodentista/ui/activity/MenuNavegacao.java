//package br.com.unicid.aplicativodentista.ui.activity;
//
//import android.content.Context;
//import android.content.Intent;
//import android.support.annotation.NonNull;
//import android.support.design.widget.BottomNavigationView;
//import android.support.v7.app.AppCompatActivity;
//import android.view.MenuItem;
//
//import br.com.unicid.aplicativodentista.R;
//
//public class MenuNavegacao extends AppCompatActivity {
//
//    public void chamaActivity(Context contexto) {
//        BottomNavigationView bottomNavigationView = (BottomNavigationView) findViewById(R.id.menuNavegacao);
//        bottomNavigationView.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
//            @Override
//            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
//                Intent intent;
//                switch (item.getItemId()) {
//                    case R.id.menu_pacientes:
//                        intent = new Intent(contexto,
//                                ListaPacientes.class);
//                        startActivity(intent);
//                        break;
//                    case R.id.menu_agenda:
//                        intent = new Intent(contexto,
//                                AgendaActivity.class);
//                        startActivity(intent);
//                        break;
//                }
//                return true;
//            }
//        });
//    }
//}
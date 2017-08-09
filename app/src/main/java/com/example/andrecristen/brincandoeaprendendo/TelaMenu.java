package com.example.andrecristen.brincandoeaprendendo;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class TelaMenu extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tela_menu);
    }
    public void startTelaDesafios(View view) {

        Intent telaDesafios = new Intent(this, QuizPegadinhas.class);
        startActivity(telaDesafios);
    }
    public void startTelaLogica(View view) {

        Intent telaLogica = new Intent(this, QuizLogica.class);
        startActivity(telaLogica);
    }
    public void startTelaRacicinio(View view) {

        Intent telaRaciocinio = new Intent(this, QuizRaciocinio.class);
        startActivity(telaRaciocinio);
    }
}

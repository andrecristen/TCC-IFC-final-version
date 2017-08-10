package com.example.andrecristen.brincandoeaprendendo;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class TelaAjuda extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tela_ajuda);
    }
    public void startTelaCategorias(View view) {

        Intent telaRaciocinio = new Intent(this, TelaMenu.class);
        startActivity(telaRaciocinio);
    }
}

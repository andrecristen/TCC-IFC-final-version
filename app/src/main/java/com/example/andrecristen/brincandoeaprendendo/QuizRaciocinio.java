package com.example.andrecristen.brincandoeaprendendo;

import android.content.Intent;
import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;


public class QuizRaciocinio extends AppCompatActivity {

    private RacicinioLogico mLivrariaQuestao = new RacicinioLogico();

    private TextView mostrarPontos;
    private TextView mVerQuestao;
    private Button mBotaoOpcao1;
    private Button mBotaoOpcao2;
    private Button mBotaoOpcao3;

    private String mRespostaCorreta;

    private int mAcertos;
    private int mErros;
    private int mNumeroQuestao = 0;

    public void passar(View view){
        mudarQuestao();
    }

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quiz_raciocinio);

        mostrarPontos = (TextView)findViewById(R.id.pontos);
        mVerQuestao = (TextView)findViewById(R.id.questao);
        mBotaoOpcao1 = (Button)findViewById(R.id.opcao1);
        mBotaoOpcao2 = (Button)findViewById(R.id.opcao2);
        mBotaoOpcao3 = (Button)findViewById(R.id.opcao3);

        mudarQuestao();

        mBotaoOpcao1.setBackgroundColor(Color.LTGRAY);
        mBotaoOpcao2.setBackgroundColor(Color.LTGRAY);
        mBotaoOpcao3.setBackgroundColor(Color.LTGRAY);


        mBotaoOpcao1.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){


                if (mBotaoOpcao1.getText() == mRespostaCorreta){
                    mAcertos = mAcertos + 1;
                    updateScore(mAcertos);
                    mBotaoOpcao1.setBackgroundColor(Color.GREEN);
                    mBotaoOpcao2.setClickable(false);
                    mBotaoOpcao3.setClickable(false);

                }else {
                    mErros = mErros +1;
                    mBotaoOpcao1.setBackgroundColor(Color.RED);
                    mBotaoOpcao2.setClickable(false);
                    mBotaoOpcao3.setClickable(false);
                }
            }
        });


        mBotaoOpcao2.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){


                if (mBotaoOpcao2.getText() == mRespostaCorreta){
                    mAcertos = mAcertos + 1;
                    updateScore(mAcertos);
                    mBotaoOpcao2.setBackgroundColor(Color.GREEN);
                    mBotaoOpcao1.setClickable(false);
                    mBotaoOpcao3.setClickable(false);



                }else {
                    mErros = mErros +1;
                    mBotaoOpcao2.setBackgroundColor(Color.RED);
                    mBotaoOpcao1.setClickable(false);
                    mBotaoOpcao3.setClickable(false);
                }
            }
        });





        mBotaoOpcao3.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){


                if (mBotaoOpcao3.getText() == mRespostaCorreta){
                    mAcertos = mAcertos + 1;
                    updateScore(mAcertos);
                    mBotaoOpcao3.setBackgroundColor(Color.GREEN);
                    mBotaoOpcao2.setClickable(false);
                    mBotaoOpcao1.setClickable(false);

                }else {
                    mErros = mErros +1;
                    mBotaoOpcao3.setBackgroundColor(Color.RED);
                    mBotaoOpcao2.setClickable(false);
                    mBotaoOpcao1.setClickable(false);
                }
            }
        });


    }


    private void mudarQuestao() {
        mVerQuestao.setText(mLivrariaQuestao.getQuestao(mNumeroQuestao));
        mBotaoOpcao1.setText(mLivrariaQuestao.getOpcao1(mNumeroQuestao));
        mBotaoOpcao2.setText(mLivrariaQuestao.getOpcao2(mNumeroQuestao));
        mBotaoOpcao3.setText(mLivrariaQuestao.getOpcao3(mNumeroQuestao));

        mRespostaCorreta = mLivrariaQuestao.getRespostaCorreta(mNumeroQuestao);
        mNumeroQuestao++;

        mBotaoOpcao1.setBackgroundColor(Color.LTGRAY);
        mBotaoOpcao2.setBackgroundColor(Color.LTGRAY);
        mBotaoOpcao3.setBackgroundColor(Color.LTGRAY);
        mBotaoOpcao1.setClickable(true);
        mBotaoOpcao2.setClickable(true);
        mBotaoOpcao3.setClickable(true);


        if (mErros == 5) {
            Intent intent = new Intent(QuizRaciocinio.this, TelaFinalQuizLogica.class);
            String localizacao = "";
            localizacao = "" + mostrarPontos.getText();
            Bundle bundle = new Bundle();
            bundle.putString("1", localizacao);
            intent.putExtras(bundle);

            startActivity(intent);

        } else if (mNumeroQuestao == 26) {
            Intent intent = new Intent(QuizRaciocinio.this, TelaFinalQuizLogica.class);
            String localizacao = "";
            localizacao = "" + mostrarPontos.getText();
            Bundle bundle = new Bundle();
            bundle.putString("1", localizacao);
            intent.putExtras(bundle);

            startActivity(intent);

        }
    }


    private void updateScore(int point) {
        mostrarPontos.setText("" + mAcertos);
    }
}

package com.example.andrecristen.brincandoeaprendendo;


public class RacicinioLogico {

    private String mQuestoes [] = {
            "1", //1
            "2", //2
            "3", //3
            "4", //4
            "5", //5
            "", //6
            "", //7
            "", //8
            "", //9
            "", //10
            "", //11
            "", //12
            "", //13
            "",//14
            "",//15
            "",//16
            "",//17
            "",//18
            "",//19
            "",//20
            "",//21
            "",//22
            "",//23
            "",//24
            "",//25
            ""//26




    };


    private String mOpcoes [][] = {
            {"1", "", ""},//1
            {"", "2", ""},//2
            {"", "", "3"},//3
            {"", "4", ""},//4
            {"5", "", ""},//5
            {"", "", ""},//6
            {"", "", ""},//7
            {"", "", ""},//8
            {"", "", ""},//9
            {"", "", ""},//10
            {"", "", ""},//11
            {"", "", ""},//12
            {"", "", ""},//13
            {"", "", ""},//14
            {"", "", ""},//15
            {"", "", ""},//16
            {"", "", ""},//17
            {"", "", ""},//18
            {"", "", ""},//19
            {"", "", ""},//20
            {"", "", ""},//21
            {"", "", ""},//22
            {"", "", ""},//23
            {"", "", ""},//24
            {"", "", ""},//25
            {"", "", ""}//26
    };




    private String mRespostaCorreta[] = {"1", "2", "3", "4","5","","","","","","","","","","","","","","","","","","","","",""};




        public String getQuestao(int a) {
            String questao = mQuestoes[a];
            return questao;
        }


        public String getOpcao1(int a) {
            String Opcao0 = mOpcoes[a][0];
            return Opcao0;
        }


        public String getOpcao2(int a) {
            String Opcao1 = mOpcoes[a][1];
            return Opcao1;
        }

        public String getOpcao3(int a) {
            String Opcao2 = mOpcoes[a][2];
            return Opcao2;
        }

        public String getRespostaCorreta(int a) {
            String Resposta = mRespostaCorreta[a];
            return Resposta;
        }

    }



package com.example.andrecristen.brincandoeaprendendo;


public class LogicaMatematica {

    private String mQuestoes [] = {
            "300+174 = ?", //1
            "7+993 = ?", //2
            "65+148 = ?", //3
            "482+26 = ?", //4
            "100+578 = ?", //5
            "100-50 = ?", //6
            "200-173 = ?", //7
            "500-34 = ?", //8
            "700-458 = ?", //9
            "100-200 = ?", //10
            "5*(4+5) = ?", //11
            "3*(4*3) = ?", //12
            "((14+8+6*8*3)/56)*0 = ?", //13
            "(8*5)*4+(424*0) = ?",//14
            "1*2*3*4*5 = ?",//15
            "9/9 = ?",//16
            "(81/9)/3 = ?",//17
            "(120/5)*10 = ?",//18
            "((100/10)/1)/10 = ? ",//19
            "((5/5).(4/4).(3/3).(2/2))*2 = ?",//20
            "12 x 12 = ? = ?",//21
            "2 x 2 - ( - 2 ) = ?",//22
            "Quanto é PI(aproximadamente)?  ",//23
            "(-5-40)+1 = ?",//24
            "(-7-3)+100 = ?"//25

    };


    private String mOpcoes [][] = {
            {"474", "574", "374"},//1
            {"997", "1000", "993"},//2
            {"214", "213", "215"},//3
            {"508", "504", "604"},//4
            {"678", "578", "778"},//5
            {"50", "100", "150"},//6
            {"7", "0", "173"},//7
            {"434", "500", "466"},//8
            {"142", "242", "342"},//9
            {"-100", "100", "0"},//10
            {"5", "50", "45"},//11
            {"36", "26", "12"},//12
            {"12", "0", "56"},//13
            {"424", "160", "8"},//14
            {"120", "15", "100"},//15
            {"9", "0", "1"},//16
            {"3", "81", "9"},//17
            {"120", "80", "240"},//18
            {"1", "10", "100"},//19
            {"1", "2", "3"},//20
            {"144", "12", "24"},//21
            {"4", "-2", "6"},//22
            {"3,14 ", "2,14", "10"},//23
            {"45", "-44", "44"},//24
            {"-90", "90", "100"}//25
    };


    private String mRespostaCorreta[] = {"474", "1000", "213", "508","678","50","7","466","242","-100","45","36","0","160","120","1","3","240","1","2","144","6","3,14 ","-44","90"};




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


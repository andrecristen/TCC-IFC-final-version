package com.example.andrecristen.brincandoeaprendendo;


public class DesafiosPegadinhas {

    private String mQuestoes [] = {
            "O pai do padre é filho do meu pai. O que eu sou do Padre? ", //1
            "Se um tijolo pesa 1Kg mais meio tijolo, quanto pesa um tijolo e meio?", //2
            "Alexandre, o filho mais velho de Luís, está casado com Mariane. Ele tem exatamente metade da idade que seu pai está casado. Sabendo que Luís está casado há X anos, qual a idade de Alexandre ?\n", //3
            "Se você sai de São Paulo dirigindo um ônibus com 20 passageiros, deixa 18 e pega 14 no Rio de Janeiro e chega ao Espírito Santo às 12 horas do dia seguinte, você é capaz de dizer o nome do motorista?", //4
            "Se João levou 2 horas para cavar um buraco. Quantas horas ele levaria para cavar meio buraco?\n", //5
            "Se há 3 maçãs numa vasilha e você pega 2, com quantas você fica?\n", //6
            "Um criador tem 18 bois. Todos morrem, menos 7. Quantos ficam?", //7
            "Quantos aniversários fez alguém que viveu 78 anos, 10 meses e 6 dias?", //8
            "Se meia cabeça tem 50.000 fios de cabelo, quantos fios de cabelo tem uma careca inteira?\n", //9
            "Eu estava levando 10 vacas para o pasto, mas uma morreu. Quantas ficaram pelo caminho ?\n", //10
            "3 gatos comem 3 ratos em 3 minutos. Quanto tempo 100 gatos levam para comer 100 ratos ?\n", //11
            "Se ontem fosse amanhã, hoje seria sexta-feira. Que dia é hoje ?", //12
            "Andando pela rua, um homem corta 10 árvores à sua direita. Na volta corta 10 à sua esquerda. Quantas árvores ele cortou no total ?", //13
            "Quatro dúzias de perguntinhas e mais uma, quantas perguntas são ?",//14
            "7+7/7+7*7-7 = ?",//15
            "Um casal têm 6 filhos homens, cada irmão tem uma irmã. Quantas pessoas há na família ao todo ?\n",//16
            "Raiz quadrada de: (-4)²= ",//17
            "9-3 dividido ⅓ +1\n",//18
            "Em um teste, Marcos acertou 3 questões para cada questão que Luiza acertou. Se Marcos acertou 12 questões, quantas Luiza acertou ?",//19
            "Uma sequência de 5 números é formada por 1, 9, 25, 49 respectivamente. Qual o último número?",//20
            "Numa corrida de Fórmula 1, em que todos querem ganhar, você ultrapassa o segundo colocado. Em que lugar você fica ?",//21
            "Pedro rasgou sua camisa nova em dois lugares, abrindo dois buracos que atravessam sua camisa dos dois lados. Quantos buracos a partir de agora tem sua camisa ?\n",//22
            "Divida 40 por sua metade. Agora some 10, qual o resultado?\n",//23
            "O que é um primo dentro da matemática ?\n",//24
            "3, 7, 16 e 35 formam uma sequência de 5 números. Qual o 5º elemento ?",//25





    };


    private String mOpcoes [][] = {
            {"Tio", "Pai", "Irmão"},//1
            {"1,5kg", "3kg", "2kg"},//2
            {"X/2", "X/1", "X"},//3
            {"Ele", "Impossivel dizer", "Eu"},//4
            {"Nenhuma, não existe meio buraco", "Uma pois metade de dois é um", "Duas porque não muda"},//5
            {"1 o número restante", "3 o número de maçãs da vasilha", "2 o número de maçãs que você pegou\n"},//6
            {"7", "18", "11"},//7
            {"77", "79", "78"},//8
            {"50.000", "0", "100.000"},//9
            {"10", "9", "1"},//10
            {"30", "10", "1"},//11
            {"Quarta-feira", "Quinta-feira", "Sexta-feira"},//12
            {"10", "20", "0"},//13
            {"12", "49", "48"},//14
            {"0", "7", "50"},//15
            {"11", "9", "7"},//16
            {"4", "8", "12"},//17
            {"9", "10", "19"},//18
            {"3", "4", "12"},//19
            {"81", "57", "73"},//20
            {"Primeiro", "Segundo", "Terceiro"},//21
            {"2", "4", "8"},//22
            {"40", "12", "2"},//23
            {"Número divisível apenas por 1 e por ele mesmo", "Número divisível apenas por números negativos", "Número não divisível"},//24
            {"74", "47", "103"},//25
            {"", "", ""}//26
    };



    private String mRespostaCorreta[] = {"Tio", "3kg", "X/2", "Eu","Nenhuma, não existe meio buraco","2 o número de maçãs que você pegou\n","7","78","0","1","1","Quarta-feira","10","49","50","9","8","9","4","81","Segundo","8","12","Número divisível apenas por 1 e por ele mesmo","74",""};




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

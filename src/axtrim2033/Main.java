package axtrim2033;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;

public class Main {


    public static void main(String[] args) {

        //constantes desafio 1
        Scanner entrada = new Scanner(System.in);

        desafio1(entrada);
        desafio2(entrada);
        desafio3(entrada);
        desafio4(entrada);

        //TODO: meus desafios 3 e 4(Rennan Costa)
        //meus desafios
        /*desafio5();
        desafio6();*/
    }

    public static void desafio1(Scanner sc) {
        boolean acerto = false;

        String pergunta = "Você precisa de uma porta lógica que verifique entradas e somente a partir desta verificação " +
                "Chegue a uma saída VERDADEIRA, no entanto, ambas entradas também precisam ser VERDADEIRAS. " +
                "Qual porta lógica você deve usar para fazer essa verificação?";

        String respostaCorreta = "AND";
        List<String> alternativas = new ArrayList<>();

        alternativas.add(respostaCorreta);
        alternativas.add("NAND");
        alternativas.add("OR");
        alternativas.add("NO");
        alternativas.add("NOR");

        do {
            System.out.println(pergunta);

            Collections.shuffle(alternativas);

            System.out.println("a) " + alternativas.get(0));
            System.out.println("b) " + alternativas.get(1));
            System.out.println("c) " + alternativas.get(2));
            System.out.println("d) " + alternativas.get(3));
            System.out.println("e) " + alternativas.get(4));

            System.out.print("Escolha uma alternativa: ");
            char escolha = sc.next().toLowerCase().charAt(0);

            switch (escolha) {
                case 'a':
                    //comparando a alternativa escolhida com a resposta correta
                    if (alternativas.get(0).equals(respostaCorreta)) {
                        System.out.println("Resposta correta, parabens!.");
                        acerto = true;
                    } else {
                        System.out.println("Resposta incorreta, tente novamente.");
                    }
                    break;
                case 'b':
                    if (alternativas.get(1).equals(respostaCorreta)) {
                        System.out.println("Resposta correta, parabens!.");
                        acerto = true;
                    } else {
                        System.out.println("Resposta incorreta, tente novamente.");
                    }
                    break;
                case 'c':
                    if (alternativas.get(2).equals(respostaCorreta)) {
                        System.out.println("Resposta correta, parabens!.");
                        acerto = true;
                    } else {
                        System.out.println("Resposta incorreta, tente novamente.");
                    }
                    break;
                case 'd':
                    if (alternativas.get(3).equals(respostaCorreta)) {
                        System.out.println("Resposta correta, parabens!.");
                        acerto = true;
                    } else {
                        System.out.println("Resposta incorreta, tente novamente.");
                    }
                    break;
                case 'e':
                    if (alternativas.get(4).equals(respostaCorreta)) {
                        System.out.println("Resposta correta, parabens!.");
                        acerto = true;
                    } else {
                        System.out.println("Resposta incorreta, tente novamente.");
                    }
                    break;
                default:
                    System.out.println("Resposta incorreta, tente novamente.");
                    break;
            }
        } while (!acerto);
    }

    public static void desafio2(Scanner sc) {
        boolean acerto = false;

        String pergunta = "Qual das alternativas representa a escolha adequada de portas lógicas em relação às seguintes necessidades: \n" +
                " • Só tenha saída VERDADEIRA, quando as duas entradas forem FALSAS\n" +
                " • Representa a lógica: S = ~ (A.B)\n" +
                " • Representa a lógica: S = ~ (A+B)";

        String respostaCorreta = "NAND ; NAND ; NOR";

        List<String> alternativas = new ArrayList<>();
        alternativas.add(respostaCorreta);
        alternativas.add("NOR ; NOR ; NAND");
        alternativas.add("NAND ; NOR ; NOR");
        alternativas.add("NOR ; NOR ; NOR");
        alternativas.add("NAND ; NAND ; NAND");

        do {
            System.out.println(pergunta);
            Collections.shuffle(alternativas);

            System.out.println("a) " + alternativas.get(0));
            System.out.println("b) " + alternativas.get(1));
            System.out.println("c) " + alternativas.get(2));
            System.out.println("d) " + alternativas.get(3));
            System.out.println("e) " + alternativas.get(4));

            System.out.print("Escolha uma alternativa: ");
            char escolha = sc.next().toLowerCase().charAt(0);

            switch (escolha) {
                case 'a':
                    //comparando a alternativa escolhida com a resposta correta
                    if (alternativas.get(0).equals(respostaCorreta)) {
                        System.out.println("Resposta correta, parabens!.");
                        acerto = true;
                    } else {
                        System.out.println("Resposta incorreta, tente novamente.");
                    }
                    break;
                case 'b':
                    if (alternativas.get(1).equals(respostaCorreta)) {
                        System.out.println("Resposta correta, parabens!.");
                        acerto = true;
                    } else {
                        System.out.println("Resposta incorreta, tente novamente.");
                    }
                    break;
                case 'c':
                    if (alternativas.get(2).equals(respostaCorreta)) {
                        System.out.println("Resposta correta, parabens!.");
                        acerto = true;
                    } else {
                        System.out.println("Resposta incorreta, tente novamente.");
                    }
                    break;
                case 'd':
                    if (alternativas.get(3).equals(respostaCorreta)) {
                        System.out.println("Resposta correta, parabens!.");
                        acerto = true;
                    } else {
                        System.out.println("Resposta incorreta, tente novamente.");
                    }
                    break;
                case 'e':
                    if (alternativas.get(4).equals(respostaCorreta)) {
                        System.out.println("Resposta correta, parabens!.");
                        acerto = true;
                    } else {
                        System.out.println("Resposta incorreta, tente novamente.");
                    }
                    break;
                default:
                    System.out.println("Resposta incorreta, tente novamente.");
                    break;
            }
        } while (!acerto);
    }

    public static void desafio3(Scanner sc) {
        boolean acerto = false;
        String tabela = "-------------\n" +
                "| A | B | S |\n" +
                "| 0 | 0 | 1 |\n" +
                "| 0 | 1 | 0 |\n" +
                "| 1 | 0 | 0 |\n" +
                "| 1 | 1 | 0 |\n" +
                "-------------";
        String questao3 = "Observando a tabela podemos dizer que a porta logica que esta sendo utilizada é a:";
        String respostaCorretaQuestao3 = "NOR";
        List<String> alternativasQuestao3 = new ArrayList<>();

        //populando a lista com as alternativas
        alternativasQuestao3.add(respostaCorretaQuestao3);
        alternativasQuestao3.add("NAND");
        alternativasQuestao3.add("XNOR");
        alternativasQuestao3.add("AND");
        alternativasQuestao3.add("OR");

        //exibindo a pergunta:
        System.out.println("");
        System.out.println(tabela);
        System.out.println(questao3);
        System.out.println();

        do {
            //embaralhando as alternativas
            Collections.shuffle(alternativasQuestao3);

            //recuperando as alternativas pelo indice da lista
            System.out.println("a) " + alternativasQuestao3.get(0));
            System.out.println("b) "+ alternativasQuestao3.get(1));
            System.out.println("c) "+ alternativasQuestao3.get(2));
            System.out.println("d) "+ alternativasQuestao3.get(3));
            System.out.println("e) "+ alternativasQuestao3.get(4));

            System.out.println("");
            System.out.println("Escolha uma alternativa: ");

            //capturando o primeiro caractere digitado e forçando ele a ser minusculo
            char alt = sc.next().toLowerCase().charAt(0);

            switch (alt) {
                case 'a':
                    //comparando a alternativa escolhida com a resposta correta
                    if (alternativasQuestao3.get(0).equals(respostaCorretaQuestao3)) {
                        System.out.println("Resposta correta, parabens!.");
                        acerto = true;
                    } else {
                        System.out.println("Resposta incorreta, tente novamente.");
                    }
                    break;
                case 'b':
                    if (alternativasQuestao3.get(1).equals(respostaCorretaQuestao3)) {
                        System.out.println("Resposta correta, parabens!.");
                        acerto = true;
                    } else {
                        System.out.println("Resposta incorreta, tente novamente.");
                    }
                    break;
                case 'c':
                    if (alternativasQuestao3.get(2).equals(respostaCorretaQuestao3)) {
                        System.out.println("Resposta correta, parabens!.");
                        acerto = true;
                    } else {
                        System.out.println("Resposta incorreta, tente novamente.");
                    }
                    break;
                case 'd':
                    if (alternativasQuestao3.get(3).equals(respostaCorretaQuestao3)) {
                        System.out.println("Resposta correta, parabens!.");
                        acerto = true;
                    } else {
                        System.out.println("Resposta incorreta, tente novamente.");
                    }
                    break;
                case 'e':
                    if (alternativasQuestao3.get(4).equals(respostaCorretaQuestao3)) {
                        System.out.println("Resposta correta, parabens!.");
                        acerto = true;
                    } else {
                        System.out.println("Resposta incorreta, tente novamente.");
                    }
                    break;
                default:
                    System.out.println("Resposta incorreta, tente novamente.");
                    break;
            }
        } while (!acerto);
    }

    public static void desafio4(Scanner sc) {
        boolean acerto = false;
        String questao4 = "Qual a expressão booleana representa corretamente a operação OR ?";
        String respostaCorretaQuestao4 = "S = A + B";
        List<String> alternativasQuestao4 = new ArrayList<>();

        //populando a lista com as alternativas
        alternativasQuestao4.add(respostaCorretaQuestao4);
        alternativasQuestao4.add("S = A + B . C");
        alternativasQuestao4.add("S = A.B = AB");
        alternativasQuestao4.add("S = A.B.C = ABC");
        alternativasQuestao4.add("S = ~A");

        //exibindo a pergunta:
        System.out.println("");
        System.out.println(questao4);
        System.out.println();

        do {
            //embaralhando as alternativas
            Collections.shuffle(alternativasQuestao4);

            //recuperando as alternativas pelo indice da lista
            System.out.println("a) " + alternativasQuestao4.get(0));
            System.out.println("b) "+ alternativasQuestao4.get(1));
            System.out.println("c) "+ alternativasQuestao4.get(2));
            System.out.println("d) "+ alternativasQuestao4.get(3));
            System.out.println("e) "+ alternativasQuestao4.get(4));

            System.out.println("");
            System.out.println("Escolha uma alternativa: ");

            //capturando o primeiro caractere digitado e forçando ele a ser minusculo
            char alt = sc.next().toLowerCase().charAt(0);

            switch (alt) {
                case 'a':
                    //comparando a alternativa escolhida com a resposta correta
                    if (alternativasQuestao4.get(0).equals(respostaCorretaQuestao4)) {
                        System.out.println("Resposta correta, parabens!.");
                        acerto = true;
                    } else {
                        System.out.println("Resposta incorreta, tente novamente.");
                    }
                    break;
                case 'b':
                    if (alternativasQuestao4.get(1).equals(respostaCorretaQuestao4)) {
                        System.out.println("Resposta correta, parabens!.");
                        acerto = true;
                    } else {
                        System.out.println("Resposta incorreta, tente novamente.");
                    }
                    break;
                case 'c':
                    if (alternativasQuestao4.get(2).equals(respostaCorretaQuestao4)) {
                        System.out.println("Resposta correta, parabens!.");
                        acerto = true;
                    } else {
                        System.out.println("Resposta incorreta, tente novamente.");
                    }
                    break;
                case 'd':
                    if (alternativasQuestao4.get(3).equals(respostaCorretaQuestao4)) {
                        System.out.println("Resposta correta, parabens!.");
                        acerto = true;
                    } else {
                        System.out.println("Resposta incorreta, tente novamente.");
                    }
                    break;
                case 'e':
                    if (alternativasQuestao4.get(4).equals(respostaCorretaQuestao4)) {
                        System.out.println("Resposta correta, parabens!.");
                        acerto = true;
                    } else {
                        System.out.println("Resposta incorreta, tente novamente.");
                    }
                    break;
                default:
                    System.out.println("Resposta incorreta, tente novamente.");
                    break;
            }
        } while (!acerto);
    }

    public static void desafio7() {

        Scanner lets = new Scanner(System.in);

        ArrayList opcao = new ArrayList<String>();
        ArrayList respostas = new ArrayList<String>();

        String altString, respC, r;
        int H = 0;

        int contador = 0;
        int contad = 1;

        boolean result = false;

        opcao.add("(A)");
        opcao.add("(B)");
        opcao.add("(C)");
        opcao.add("(D)");
        opcao.add("(E)");

        respostas.add("110111");
        respostas.add("11111011100");
        respostas.add("111110111000");
        respostas.add("111110111");
        respostas.add("1111010101");

        respC = "11111011100";

        do {

            System.out.println(
                    "Os computadores utilizam o sistema bin�rio ou de base 2 que � um sistema de numera��o em que todas as quantidades se representam com base em dois \n "
                            + "n�meros, ou seja, (0 e 1). Em um computador o n�mero 2012, em base decimal, ser� representado, em base bin�ria, por:\r\n");

            for (int L = 1; L <= 5; L++) {

                System.out.println(opcao.get(L - 1) + " - " + respostas.get(L - 1));
            }

            System.out.println("Digite a alternativa correta: ");

            r = lets.next();

            switch (r.toLowerCase()) {

                case "a":
                case "A":
                    H = 0;

                    break;

                case "b":
                case "B":
                    H = 1;

                    break;

                case "c":
                case "C":
                    H = 2;

                    break;

                case "d":
                case "D":
                    H = 3;

                    break;

                case "e":
                case "E":
                    H = 4;

                    break;

                default:

                    System.out.println("Alternativa invalida");

            }
            if (respostas.get(H).equals(respC)) {

                System.out.println("Resposta correta.");
                result = true;

            } else {

                System.out.println("Resposta incorreta.");
                Collections.shuffle(respostas);

            }

        } while (result == false);

        lets.close();
    }

    private static void desafio5() {
        Scanner entrada = new Scanner(System.in);
        String opcao;

        int cont = 1;
        int tentativas = 0;
        boolean acerto = false;

        System.out.println("Em qual base num�rica est� o numero 10101110 ");

        do {

            System.out.println("A)Est� em hexadecimal");
            System.out.println("B)Est� em decimal");
            System.out.println("C)Est� em binario");
            System.out.println("D)Est� em octal");
            System.out.println("E)Est� na Base 10");

            System.out.println("R: ");
            opcao = entrada.next();

            switch (opcao) {
                case "C":
                case "c":
                    acerto = true;
                    System.out.println("Resposta Correta! ");
                    cont = 4;
                    tentativas++;
                    break;

                default:
                    System.out.println("Resposta Incorreta! ");
                    tentativas++;
                    cont++;
            }

        } while (cont < 4);
        if (acerto) {
            System.out.println("Acertou na tentativa " + tentativas);

        } else {
            System.out.println("As 3 tentativas est�o incorretas ");

        }
    }

    public static void desafio8() {

        Scanner lets = new Scanner(System.in);

        ArrayList opcao = new ArrayList<String>();
        ArrayList respostas = new ArrayList<String>();

        String altString, respC, r;
        int H = 0;

        int contador = 0;
        int contad = 1;

        boolean result = false;

        opcao.add("(A)");
        opcao.add("(B)");
        opcao.add("(C)");
        opcao.add("(D)");
        opcao.add("(E)");

        respostas.add("245");
        respostas.add("101");
        respostas.add("111");
        respostas.add("267");

        respC = "245";

        do {

            System.out.println("1) 0101001.");

            System.out.println("2) 1101001.");

            System.out.println("3) 0001101.");

            System.out.println("4) 1010110");

            for (int L = 1; L <= 4; L++) {

                System.out.println(opcao.get(L - 1) + " - " + respostas.get(L - 1));
            }

            System.out.println(
                    "Assinale a alternativa que apresenta o somat�rio dos 4 n�meros acima convertidos para o formato decimal.");

            r = lets.next();

            switch (r.toLowerCase()) {

                case "a":
                case "A":
                    H = 0;

                    break;

                case "b":
                case "B":
                    H = 1;

                    break;

                case "c":
                case "C":
                    H = 2;

                    break;

                case "d":
                case "D":
                    H = 3;

                    break;

                case "e":
                case "E":
                    H = 4;

                    break;

                default:

                    System.out.println("Alternativa invalida");

            }
            if (respostas.get(H).equals(respC)) {

                System.out.println("Resposta correta.");
                result = true;

            } else {

                System.out.println("Resposta incorreta.");
                Collections.shuffle(respostas);

            }

        } while (result == false);

        lets.close();
    }

    public static void desafio6() {

        Scanner entrada = new Scanner(System.in);
        String opcao;

        int cont = 1;
        int tentativas = 0;
        boolean acerto = false;

        System.out
                .println("Quantos bits devem ser agrupados se voc� modificar da base (Bin�ria) para a base (Octal)? ");

        do {

            System.out.println("A)2");
            System.out.println("B)3");
            System.out.println("C)1");
            System.out.println("D)4");
            System.out.println("E)Nenhum");

            System.out.print("R: ");
            opcao = entrada.next();

            switch (opcao) {
                case "B":
                case "b":
                    acerto = true;
                    System.out.println("Resposta Correta! ");
                    cont = 4;
                    tentativas++;
                    break;

                default:
                    System.out.println("Resposta Incorreta! ");
                    tentativas++;
                    cont++;
            }

        } while (cont < 4);
        if (acerto) {
            System.out.println("Acertou na tentativa " + tentativas);

        } else {
            System.out.println("As 3 tentativas est�o incorretas ");

        }

    }

    public static void imprimiTexto(String mensagem, TimeUnit unit, long tempo_mensagem) throws InterruptedException {
        for (char caractere : mensagem.toCharArray()) {
            System.out.print(caractere);
            unit.sleep(tempo_mensagem);
        }
    }

}

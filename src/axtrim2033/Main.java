package axtrim2033;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;

public class Main {

    public static void main(String[] args) {
        //constante
        Scanner entrada = new Scanner(System.in);

        menu(entrada);

    }
    
    public static boolean esperaAcaoUsuario() {
        Scanner esperaPeloEnter = new Scanner( System.in );
        System.out.println( "Pressione alguma tecla para Continuar" );
        esperaPeloEnter.nextLine();
        return true;
    }

    public static void menu(Scanner sc) {
        int escolha = 0;
        do {
            System.out.println("");
            System.out.println("..:: Axtrim 2033 ::..");
            System.out.println("1 - Instruções \n2 - Jogar \n3 - Créditos \n4 - Sair");
            escolha = sc.nextInt();

            switch (escolha) {
                case 1:
                    //chamar método para as instruções
                    instrucoes();
                    break;
                case 2:
                    //chamar método para jogar
                    System.out.println("Jogar");
                    break;
                case 3:
                    //chamar método para os créditos
                    creditos();
                    break;
                case 4:
                    //chamar metodo para sair
                    sairDoJogo();
                    break;
                default:
                    System.out.println("Opção inválida!");
            }
        } while (escolha <= 0 || escolha >= 5);
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
        String pergunta = "Observando a tabela podemos dizer que a porta logica que esta sendo utilizada é a:";
        String respostaCorreta = "NOR";
        List<String> alternativas = new ArrayList<>();

        //populando a lista com as alternativas
        alternativas.add(respostaCorreta);
        alternativas.add("NAND");
        alternativas.add("XNOR");
        alternativas.add("AND");
        alternativas.add("OR");

        //exibindo a pergunta:
        System.out.println("");
        System.out.println(tabela);
        System.out.println(pergunta);
        System.out.println();

        do {
            //embaralhando as alternativas
            Collections.shuffle(alternativas);

            //recuperando as alternativas pelo indice da lista
            System.out.println("a) " + alternativas.get(0));
            System.out.println("b) " + alternativas.get(1));
            System.out.println("c) " + alternativas.get(2));
            System.out.println("d) " + alternativas.get(3));
            System.out.println("e) " + alternativas.get(4));

            System.out.println("");
            System.out.println("Escolha uma alternativa: ");

            //capturando o primeiro caractere digitado e forçando ele a ser minusculo
            char alt = sc.next().toLowerCase().charAt(0);

            switch (alt) {
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

    public static void desafio4(Scanner sc) {
        boolean acerto = false;
        String pergunta = "Qual a expressão booleana representa corretamente a operação OR ?";
        String respostaCorreta = "S = A + B";
        List<String> alternativas = new ArrayList<>();

        //populando a lista com as alternativas
        alternativas.add(respostaCorreta);
        alternativas.add("S = A + B . C");
        alternativas.add("S = A.B = AB");
        alternativas.add("S = A.B.C = ABC");
        alternativas.add("S = ~A");

        //exibindo a pergunta:
        System.out.println("");
        System.out.println(pergunta);
        System.out.println();

        do {
            //embaralhando as alternativas
            Collections.shuffle(alternativas);

            //recuperando as alternativas pelo indice da lista
            System.out.println("a) " + alternativas.get(0));
            System.out.println("b) " + alternativas.get(1));
            System.out.println("c) " + alternativas.get(2));
            System.out.println("d) " + alternativas.get(3));
            System.out.println("e) " + alternativas.get(4));

            System.out.println("");
            System.out.println("Escolha uma alternativa: ");

            //capturando o primeiro caractere digitado e forçando ele a ser minusculo
            char alt = sc.next().toLowerCase().charAt(0);

            switch (alt) {
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

    public static void desafio5(Scanner sc) {
        boolean acerto = false;

        String pergunta = "Em qual base numerica está o numero 10101110 ";
        String respostaCorreta = "Está em binario";

        List<String> alternativas = new ArrayList<>();
        alternativas.add(respostaCorreta);
        alternativas.add("Está em hexadecimal");
        alternativas.add("Está em decimal");
        alternativas.add("Está em octal");
        alternativas.add("Está na Base 10");

        do {
            Collections.shuffle(alternativas);
            System.out.println(pergunta);

            System.out.println("a) " + alternativas.get(0));
            System.out.println("b) " + alternativas.get(1));
            System.out.println("c) " + alternativas.get(2));
            System.out.println("d) " + alternativas.get(3));
            System.out.println("e) " + alternativas.get(4));

            System.out.println("Escolha uma alternativa");
            char alt = sc.next().toLowerCase().charAt(0);

            switch (alt) {
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

    public static void desafio6(Scanner sc) {
        boolean acerto = false;

        String perugnta = "Quantos bits devem ser agrupados se você modificar da base (Binária) para a base (Octal)?";
        String respostaCorreta = "3";

        List<String> alternativas = new ArrayList<>();
        alternativas.add(respostaCorreta);
        alternativas.add("2");
        alternativas.add("1");
        alternativas.add("4");
        alternativas.add("Nenhum");

        do {
            Collections.shuffle(alternativas);
            System.out.println(perugnta);

            System.out.println("a) " + alternativas.get(0));
            System.out.println("b) " + alternativas.get(1));
            System.out.println("c) " + alternativas.get(2));
            System.out.println("d) " + alternativas.get(3));
            System.out.println("e) " + alternativas.get(4));

            System.out.print("Escolha uma alternativa: ");
            char alt = sc.next().toLowerCase().charAt(0);

            switch (alt) {
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

    public static void desafio7(Scanner sc) {
        boolean acerto = false;

        String pergunta = "Os computadores utilizam o sistema binário ou de base 2 que é um sistema de numeração em que todas as quantidades se representam com base em dois \\n \"\n" +
                "+ \"números, ou seja, (0 e 1). Em um computador o número 2012, em base decimal, será representado, em base binária, por:\\r\\n";

        String respostaCorreta = "11111011100";

        List<String> alternativas = new ArrayList<>();
        alternativas.add(respostaCorreta);
        alternativas.add("110111");
        alternativas.add("111110111000");
        alternativas.add("111110111");
        alternativas.add("1111010101");

        do {
            Collections.shuffle(alternativas);
            System.out.println(pergunta);

            System.out.println("a) " + alternativas.get(0));
            System.out.println("b) " + alternativas.get(1));
            System.out.println("c) " + alternativas.get(2));
            System.out.println("d) " + alternativas.get(3));
            System.out.println("e) " + alternativas.get(4));

            System.out.print("Escolha uma alternativa: ");
            char alt = sc.next().toLowerCase().charAt(0);

            switch (alt) {
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

    public static void desafio8(Scanner sc) {
        boolean acerto = false;

        String pergunta = "Assinale a alternativa que apresenta o somat�rio dos 4 n�meros acima convertidos para o formato decimal: ";
        String respostaCorreta = "245";

        List<String> alternativas = new ArrayList<>();
        alternativas.add(respostaCorreta);
        alternativas.add("101");
        alternativas.add("101");
        alternativas.add("111");
        alternativas.add("267");

        do {
            Collections.shuffle(alternativas);
            System.out.println(pergunta);

            System.out.println("a) " + alternativas.get(0));
            System.out.println("b) " + alternativas.get(1));
            System.out.println("c) " + alternativas.get(2));
            System.out.println("d) " + alternativas.get(3));
            System.out.println("e) " + alternativas.get(4));

            System.out.print("Escolha uma alternativa: ");
            char alt = sc.next().toLowerCase().charAt(0);

            switch (alt) {
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

    public static boolean desafio9() {

        List<String> alternativas = Arrays.asList(
                "Binário, Octal, Decimal, Hexadecimal.",
                "Binário, Extradecimal, Octal, Hexadecimal.",
                "Binário, Octal, Lógica, Extradecimal, Hexadecimal.",
                "Bicentenário, Binário, Octal, Hexadecimal.",
                "Binário, Octal, Decimal, Sistema Operacional.");
        String alternativaEscolhida = null;
        String paraImprimir = null;
        String alternativaCorreta = "Binário, Octal, Decimal, Hexadecimal.";
        String opcaoSelecionada = null;
        int contador = 0;
        Scanner ent = new Scanner(System.in);

        do {
            contador++;
            if (contador >= 2) {
                System.out.println("Resposta incorreta! Tente novamente" + "\n");
            }
            Collections.shuffle(alternativas);
            System.out.println("\nVOCÊ SABE ME RESPONDER, QUAIS OS TIPOS MAIS CONHECIDOS DE BASES NÚMERICAS?"
                    + "\n"
                    + "\nESCOLHA SUA ALTERNATIVA, SABIAMENTE: "
                    + "\n"
                    + "\n(A) - " + alternativas.get(0)
                    + "\n(B) - " + alternativas.get(1)
                    + "\n(C) - " + alternativas.get(2)
                    + "\n(D) - " + alternativas.get(3)
                    + "\n(E) - " + alternativas.get(4));
            opcaoSelecionada = ent.next().toUpperCase();

            switch (opcaoSelecionada) {
                case "A":
                    alternativaEscolhida = alternativas.get(0);
                    paraImprimir = "(A) - " + alternativas.get(0);
                    System.out.println("Você escolheu a alternativa: " + paraImprimir);
                    break;
                case "B":
                    alternativaEscolhida = alternativas.get(1);
                    paraImprimir = "(B) - " + alternativas.get(1);
                    System.out.println("Você escolheu a alternativa: " + paraImprimir);
                    break;
                case "C":
                    alternativaEscolhida = alternativas.get(2);
                    paraImprimir = "(C) - " + alternativas.get(2);
                    System.out.println("Você escolheu a alternativa: " + paraImprimir);
                    break;
                case "D":
                    alternativaEscolhida = alternativas.get(3);
                    paraImprimir = "(D) - " + alternativas.get(3);
                    System.out.println("Você escolheu a alternativa: " + paraImprimir);
                    break;
                case "E":
                    alternativaEscolhida = alternativas.get(4);
                    paraImprimir = "(E) - " + alternativas.get(4);
                    System.out.println("Você escolheu a alternativa: " + paraImprimir);
                    break;
                default:
                    System.out.println("Você não escolheu uma alternativa válida!");
                    break;
            }
        } while (!alternativaCorreta.equals(alternativaEscolhida));
        System.out.println("Ótimo, era tudo que eu gostaria de saber " + "\n" + paraImprimir);

        return true;
    }

    public static void instrucoes() {
        Scanner sc = new Scanner(System.in);
        int escolha = 0;
        System.out.println("- Instruções -");
        System.out.println("Axtrim2033 apresenta vários desafios de multipla escolha, \n" +
                "basta escolhar uma das alternativas que será exibida (a,b,c,d OU e).\n" +
                "mas escolha com sabedoria, o destino do mundo está em suas mãos...");
        do {
            System.out.println("");
            System.out.println("1 - Voltar para o menu principal");
            escolha = sc.nextInt();
            switch (escolha) {
                case 1:
                    menu(sc);
                    break;
                default:
                    System.out.println("Opção inválida");
            }
        } while (escolha != 1);
    }

    public static void creditos() {
        Scanner sc = new Scanner(System.in);
        int escolha = 0;
        System.out.println("- Desenvolvido por - ");
        System.out.println("");
        System.out.println("-------------------");
        System.out.println("*  Edson Costa    *");
        System.out.println("*  Henrique Obata *");
        System.out.println("*  Julio Domingos *");
        System.out.println("*  Paulo Ribeiro  *");
        System.out.println("*  Rennan Costa   *");
        System.out.println("-------------------");
        do {
            System.out.println("");
            System.out.println("1 - Voltar para o menu principal");
            escolha = sc.nextInt();
            switch (escolha) {
                case 1:
                    menu(sc);
                    break;
                default:
                    System.out.println("Opção inválida");
            }
        } while (escolha != 1);
    }

    public static void imprimiTexto(String mensagem, TimeUnit unit, long tempo_mensagem) throws InterruptedException {
        for (char caractere : mensagem.toCharArray()) {
            System.out.print(caractere);
            unit.sleep(tempo_mensagem);
        }
    }

    public static void sairDoJogo() {
        System.exit(0);
    }
}

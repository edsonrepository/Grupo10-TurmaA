package axtrim2033;

import java.util.*;
import java.util.concurrent.TimeUnit;

public class Main {

    //cores
    public static final String ANSI_CYAN = "\u001B[36m";
    public static final String ANSI_RED = "\u001B[31m";
    public static final String ANSI_RESET = "\u001B[0m";
    public static final String ANSI_YELLOW = "\u001B[33m";
    public static final String ANSI_GREEN = "\u001B[32m";

    //constantes
    static int temp_narrativa = 0, temp_dialog = 0;
    static String nomePersonagem = "";

    public static void main(String[] args) {
        //constante
        Scanner entrada = new Scanner(System.in);


        //menu(entrada);
        capitulo1();
        //capitulo2();

    }

    public static boolean esperaAcaoUsuario() {
        Scanner esperaPeloEnter = new Scanner(System.in);
        System.out.println("Pressione alguma tecla para Continuar");
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

    public static boolean desafio2(Scanner sc) {
        boolean acerto = false;
        int tentativas = 0;

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
                        tentativas = 4;
                        return true;
                    } else {
                        System.out.println("Resposta incorreta, tente novamente.");
                        tentativas++;
                    }
                    break;
                case 'b':
                    if (alternativas.get(1).equals(respostaCorreta)) {
                        System.out.println("Resposta correta, parabens!.");
                        acerto = true;
                        tentativas = 4;
                        return true;
                    } else {
                        System.out.println("Resposta incorreta, tente novamente.");
                        tentativas++;
                    }
                    break;
                case 'c':
                    if (alternativas.get(2).equals(respostaCorreta)) {
                        System.out.println("Resposta correta, parabens!.");
                        tentativas = 4;
                        acerto = true;
                        return true;
                    } else {
                        System.out.println("Resposta incorreta, tente novamente.");
                        tentativas++;
                    }
                    break;
                case 'd':
                    if (alternativas.get(3).equals(respostaCorreta)) {
                        System.out.println("Resposta correta, parabens!.");
                        tentativas = 4;
                        acerto = true;
                        return true;
                    } else {
                        System.out.println("Resposta incorreta, tente novamente.");
                        tentativas++;
                    }
                    break;
                case 'e':
                    if (alternativas.get(4).equals(respostaCorreta)) {
                        System.out.println("Resposta correta, parabens!.");
                        tentativas = 4;
                        acerto = true;
                        return true;
                    } else {
                        System.out.println("Resposta incorreta, tente novamente.");
                        tentativas++;
                    }
                    break;
                default:
                    System.out.println("Resposta incorreta, tente novamente.");
                    break;
            }
        } while (tentativas < 3);
        return false;
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

    public static int desafio4(Scanner sc) {
        int tentativas = 0;
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
                        tentativas++;
                        acerto = true;
                        return tentativas;
                    } else {
                        System.out.println("Resposta incorreta, tente novamente.");
                        tentativas++;
                    }
                    break;
                case 'b':
                    if (alternativas.get(1).equals(respostaCorreta)) {
                        System.out.println("Resposta correta, parabens!.");
                        tentativas++;
                        acerto = true;
                        return tentativas;
                    } else {
                        System.out.println("Resposta incorreta, tente novamente.");
                        tentativas++;
                    }
                    break;
                case 'c':
                    if (alternativas.get(2).equals(respostaCorreta)) {
                        System.out.println("Resposta correta, parabens!.");
                        tentativas++;
                        acerto = true;
                        return tentativas;
                    } else {
                        System.out.println("Resposta incorreta, tente novamente.");
                        tentativas++;
                    }
                    break;
                case 'd':
                    if (alternativas.get(3).equals(respostaCorreta)) {
                        System.out.println("Resposta correta, parabens!.");
                        tentativas++;
                        acerto = true;
                        return tentativas;
                    } else {
                        System.out.println("Resposta incorreta, tente novamente.");
                        tentativas++;
                    }
                    break;
                case 'e':
                    if (alternativas.get(4).equals(respostaCorreta)) {
                        System.out.println("Resposta correta, parabens!.");
                        tentativas++;
                        acerto = true;
                        return tentativas;
                    } else {
                        System.out.println("Resposta incorreta, tente novamente.");
                        tentativas++;
                    }
                    break;
                default:
                    System.out.println("Resposta incorreta, tente novamente.");
                    tentativas++;
                    break;
            }
        } while (!acerto);
        return 1;
    }

    public static int desafio5(Scanner sc) {
        int tentativas = 0;
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
                        tentativas++;
                        return tentativas;
                    } else {
                        System.out.println("Resposta incorreta, tente novamente.");
                        tentativas++;
                    }
                    break;
                case 'b':
                    if (alternativas.get(1).equals(respostaCorreta)) {
                        System.out.println("Resposta correta, parabens!.");
                        acerto = true;
                        tentativas++;
                        return tentativas;
                    } else {
                        System.out.println("Resposta incorreta, tente novamente.");
                        tentativas++;
                    }
                    break;
                case 'c':
                    if (alternativas.get(2).equals(respostaCorreta)) {
                        System.out.println("Resposta correta, parabens!.");
                        acerto = true;
                        tentativas++;
                        return tentativas;
                    } else {
                        System.out.println("Resposta incorreta, tente novamente.");
                        tentativas++;
                    }
                    break;
                case 'd':
                    if (alternativas.get(3).equals(respostaCorreta)) {
                        System.out.println("Resposta correta, parabens!.");
                        acerto = true;
                        tentativas++;
                        return tentativas;
                    } else {
                        System.out.println("Resposta incorreta, tente novamente.");
                        tentativas++;
                    }
                    break;
                case 'e':
                    if (alternativas.get(4).equals(respostaCorreta)) {
                        System.out.println("Resposta correta, parabens!.");
                        acerto = true;
                        tentativas++;
                        return tentativas;
                    } else {
                        System.out.println("Resposta incorreta, tente novamente.");
                        tentativas++;
                    }
                    break;
                default:
                    System.out.println("Resposta incorreta, tente novamente.");
                    tentativas++;
                    break;
            }
        } while (!acerto);
        return 1;
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

    public static void capitulo1() {
        Scanner sc = new Scanner(System.in);
        try {
            imprimiTexto(destacaPersonagemPrincipal("???") + ": 2033, a pandemia já foi vencida, fomos vacinados e curados\n" +
                    "mas as pessoas ainda continuam distantes uma das outras, nem sei ao certo o porque,\n" +
                    "talvez medo de um novo virus, ou uma nova onda de doenças fatais.. \n" +
                    "eu me chamo: ", TimeUnit.MILLISECONDS, temp_narrativa);
            nomePersonagem = sc.next();

            System.out.println("\n");
            imprimiTexto(destacaPersonagemPrincipal(nomePersonagem) + ": Sou programador, e estou procurando um novo emprego a um bom tempo\n" +
                    "tem sido dificil, estou dormindo muito mal ultimamente, tendo pesadelos estranhos onde\n" +
                    "sempre estou conectado a vários cabos que estão interligados ao que parece ser computadores futuristas, não sei se isso tem algum significado,\ntalvez esse mundo não seja exatamente o que pensamos ser..\n", TimeUnit.MILLISECONDS, temp_narrativa);
            imprimiTexto("Mas hoje, fui chamado para uma entrevista de emprego, espero que der tudo certo.. ", TimeUnit.MILLISECONDS, temp_narrativa);
            System.out.println("\n");
            imprimiTexto("No caminho para entrevista, " + destacaPersonagemPrincipal(nomePersonagem) + " anda pela calçada...\n" +
                    "", TimeUnit.MILLISECONDS, temp_narrativa);
            System.out.println("\n");
            imprimiTexto("Então ele nota que um carro preto e misterioso o segue lentamente..", TimeUnit.MILLISECONDS, temp_narrativa);
            System.out.println("\n");
            imprimiTexto("Com isso " + destacaPersonagemPrincipal(nomePersonagem) + " para e encara o carro, o vidro desse, uma figura usando roupas pretas e oculos escuros misteriosa o encara..", TimeUnit.MILLISECONDS, temp_narrativa);
            System.out.println("\n");
            imprimiTexto(destacaPersonagemPrincipal(nomePersonagem) + ": Quem são vocês? e porque estão me seguindo?", TimeUnit.MILLISECONDS, temp_dialog);
            System.out.println("\n");
            imprimiTexto(destacaPersonagemPrincipal("???") + ":  Estamos te observando a um bom tempo " + destacaPersonagemPrincipal(nomePersonagem) + ", acreditamos que você possa nos ajudar em um trabalho muito especial..", TimeUnit.MILLISECONDS, temp_narrativa);
            System.out.println("\n");
            imprimiTexto("mas precisamos saber se você está apto a isso", TimeUnit.MILLISECONDS, temp_dialog);
            System.out.println("\n");
            imprimiTexto(destacaPersonagemPrincipal(nomePersonagem) + ": do que está falando? como assim trabalho especial? eu nem sei quem você é?", TimeUnit.MILLISECONDS, temp_dialog);
            System.out.println("\n");
            imprimiTexto(destacaPersonagemPrincipal("???") + ": eu sou Takeus e ao meu lado o Stelcius.. e eu sei que você tem dúvidas sobre a nossa realidade, tem tido pesadelos que fazem você questionar a sua vida e o mundo..", TimeUnit.MILLISECONDS, temp_dialog);
            System.out.println("\n");
            imprimiTexto("Com receio, porém curioso " + destacaPersonagemPrincipal(nomePersonagem) + " decide entrar no carro e ouvir o que Takeus tem a dizer.", TimeUnit.MILLISECONDS, temp_narrativa);
            System.out.println("\n");
            imprimiTexto(destacaPersonagemTakeus() + ": entendemos e acreditamos no desejo que move sua vontade, isso nos entusiasma, no entanto, primeiramente precisamos saber se você é capaz de resolver alguns simples desafios e está apto para vir conosco.", TimeUnit.MILLISECONDS, temp_dialog);
            System.out.println("\n");
            imprimiTexto(destacaPersonagemPrincipal(nomePersonagem) + " com medo e receio, mas disposto a resolver este enigma aceita o desafio.", TimeUnit.MILLISECONDS, temp_dialog);
            System.out.println("\n");
            imprimiTexto(destacaPersonagemPrincipal(nomePersonagem) + ": qual é o desafio?", TimeUnit.MILLISECONDS, temp_dialog);
            System.out.println("\n");
            imprimiTexto(destacaPersonagemTakeus() + ": uma pergunta, responda com sabedoria: ", TimeUnit.MILLISECONDS, temp_dialog);
            System.out.println("\n");

            if (desafio2(sc)) {
                System.out.println("\n");
                imprimiTexto(destacaPersonagemTakeus() + ": meus parabens, era o que eu esperava de você " + destacaPersonagemPrincipal(nomePersonagem), TimeUnit.MILLISECONDS, temp_dialog);
                System.out.println("\n");
                imprimiTexto("Nesse momento, enquanto Stelcius dirige, Takeus pega um tipo de seringa acoplada à um leitor digital, e segurando o braço do " + destacaPersonagemPrincipal(nomePersonagem), TimeUnit.MILLISECONDS, temp_narrativa);
                System.out.println("\n");
                imprimiTexto("insere rapidamente a “agulha”, porém, não injeta nada, ao contrário, suga um dispositivo robótico minúsculo,\n" +
                        "metálico, com formato de vírus, movimentando-se, que ao ser escaneado pelo leitor digital, exibe a mensagem “AMEAÇA DETECTADA”. ", TimeUnit.MILLISECONDS, temp_narrativa);
                System.out.println("\n");
                imprimiTexto("Takeus dá um comando, ao apertar um pequeno botão no leitor e ativa um micro triturador dentro da seringa\n" +
                        "e exibindo a mensagem “AMEAÇA NEUTRALIZADA”", TimeUnit.MILLISECONDS, temp_narrativa);
                System.out.println("\n");
                imprimiTexto(destacaPersonagemPrincipal(nomePersonagem) + " se assusta com tudo aquilo e desmaia no restante do caminho.", TimeUnit.MILLISECONDS, temp_narrativa);
                System.out.println("\n");
                imprimiTexto("Ao acordar, já está na sede, um prédio bonito, organizado e limpo, muito aconchegante e estruturado.", TimeUnit.MILLISECONDS, temp_narrativa);
                System.out.println("\n");
                imprimiTexto("Takeus o convida para tomar uma água em sua sala, enquanto conversam.", TimeUnit.MILLISECONDS, temp_narrativa);
                System.out.println("\n");
                imprimiTexto("Já em sua sala, sentando-se na cadeira atrás da mesa e fazendo o gesto para o " + destacaPersonagemPrincipal(nomePersonagem) + " se sentar também.", TimeUnit.MILLISECONDS, temp_narrativa);
                System.out.println("\n");
                imprimiTexto(destacaPersonagemTakeus() + ": Sente-se, fique à vontade. Muitas pessoas vivem suas vidas e não se perguntam como seria se fosse diferente.\n" +
                        "Eu preciso saber se você está disposto e quer aceitar o que tenho para te oferecer.", TimeUnit.MILLISECONDS, temp_dialog);
                System.out.println("\n");
                imprimiTexto("Estendendo uma mão com uma pílula azul e outra com uma pílula vermelha.", TimeUnit.MILLISECONDS, temp_narrativa);
                System.out.println("\n");
                imprimiTexto(destacaPersonagemTakeus() + ": Se você escolher a pílula azul poderá continuar com sua vida normalmente, como sempre foi.\n" +
                        "Se você escolher a pílula vermelha, eu irei te contar a verdade, porém jamais a sua vida será a mesma. Pense e escolha sabiamente", TimeUnit.MILLISECONDS, temp_dialog);
                System.out.println("\n");
                imprimiTexto(destacaPersonagemTakeus() + ": " + ANSI_RED + "Vermelha" + ANSI_RESET + " ou " + ANSI_CYAN + "Azul" + ANSI_RESET + ": ", TimeUnit.MILLISECONDS, temp_dialog);
                System.out.println("\n");
                boolean acerto = false;
                do {
                    String cor = sc.next().toUpperCase();
                    if (cor.equals("VERMELHA")) {
                        acerto = true;
                        //continua historia
                        imprimiTexto(destacaPersonagemTakeus() + ": Muito bem " + destacaPersonagemPrincipal(nomePersonagem) + ", venha comigo tenho que te levar para uma cidade chamada Karnaugh, uma cidade dentro de um mundo virtual", TimeUnit.MILLISECONDS, temp_dialog);
                        System.out.println("\n");
                        imprimiTexto("Indo em direção a uma sala, Takeus acomoda " + destacaPersonagemPrincipal(nomePersonagem) + " em uma cadeira, e acopla um capacete em sua cabeça", TimeUnit.MILLISECONDS, temp_narrativa);
                        System.out.println("\n");
                        imprimiTexto("Com uma dor forte e aguda na cabeça " + destacaPersonagemPrincipal(nomePersonagem) + " dorme, e acorda logo em seguida em uma enorme sala branca.", TimeUnit.MILLISECONDS, temp_narrativa);
                        System.out.println("\n");
                        imprimiTexto(destacaPersonagemPrincipal(nomePersonagem) + ": O que aconteceu? onde estou?", TimeUnit.MILLISECONDS, temp_dialog);
                        System.out.println("\n");
                        imprimiTexto(destacaPersonagemTakeus() + ": Isto, é a contrução...", TimeUnit.MILLISECONDS, temp_dialog);
                        System.out.println("\n");
                        imprimiTexto(destacaPersonagemTakeus() + ": É o nosso programa carregando...", TimeUnit.MILLISECONDS, temp_dialog);
                        System.out.println("\n");
                        imprimiTexto(destacaPersonagemPrincipal(nomePersonagem) + ": Estamos dentro de um programa de computador?", TimeUnit.MILLISECONDS, temp_dialog);
                        System.out.println("\n");
                        imprimiTexto(destacaPersonagemTakeus() + ": É tão dificil acreditar?", TimeUnit.MILLISECONDS, temp_dialog);
                        System.out.println("\n");
                        imprimiTexto(destacaPersonagemPrincipal(nomePersonagem) + ": Isto... isto não é real?", TimeUnit.MILLISECONDS, temp_dialog);
                        System.out.println("\n");
                        imprimiTexto(destacaPersonagemTakeus() + ": O que é real?... como se define real?", TimeUnit.MILLISECONDS, temp_dialog);
                        System.out.println("\n");
                        imprimiTexto(destacaPersonagemTakeus() + ": Se você se refere ao que pode sentir, cheirar, provar e ver", TimeUnit.MILLISECONDS, temp_dialog);
                        System.out.println("\n");
                        imprimiTexto(destacaPersonagemTakeus() + ": Então real, é apenas sinais eletricos interpreatados pelo seu cerebro.", TimeUnit.MILLISECONDS, temp_dialog);
                        System.out.println("\n");
                        imprimiTexto(destacaPersonagemTakeus() + ": O mundo que você conhece, existe apenas como parte de uma simulação neurointerativa.", TimeUnit.MILLISECONDS, temp_dialog);
                        System.out.println("\n");
                        imprimiTexto(destacaPersonagemTakeus() + ": Que chamamos de axtrim.", TimeUnit.MILLISECONDS, temp_dialog);
                        System.out.println("\n");
                        imprimiTexto(destacaPersonagemTakeus() + ": Axtrim é controle. Construida para nos manter sobre controle, para transformar o ser humano em energia para as máquinas", TimeUnit.MILLISECONDS, temp_dialog);
                        System.out.println("\n");
                        imprimiTexto(destacaPersonagemPrincipal(nomePersonagem) + ": Isso não é verdade! NÃO! EU NÃO ACREDITO! NÃO É POSSÍVEL!!", TimeUnit.MILLISECONDS, temp_dialog);
                        System.out.println("\n");
                        imprimiTexto(destacaPersonagemTakeus() + ": Eu não disse que seria fácil " + destacaPersonagemPrincipal(nomePersonagem) + ", eu disse que seria a VERDADE!", TimeUnit.MILLISECONDS, temp_dialog);
                        System.out.println("\n");

                        //inicia treinamento
                        //dois desafios, e finalização do capitlo 1
                        desafio1(sc);
                        desafio3(sc);

                        //finalizando capitulo1
                        imprimiTexto(destacaPersonagemTakeus() + ": muito bem " + destacaPersonagemPrincipal(nomePersonagem) + " você completou seu treinamento com sucesso, vamos continuar com o trabalho.", TimeUnit.MILLISECONDS, temp_dialog);

                        //iniciando capitlo 2
                        capitulo2();

                    } else if (cor.equals("AZUL")) {
                        //perde o jogo
                        acerto = true;
                        imprimiTexto(destacaPersonagemTakeus() + ": Lamento sua escolha " + destacaPersonagemPrincipal(nomePersonagem) + ". Pode continuar com sua vida sem sentido e patetica..", TimeUnit.MILLISECONDS, temp_dialog);

                    } else {
                        //valor inválido
                        imprimiTexto(destacaPersonagemTakeus() + ": não entendi, escolha entre a pilula " + ANSI_RED + "Vermelha" + ANSI_RESET + " ou " + ANSI_CYAN + "Azul" + ANSI_RESET + ": ", TimeUnit.MILLISECONDS, temp_dialog);
                    }
                } while (!acerto);
            } else {
                imprimiTexto(destacaPersonagemTakeus() + ": infelizmente você não é o que procuramos, saia do carro! ", TimeUnit.MILLISECONDS, temp_dialog);
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public static void capitulo2() {
        Scanner sc = new Scanner(System.in);
        try {
            System.out.println("\n");
            imprimiTexto(destacaPersonagemTakeus() + ": vamos para primeira etapa de nossa missão.", TimeUnit.MILLISECONDS, temp_dialog);
            System.out.println("\n");

            /* Então Takeus leva +destacaPersonagem(nomePersonagem)+ à uma cidade, dentro de AXTRIM chamada Karnaugh.
            Takeus diz: Precisamos encontrar o MAPA DE KARNAUGH para localizar os pontos e determinar os passos que iremos dar daqui a diante. */

            imprimiTexto("Então Takeus leva " + destacaPersonagemPrincipal(nomePersonagem) + " à uma dentro de AXTRIM chamada Karnaugh.", TimeUnit.MILLISECONDS, temp_narrativa);
            System.out.println("\n");
            imprimiTexto(destacaPersonagemTakeus() + ": precisamos encontrar o MAPA DE KARNAUGH para localizar os pontos e determinar os passos que iremos dar daqui a diante", TimeUnit.MILLISECONDS, temp_dialog);
            System.out.println("\n");
            imprimiTexto(destacaPersonagemTakeus() + ": ele é guardado por uma sentinela que precisamos vencer antes de pega-lo.", TimeUnit.MILLISECONDS, temp_dialog);
            System.out.println("\n");
            imprimiTexto("Eles correm em direção à um grande prédio e ao passar pela recepção são atacados por um grupo que faz parte da segurança do local.", TimeUnit.MILLISECONDS, temp_dialog);
            System.out.println("\n");
            imprimiTexto("~ O segurança com tranjes militares avança em direção ao " + destacaPersonagemPrincipal(nomePersonagem) + " e impulsiona um golpe em direção ao seu rosto.", TimeUnit.MILLISECONDS, temp_narrativa);
            System.out.println("\n");
            imprimiTexto("~ Com sua percepção avançada devido ao treinamentos " + destacaPersonagemPrincipal(nomePersonagem) + " analisa as possibilidades de ação..", TimeUnit.MILLISECONDS, temp_narrativa);
            System.out.println("\n");
            
            //ele sempra vai ganhar este desafio
            int tentativasDesafio4 = desafio4(sc);
            if (tentativasDesafio4 == 1) {
                imprimiTexto(destacaPersonagemPrincipal(nomePersonagem) + " desvia do golpe do segurança, e acerta um golpe preciso e não fatal em seu pescoço, neutralizando instantaneamente", TimeUnit.MILLISECONDS, temp_narrativa);
            } else if (tentativasDesafio4 == 2) {
                imprimiTexto(destacaPersonagemPrincipal(nomePersonagem) + " não consegue se desvia do golpe, mas se recupera rapidamente, pegando com força o braço do segurança e o quebrando-o e o neutralizando", TimeUnit.MILLISECONDS, temp_narrativa);
            } else if (tentativasDesafio4 > 2) {
                imprimiTexto(destacaPersonagemPrincipal(nomePersonagem) + " leva o golpe com toda a força em seu rosto, ficando zonzo e desnortiado, o segurança aproveita a brecha e tenta lhe infligir mais um golpe.", TimeUnit.MILLISECONDS, temp_narrativa);
                imprimiTexto(destacaPersonagemPrincipal(nomePersonagem) + " recupera os sentidos rapidamente, e consegue evitar o segundo golpe, agarrando o braço esquerdo do segurança e quebrando-o, e o neutralizando", TimeUnit.MILLISECONDS, temp_narrativa);
            }

            imprimiTexto(destacaPersonagemTakeus() + ": encontre o Sentinela, ficarei aqui cuidando destes seguranças!", TimeUnit.MILLISECONDS, temp_dialog);
            System.out.println("\n");
            imprimiTexto("De repente uma voz interrompe TAKEUS", TimeUnit.MILLISECONDS, temp_narrativa);
            System.out.println("\n");
            imprimiTexto("Sentinela: Então vocês estão me procurando?", TimeUnit.MILLISECONDS, temp_narrativa);
            System.out.println("\n");
            imprimiTexto(destacaPersonagemPrincipal(nomePersonagem) + ": Nos entregue o MAPA DE KARNAUGH e deixaremos você em paz!", TimeUnit.MILLISECONDS, temp_dialog);
            System.out.println("\n");
            imprimiTexto("Sentinela: Eu sou o guardião deste MAPA, jamais entregaria a vocês!", TimeUnit.MILLISECONDS, temp_dialog);
            System.out.println("\n");
            imprimiTexto(destacaPersonagemPrincipal(nomePersonagem) + " salta em direção a sentinela..", TimeUnit.MILLISECONDS, temp_dialog);
            System.out.println("\n");

            int tentativasDesafio5 = desafio5(sc);
            if (tentativasDesafio5 == 1) {
                imprimiTexto(destacaPersonagemPrincipal(nomePersonagem) + " desfere golpes certeiros, o Sentinela cai se desintegrando, como poeira ao vento, dando a impressão de um programa sendo desfragmentado.", TimeUnit.MILLISECONDS, temp_narrativa);
            } else if (tentativasDesafio5 <= 3) {
                imprimiTexto(destacaPersonagemPrincipal(nomePersonagem) + " aplica um golpe, porém o sentinela consegue desviar, e o acerta em suas costa com uma de suas garras.", TimeUnit.MILLISECONDS, temp_narrativa);
                imprimiTexto("ferido, o sentinela tenta desferir um golpe mortal em " + destacaPersonagemPrincipal(nomePersonagem), TimeUnit.MILLISECONDS, temp_narrativa);
                imprimiTexto("por sorte " + destacaPersonagemPrincipal(nomePersonagem) + " consegue desviar do golpe, e revida com um chute em sua central de comando, assim a destruindo em pedaços", TimeUnit.MILLISECONDS, temp_narrativa);
            } else if (tentativasDesafio5 > 3) {
                //personagem morre
                imprimiTexto("O sentinela desfere um golpe certeiro e mortal com sua gerra em " + destacaPersonagemPrincipal(nomePersonagem) + ", assim o atravessando-o e o matando instantaneamente.", TimeUnit.MILLISECONDS, temp_narrativa);
                System.out.println("\n");
                imprimiTexto("Takeus ao presenciar tal cena cai de joelhos no chão e grita em desepero.", TimeUnit.MILLISECONDS, temp_narrativa);
                System.out.println("\n");
                imprimiTexto(destacaPersonagemTakeus() + ": NÃAAAAAOOOOOOO!!!!", TimeUnit.MILLISECONDS, temp_dialog);
                System.out.println("\n");
                imprimiTexto("seu grito ecoa por todo o predio..", TimeUnit.MILLISECONDS, temp_narrativa);
                System.out.println("\n");
                imprimiTexto("Com a morte de " + destacaPersonagemPrincipal(nomePersonagem) + " a humanidade contínua escrava do vírus que as prende numa ilusão dentro de AXTRIM para roubar sua energia e usa-as como fantoches.", TimeUnit.MILLISECONDS, temp_narrativa);
                sairDoJogo();
            }

            imprimiTexto("Se recuperando da luta " + destacaPersonagemPrincipal(nomePersonagem) + " anda em direção ao fim corredor e encontra uma porta, ao entrar na sala e ver o armario.", TimeUnit.MILLISECONDS, temp_narrativa);
            imprimiTexto("ele corre em direção a ele e o abre, encontrando um cofre eletronico", TimeUnit.MILLISECONDS, temp_dialog);

            imprimiTexto(destacaPersonagemPrincipal(nomePersonagem) + ": nesse cofre está o mapa que precisamos, preciso decodificar a senha para abri-lo.", TimeUnit.MILLISECONDS, temp_dialog);

            desafio6(sc);

            //sem risco de morte, pois o personagem está apenas abrindo o cofre
            imprimiTexto(destacaPersonagemPrincipal(nomePersonagem) + " abre o cofre..", TimeUnit.MILLISECONDS, temp_narrativa);

        } catch (InterruptedException e) {
            e.printStackTrace();
        }
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

    public static String destacaPersonagemPrincipal(String texto) {
        return ANSI_YELLOW + texto + ANSI_RESET;
    }

    public static String destacaPersonagemTakeus() {
        return ANSI_GREEN + "Takeus" + ANSI_RESET;
    }

    public static void sairDoJogo() {
        System.exit(0);
    }
}

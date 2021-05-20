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
    static String nomePersonagem = "Rennan";

    public static void main(String[] args) {
        //constante
        Scanner entrada = new Scanner(System.in);
        //menu(entrada);
        //capitulo1();
        //capitulo2();
        desafio9();
        System.out.println("teste");
    }

    public static void menu(Scanner sc) {
        int escolha = 0;
        do {
            System.out.println("");
            System.out.println("..:: Axtrim 2033 ::..");
            System.out.println("1 - InstruÃ§Ãµes \n2 - Jogar \n3 - CrÃ©ditos \n4 - Sair");
            escolha = sc.nextInt();

            switch (escolha) {
                case 1:
                    //chamar mÃ©todo para as instruÃ§Ãµes
                    instrucoes();
                    break;
                case 2:
                    //chamar mÃ©todo para jogar
                    capitulo1();
                    break;
                case 3:
                    //chamar mÃ©todo para os crÃ©ditos
                    creditos();
                    break;
                case 4:
                    //chamar metodo para sair
                    sairDoJogo();
                    break;
                default:
                    System.out.println("OpÃ§Ã£o invÃ¡lida!");
            }
        } while (escolha <= 0 || escolha >= 5);
    }

    public static void desafio1(Scanner sc) throws InterruptedException {
        boolean acerto = false;

        String pergunta = "VocÃª precisa de uma porta lÃ³gica que verifique entradas e somente a partir desta verificaÃ§Ã£o " +
                "Chegue a uma saÃ­da VERDADEIRA, no entanto, ambas entradas tambÃ©m precisam ser VERDADEIRAS. " +
                "Qual porta lÃ³gica vocÃª deve usar para fazer essa verificaÃ§Ã£o?";

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
                        System.out.println("\n");
                        imprimiTexto(destacaPersonagemTakeus() + ": Muito bem " + nomePersonagem + " continue assim!", TimeUnit.MICROSECONDS, temp_dialog);
                        acerto = true;
                    } else {
                        System.out.println("\n");
                        imprimiTexto(destacaPersonagemTakeus() + ": NÃ£o!, tente novamente!", TimeUnit.MICROSECONDS, temp_dialog);
                        System.out.println("\n");
                    }
                    break;
                case 'b':
                    if (alternativas.get(1).equals(respostaCorreta)) {
                        System.out.println("\n");
                        imprimiTexto(destacaPersonagemTakeus() + ": Muito bem " + nomePersonagem + " continue assim!", TimeUnit.MICROSECONDS, temp_dialog);
                        acerto = true;
                    } else {
                        System.out.println("\n");
                        imprimiTexto(destacaPersonagemTakeus() + ": NÃ£o!, tente novamente!", TimeUnit.MICROSECONDS, temp_dialog);
                        System.out.println("\n");
                    }
                    break;
                case 'c':
                    if (alternativas.get(2).equals(respostaCorreta)) {
                        System.out.println("\n");
                        imprimiTexto(destacaPersonagemTakeus() + ": Muito bem " + nomePersonagem + " continue assim!", TimeUnit.MICROSECONDS, temp_dialog);
                        acerto = true;
                    } else {
                        System.out.println("\n");
                        imprimiTexto(destacaPersonagemTakeus() + ": NÃ£o!, tente novamente!", TimeUnit.MICROSECONDS, temp_dialog);
                        System.out.println("\n");
                    }
                    break;
                case 'd':
                    if (alternativas.get(3).equals(respostaCorreta)) {
                        System.out.println("\n");
                        imprimiTexto(destacaPersonagemTakeus() + ": Muito bem " + nomePersonagem + " continue assim!", TimeUnit.MICROSECONDS, temp_dialog);
                        acerto = true;
                    } else {
                        System.out.println("\n");
                        imprimiTexto(destacaPersonagemTakeus() + ": NÃ£o!, tente novamente!", TimeUnit.MICROSECONDS, temp_dialog);
                        System.out.println("\n");
                    }
                    break;
                case 'e':
                    if (alternativas.get(4).equals(respostaCorreta)) {
                        System.out.println("\n");
                        imprimiTexto(destacaPersonagemTakeus() + ": Muito bem " + nomePersonagem + " continue assim!", TimeUnit.MICROSECONDS, temp_dialog);
                        acerto = true;
                    } else {
                        System.out.println("\n");
                        imprimiTexto(destacaPersonagemTakeus() + ": NÃ£o!, tente novamente!", TimeUnit.MICROSECONDS, temp_dialog);
                        System.out.println("\n");
                    }
                    break;
                default:
                    System.out.println("\n");
                    imprimiTexto(destacaPersonagemTakeus() + ": NÃ£o!, tente novamente!", TimeUnit.MICROSECONDS, temp_dialog);
                    System.out.println("\n");
                    break;
            }
        } while (!acerto);
    }

    public static boolean desafio2(Scanner sc) throws InterruptedException {
        boolean acerto = false;
        int tentativas = 0;

        String pergunta = "Qual das alternativas representa a escolha adequada de portas lÃ³gicas em relaÃ§Ã£o Ã s seguintes necessidades: \n" +
                " â€¢ SÃ³ tenha saÃ­da VERDADEIRA, quando as duas entradas forem FALSAS\n" +
                " â€¢ Representa a lÃ³gica: S = ~ (A.B)\n" +
                " â€¢ Representa a lÃ³gica: S = ~ (A+B)";

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
                        System.out.println("\n");
                        imprimiTexto(destacaPersonagemTakeus() + ": interessante... estou impressionado.", TimeUnit.MICROSECONDS, temp_dialog);
                        acerto = true;
                        tentativas = 4;
                        return true;
                    } else {
                        System.out.println("\n");
                        imprimiTexto(destacaPersonagemTakeus() + ": nÃ£o parece certo. Tente de novo!", TimeUnit.MICROSECONDS, temp_dialog);
                        System.out.println("\n");
                        tentativas++;
                    }
                    break;
                case 'b':
                    if (alternativas.get(1).equals(respostaCorreta)) {
                        System.out.println("\n");
                        imprimiTexto(destacaPersonagemTakeus() + ": interessante... estou impressionado.", TimeUnit.MICROSECONDS, temp_dialog);
                        acerto = true;
                        tentativas = 4;
                        return true;
                    } else {
                        System.out.println("\n");
                        imprimiTexto(destacaPersonagemTakeus() + ": nÃ£o parece certo. Tente de novo!", TimeUnit.MICROSECONDS, temp_dialog);
                        System.out.println("\n");
                        tentativas++;
                    }
                    break;
                case 'c':
                    if (alternativas.get(2).equals(respostaCorreta)) {
                        System.out.println("\n");
                        imprimiTexto(destacaPersonagemTakeus() + ": interessante... estou impressionado.", TimeUnit.MICROSECONDS, temp_dialog);
                        tentativas = 4;
                        acerto = true;
                        return true;
                    } else {
                        System.out.println("\n");
                        imprimiTexto(destacaPersonagemTakeus() + ": nÃ£o parece certo. Tente de novo!", TimeUnit.MICROSECONDS, temp_dialog);
                        System.out.println("\n");
                        tentativas++;
                    }
                    break;
                case 'd':
                    if (alternativas.get(3).equals(respostaCorreta)) {
                        System.out.println("\n");
                        imprimiTexto(destacaPersonagemTakeus() + ": interessante... estou impressionado.", TimeUnit.MICROSECONDS, temp_dialog);
                        tentativas = 4;
                        acerto = true;
                        return true;
                    } else {
                        System.out.println("\n");
                        imprimiTexto(destacaPersonagemTakeus() + ": nÃ£o parece certo. Tente de novo!", TimeUnit.MICROSECONDS, temp_dialog);
                        System.out.println("\n");
                        tentativas++;
                    }
                    break;
                case 'e':
                    if (alternativas.get(4).equals(respostaCorreta)) {
                        System.out.println("\n");
                        imprimiTexto(destacaPersonagemTakeus() + ": interessante... estou impressionado.", TimeUnit.MICROSECONDS, temp_dialog);
                        tentativas = 4;
                        acerto = true;
                        return true;
                    } else {
                        System.out.println("\n");
                        imprimiTexto(destacaPersonagemTakeus() + ": nÃ£o parece certo. Tente de novo!", TimeUnit.MICROSECONDS, temp_dialog);
                        System.out.println("\n");
                        tentativas++;
                    }
                    break;
                default:
                    System.out.println("\n");
                    imprimiTexto(destacaPersonagemTakeus() + ": nÃ£o parece certo. Tente de novo!", TimeUnit.MICROSECONDS, temp_dialog);
                    System.out.println("\n");
                    break;
            }
        } while (tentativas < 3);
        return false;
    }

    public static void desafio3(Scanner sc) throws InterruptedException {
        boolean acerto = false;
        String tabela = "-------------\n" +
                "| A | B | S |\n" +
                "| 0 | 0 | 1 |\n" +
                "| 0 | 1 | 0 |\n" +
                "| 1 | 0 | 0 |\n" +
                "| 1 | 1 | 0 |\n" +
                "-------------";
        String pergunta = "Observando a tabela podemos dizer que a porta logica que esta sendo utilizada Ã© a:";
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

            //capturando o primeiro caractere digitado e forÃ§ando ele a ser minusculo
            char alt = sc.next().toLowerCase().charAt(0);
            switch (alt) {
                case 'a':
                    //comparando a alternativa escolhida com a resposta correta
                    if (alternativas.get(0).equals(respostaCorreta)) {
                        System.out.println("\n");
                        imprimiTexto(destacaPersonagemTakeus() + ": Muito bem " + destacaPersonagemPrincipal(nomePersonagem) + ", sempre soube que nÃ£o me decepcionaria ", TimeUnit.MICROSECONDS, temp_dialog);
                        acerto = true;
                        System.out.println("\n");
                    } else {
                        System.out.println("\n");
                        imprimiTexto(destacaPersonagemTakeus() + ": NÃ£o me desaponte " + destacaPersonagemPrincipal(nomePersonagem) + ", tente mais uma vez!", TimeUnit.MICROSECONDS, temp_dialog);
                        System.out.println("\n");
                    }
                    break;
                case 'b':
                    if (alternativas.get(1).equals(respostaCorreta)) {
                        System.out.println("\n");
                        imprimiTexto(destacaPersonagemTakeus() + ": Muito bem " + destacaPersonagemPrincipal(nomePersonagem) + ", sempre soube que nÃ£o me decepcionaria ", TimeUnit.MICROSECONDS, temp_dialog);
                        acerto = true;
                    } else {
                        System.out.println("\n");
                        imprimiTexto(destacaPersonagemTakeus() + ": NÃ£o me desaponte " + destacaPersonagemPrincipal(nomePersonagem) + ", tente mais uma vez!", TimeUnit.MICROSECONDS, temp_dialog);
                        System.out.println("\n");
                    }
                    break;
                case 'c':
                    if (alternativas.get(2).equals(respostaCorreta)) {
                        System.out.println("\n");
                        imprimiTexto(destacaPersonagemTakeus() + ": Muito bem " + destacaPersonagemPrincipal(nomePersonagem) + ", sempre soube que nÃ£o me decepcionaria ", TimeUnit.MICROSECONDS, temp_dialog);
                        acerto = true;
                    } else {
                        System.out.println("\n");
                        imprimiTexto(destacaPersonagemTakeus() + ": NÃ£o me desaponte " + destacaPersonagemPrincipal(nomePersonagem) + ", tente mais uma vez!", TimeUnit.MICROSECONDS, temp_dialog);
                        System.out.println("\n");
                    }
                    break;
                case 'd':
                    if (alternativas.get(3).equals(respostaCorreta)) {
                        System.out.println("\n");
                        imprimiTexto(destacaPersonagemTakeus() + ": Muito bem " + destacaPersonagemPrincipal(nomePersonagem) + ", sempre soube que nÃ£o me decepcionaria ", TimeUnit.MICROSECONDS, temp_dialog);
                        acerto = true;
                    } else {
                        System.out.println("\n");
                        imprimiTexto(destacaPersonagemTakeus() + ": NÃ£o me desaponte " + destacaPersonagemPrincipal(nomePersonagem) + ", tente mais uma vez!", TimeUnit.MICROSECONDS, temp_dialog);
                        System.out.println("\n");
                    }
                    break;
                case 'e':
                    if (alternativas.get(4).equals(respostaCorreta)) {
                        System.out.println("\n");
                        imprimiTexto(destacaPersonagemTakeus() + ": Muito bem " + destacaPersonagemPrincipal(nomePersonagem) + ", sempre soube que nÃ£o me decepcionaria ", TimeUnit.MICROSECONDS, temp_dialog);
                        acerto = true;
                    } else {
                        System.out.println("\n");
                        imprimiTexto(destacaPersonagemTakeus() + ": NÃ£o me desaponte " + destacaPersonagemPrincipal(nomePersonagem) + ", tente mais uma vez!", TimeUnit.MICROSECONDS, temp_dialog);
                        System.out.println("\n");
                    }
                    break;
                default:
                    System.out.println("\n");
                    imprimiTexto(destacaPersonagemTakeus() + ": NÃ£o me desaponte " + destacaPersonagemPrincipal(nomePersonagem) + ", tente mais uma vez!", TimeUnit.MICROSECONDS, temp_dialog);
                    System.out.println("\n");
                    break;
            }
        } while (!acerto);
    }

    public static int desafio4(Scanner sc) {
        int tentativas = 0;
        boolean acerto = false;
        String pergunta = "Qual a expressÃ£o booleana representa corretamente a operaÃ§Ã£o OR ?";
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

            //capturando o primeiro caractere digitado e forÃ§ando ele a ser minusculo
            char alt = sc.next().toLowerCase().charAt(0);

            switch (alt) {
                case 'a':
                    //comparando a alternativa escolhida com a resposta correta
                    if (alternativas.get(0).equals(respostaCorreta)) {
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

        String pergunta = "Em qual base numerica estÃ¡ o numero 10101110 ";
        String respostaCorreta = "EstÃ¡ em binario";

        List<String> alternativas = new ArrayList<>();
        alternativas.add(respostaCorreta);
        alternativas.add("EstÃ¡ em hexadecimal");
        alternativas.add("EstÃ¡ em decimal");
        alternativas.add("EstÃ¡ em octal");
        alternativas.add("EstÃ¡ na Base 10");

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
                        acerto = true;
                        tentativas++;
                        return tentativas;
                    } else {
                        tentativas++;
                    }
                    break;
                case 'b':
                    if (alternativas.get(1).equals(respostaCorreta)) {
                        acerto = true;
                        tentativas++;
                        return tentativas;
                    } else {
                        tentativas++;
                    }
                    break;
                case 'c':
                    if (alternativas.get(2).equals(respostaCorreta)) {
                        acerto = true;
                        tentativas++;
                        return tentativas;
                    } else {
                        tentativas++;
                    }
                    break;
                case 'd':
                    if (alternativas.get(3).equals(respostaCorreta)) {
                        acerto = true;
                        tentativas++;
                        return tentativas;
                    } else {
                        tentativas++;
                    }
                    break;
                case 'e':
                    if (alternativas.get(4).equals(respostaCorreta)) {
                        acerto = true;
                        tentativas++;
                        return tentativas;
                    } else {

                        tentativas++;
                    }
                    break;
                default:
                    tentativas++;
                    break;
            }
        } while (!acerto);
        return 1;
    }

    public static void desafio6(Scanner sc) {
        boolean acerto = false;

        String perugnta = "Quantos bits devem ser agrupados se vocÃª modificar da base (BinÃ¡ria) para a base (Octal)?";
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
                        acerto = true;
                    } else {

                    }
                    break;
                case 'b':
                    if (alternativas.get(1).equals(respostaCorreta)) {
                        acerto = true;
                    } else {

                    }
                    break;
                case 'c':
                    if (alternativas.get(2).equals(respostaCorreta)) {

                        acerto = true;
                    } else {

                    }
                    break;
                case 'd':
                    if (alternativas.get(3).equals(respostaCorreta)) {

                        acerto = true;
                    } else {

                    }
                    break;
                case 'e':
                    if (alternativas.get(4).equals(respostaCorreta)) {

                        acerto = true;
                    } else {
                    }
                    break;
                default:
                    break;
            }
        } while (!acerto);
    }

    public static int desafio7(Scanner sc) {
        int tentativas = 0;
        boolean acerto = false;

        String pergunta = "Os computadores utilizam o sistema binÃ¡rio ou de base 2 que Ã© um sistema de numeraÃ§Ã£o em que todas as quantidades se representam com base em dois \\n \"\n" +
                "+ \"nÃºmeros, ou seja, (0 e 1). Em um computador o nÃºmero 2012, em base decimal, serÃ¡ representado, em base binÃ¡ria, por:\\r\\n";

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
                        acerto = true;
                        tentativas++;
                        return tentativas;
                    } else {
                    }
                    break;
                case 'b':
                    if (alternativas.get(1).equals(respostaCorreta)) {
                        acerto = true;
                        tentativas++;
                        return tentativas;
                    } else {
                        tentativas++;
                    }
                    break;
                case 'c':
                    if (alternativas.get(2).equals(respostaCorreta)) {
                        acerto = true;
                        tentativas++;
                        return tentativas;
                    } else {
                        tentativas++;
                    }
                    break;
                case 'd':
                    if (alternativas.get(3).equals(respostaCorreta)) {
                        acerto = true;
                        tentativas++;
                        return tentativas;
                    } else {
                        tentativas++;
                    }
                    break;
                case 'e':
                    if (alternativas.get(4).equals(respostaCorreta)) {
                        acerto = true;
                        tentativas++;
                        return tentativas;
                    } else {
                        tentativas++;
                    }
                    break;
                default:
                    tentativas++;
                    break;
            }
        } while (!acerto);
        return 1;
    }

    public static int desafio8(Scanner sc) {
        boolean acerto = false;
        int tentativas = 0;

        String pergunta = "Assinale a alternativa que apresenta o somatÃ³rio dos 4 nÃºmeros acima convertidos para o formato decimal: ";
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
                        tentativas++;
                        acerto = true;
                        return tentativas;
                    } else {
                        tentativas++;
                    }
                    break;
                case 'b':
                    if (alternativas.get(1).equals(respostaCorreta)) {
                        tentativas++;
                        acerto = true;
                        return tentativas;
                    } else {
                        tentativas++;
                    }
                    break;
                case 'c':
                    if (alternativas.get(2).equals(respostaCorreta)) {
                        tentativas++;
                        acerto = true;
                        return tentativas;
                    } else {
                        tentativas++;
                    }
                    break;
                case 'd':
                    if (alternativas.get(3).equals(respostaCorreta)) {
                        tentativas++;
                        acerto = true;
                        return tentativas;
                    } else {
                        tentativas++;
                    }
                    break;
                case 'e':
                    if (alternativas.get(4).equals(respostaCorreta)) {
                        tentativas++;
                        acerto = true;
                        return tentativas;
                    } else {
                        tentativas++;
                    }
                    break;
                default:
                    tentativas++;
                    break;
            }
        } while (!acerto);
        return 1;
    }

    public static boolean desafio9() {
        List<String> alternativas = Arrays.asList(
                "BinÃ¡rio, Octal, Decimal, Hexadecimal.",
                "BinÃ¡rio, Extradecimal, Octal, Hexadecimal.",
                "BinÃ¡rio, Octal, LÃ³gica, Extradecimal, Hexadecimal.",
                "BicentenÃ¡rio, BinÃ¡rio, Octal, Hexadecimal.",
                "BinÃ¡rio, Octal, Decimal, Sistema Operacional.");
        String alternativaEscolhida = null;
        String paraImprimir = null;
        String alternativaCorreta = "BinÃ¡rio, Octal, Decimal, Hexadecimal.";
        String opcaoSelecionada = null;
        int contador = 0;
        Scanner ent = new Scanner(System.in);

        do {
            contador++;
            if (contador >= 2) {
                System.out.println("Resposta incorreta! Tente novamente" + "\n");
            }

            //UAIS OS TIPOS MAIS CONHECIDOS DE BASES NÃšMERICAS
            Collections.shuffle(alternativas);
            System.out.println("\nQuais os tipos mais conhecidos de bases nÃºmericas?"
                    + "\n"
                    + "\nESCOLHA SUA ALTERNATIVA, SABIAMENTE: "
                    + "\n"
                    + "\n(a) - " + alternativas.get(0)
                    + "\n(b) - " + alternativas.get(1)
                    + "\n(c) - " + alternativas.get(2)
                    + "\n(d) - " + alternativas.get(3)
                    + "\n(e) - " + alternativas.get(4));
            opcaoSelecionada = ent.next().toUpperCase();

            switch (opcaoSelecionada) {
                case "A":
                    alternativaEscolhida = alternativas.get(0);
                    paraImprimir = "(A) - " + alternativas.get(0);
                    break;
                case "B":
                    alternativaEscolhida = alternativas.get(1);
                    paraImprimir = "(B) - " + alternativas.get(1);
                    break;
                case "C":
                    alternativaEscolhida = alternativas.get(2);
                    paraImprimir = "(C) - " + alternativas.get(2);
                    break;
                case "D":
                    alternativaEscolhida = alternativas.get(3);
                    paraImprimir = "(D) - " + alternativas.get(3);
                    break;
                case "E":
                    alternativaEscolhida = alternativas.get(4);
                    paraImprimir = "(E) - " + alternativas.get(4);
                    break;
                default:
                    System.out.println("Resposta incorreta! Tente novamente");
                    break;
            }
        } while (!alternativaCorreta.equals(alternativaEscolhida));
        return true;
    }

    public static void capitulo1() {
        Scanner sc = new Scanner(System.in);
        try {
            imprimiTexto(destacaPersonagemPrincipal("???") + ": 2033, a pandemia jÃ¡ foi vencida, fomos vacinados e curados\n" +
                    "mas as pessoas ainda continuam distantes uma das outras, nem sei ao certo o porque,\n" +
                    "talvez medo de um novo virus, ou uma nova onda de doenÃ§as fatais.. \n" +
                    "eu me chamo: ", TimeUnit.MILLISECONDS, temp_narrativa);
            nomePersonagem = sc.next();

            System.out.println("\n");
            imprimiTexto(destacaPersonagemPrincipal(nomePersonagem) + ": Sou programador, e estou procurando um novo emprego a um bom tempo\n" +
                    "tem sido dificil, estou dormindo muito mal ultimamente, tendo pesadelos estranhos onde\n" +
                    "sempre estou conectado a vÃ¡rios cabos que estÃ£o interligados ao que parece ser computadores futuristas, nÃ£o sei se isso tem algum significado,\ntalvez esse mundo nÃ£o seja exatamente o que pensamos ser..\n", TimeUnit.MILLISECONDS, temp_narrativa);
            imprimiTexto("Mas hoje, fui chamado para uma entrevista de emprego, espero que der tudo certo.. ", TimeUnit.MILLISECONDS, temp_narrativa);
            System.out.println("\n");
            imprimiTexto("~ No caminho para entrevista, " + destacaPersonagemPrincipal(nomePersonagem) + " anda pela calÃ§ada...\n" +
                    "", TimeUnit.MILLISECONDS, temp_narrativa);
            System.out.println("\n");
            imprimiTexto("~ EntÃ£o ele nota que um carro preto e misterioso o segue lentamente..", TimeUnit.MILLISECONDS, temp_narrativa);
            System.out.println("\n");
            imprimiTexto("~ Com isso " + destacaPersonagemPrincipal(nomePersonagem) + " para e encara o carro, o vidro desse, uma figura usando roupas pretas e oculos escuros misteriosa o encara..", TimeUnit.MILLISECONDS, temp_narrativa);
            System.out.println("\n");
            imprimiTexto(destacaPersonagemPrincipal(nomePersonagem) + ": Quem sÃ£o vocÃªs? e porque estÃ£o me seguindo?", TimeUnit.MILLISECONDS, temp_dialog);
            System.out.println("\n");
            imprimiTexto(destacaPersonagemPrincipal("???") + ":  Estamos te observando a um bom tempo " + destacaPersonagemPrincipal(nomePersonagem) + ", acreditamos que vocÃª possa nos ajudar em um trabalho muito especial..", TimeUnit.MILLISECONDS, temp_narrativa);
            System.out.println("\n");
            imprimiTexto("mas precisamos saber se vocÃª estÃ¡ apto a isso", TimeUnit.MILLISECONDS, temp_dialog);
            System.out.println("\n");
            imprimiTexto(destacaPersonagemPrincipal(nomePersonagem) + ": do que estÃ¡ falando? como assim trabalho especial? eu nem sei quem vocÃª Ã©?", TimeUnit.MILLISECONDS, temp_dialog);
            System.out.println("\n");
            imprimiTexto(destacaPersonagemPrincipal("???") + ": eu sou Takeus e ao meu lado o Stelcius.. e eu sei que vocÃª tem dÃºvidas sobre a nossa realidade, tem tido pesadelos que fazem vocÃª questionar a sua vida e o mundo..", TimeUnit.MILLISECONDS, temp_dialog);
            System.out.println("\n");
            imprimiTexto("~ Com receio, porÃ©m curioso " + destacaPersonagemPrincipal(nomePersonagem) + " decide entrar no carro e ouvir o que Takeus tem a dizer.", TimeUnit.MILLISECONDS, temp_narrativa);
            System.out.println("\n");
            imprimiTexto(destacaPersonagemTakeus() + ": entendemos e acreditamos no desejo que move sua vontade, isso nos entusiasma, no entanto, primeiramente precisamos saber se vocÃª Ã© capaz de resolver alguns simples desafios e estÃ¡ apto para vir conosco.", TimeUnit.MILLISECONDS, temp_dialog);
            System.out.println("\n");
            imprimiTexto(destacaPersonagemPrincipal(nomePersonagem) + " com medo e receio, mas disposto a resolver este enigma aceita o desafio.", TimeUnit.MILLISECONDS, temp_dialog);
            System.out.println("\n");
            imprimiTexto(destacaPersonagemPrincipal(nomePersonagem) + ": qual Ã© o desafio?", TimeUnit.MILLISECONDS, temp_dialog);
            System.out.println("\n");
            imprimiTexto(destacaPersonagemTakeus() + ": uma pergunta, responda com sabedoria: ", TimeUnit.MILLISECONDS, temp_dialog);
            System.out.println("\n");

            if (desafio2(sc)) {
                System.out.println("\n");
                imprimiTexto(destacaPersonagemTakeus() + ": meus parabens, era o que eu esperava de vocÃª " + destacaPersonagemPrincipal(nomePersonagem), TimeUnit.MILLISECONDS, temp_dialog);
                System.out.println("\n");
                imprimiTexto("~ Nesse momento, enquanto Stelcius dirige, Takeus pega um tipo de seringa acoplada Ã  um leitor digital, e segurando o braÃ§o do " + destacaPersonagemPrincipal(nomePersonagem), TimeUnit.MILLISECONDS, temp_narrativa);
                System.out.println("\n");
                imprimiTexto("~ insere rapidamente a â€œagulhaâ€�, porÃ©m, nÃ£o injeta nada, ao contrÃ¡rio, suga um dispositivo robÃ³tico minÃºsculo,\n" +
                        "metÃ¡lico, com formato de vÃ­rus, movimentando-se, que ao ser escaneado pelo leitor digital, exibe a mensagem â€œAMEAÃ‡A DETECTADAâ€�. ", TimeUnit.MILLISECONDS, temp_narrativa);
                System.out.println("\n");
                imprimiTexto("~ Takeus dÃ¡ um comando, ao apertar um pequeno botÃ£o no leitor e ativa um micro triturador dentro da seringa\n" +
                        "e exibindo a mensagem â€œAMEAÃ‡A NEUTRALIZADAâ€�", TimeUnit.MILLISECONDS, temp_narrativa);
                System.out.println("\n");
                imprimiTexto(destacaPersonagemPrincipal(nomePersonagem) + " se assusta com tudo aquilo e desmaia no restante do caminho.", TimeUnit.MILLISECONDS, temp_narrativa);
                System.out.println("\n");
                imprimiTexto("~ Ao acordar, jÃ¡ estÃ¡ na sede, um prÃ©dio bonito, organizado e limpo, muito aconchegante e estruturado.", TimeUnit.MILLISECONDS, temp_narrativa);
                System.out.println("\n");
                imprimiTexto("~ Takeus o convida para tomar uma Ã¡gua em sua sala, enquanto conversam.", TimeUnit.MILLISECONDS, temp_narrativa);
                System.out.println("\n");
                imprimiTexto("~ JÃ¡ em sua sala, sentando-se na cadeira atrÃ¡s da mesa e fazendo o gesto para o " + destacaPersonagemPrincipal(nomePersonagem) + " se sentar tambÃ©m.", TimeUnit.MILLISECONDS, temp_narrativa);
                System.out.println("\n");
                imprimiTexto(destacaPersonagemTakeus() + ": Sente-se, fique Ã  vontade. Muitas pessoas vivem suas vidas e nÃ£o se perguntam como seria se fosse diferente.\n" +
                        "Eu preciso saber se vocÃª estÃ¡ disposto e quer aceitar o que tenho para te oferecer.", TimeUnit.MILLISECONDS, temp_dialog);
                System.out.println("\n");
                imprimiTexto("~ Estendendo uma mÃ£o com uma pÃ­lula azul e outra com uma pÃ­lula vermelha.", TimeUnit.MILLISECONDS, temp_narrativa);
                System.out.println("\n");
                imprimiTexto(destacaPersonagemTakeus() + ": Se vocÃª escolher a pÃ­lula azul poderÃ¡ continuar com sua vida normalmente, como sempre foi.\n" +
                        "Se vocÃª escolher a pÃ­lula vermelha, eu irei te contar a verdade, porÃ©m jamais a sua vida serÃ¡ a mesma. Pense e escolha sabiamente", TimeUnit.MILLISECONDS, temp_dialog);
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
                        imprimiTexto("Indo em direÃ§Ã£o a uma sala, Takeus acomoda " + destacaPersonagemPrincipal(nomePersonagem) + " em uma cadeira, e acopla um capacete em sua cabeÃ§a", TimeUnit.MILLISECONDS, temp_narrativa);
                        System.out.println("\n");
                        imprimiTexto("Com uma dor forte e aguda na cabeÃ§a " + destacaPersonagemPrincipal(nomePersonagem) + " dorme, e acorda logo em seguida em uma enorme sala branca.", TimeUnit.MILLISECONDS, temp_narrativa);
                        System.out.println("\n");
                        imprimiTexto(destacaPersonagemPrincipal(nomePersonagem) + ": O que aconteceu? onde estou?", TimeUnit.MILLISECONDS, temp_dialog);
                        System.out.println("\n");
                        imprimiTexto(destacaPersonagemTakeus() + ": Isto, Ã© a construÃ§Ã£o...", TimeUnit.MILLISECONDS, temp_dialog);
                        System.out.println("\n");
                        imprimiTexto(destacaPersonagemTakeus() + ": Ã‰ o nosso programa carregando...", TimeUnit.MILLISECONDS, temp_dialog);
                        System.out.println("\n");
                        imprimiTexto(destacaPersonagemPrincipal(nomePersonagem) + ": Estamos dentro de um programa de computador?", TimeUnit.MILLISECONDS, temp_dialog);
                        System.out.println("\n");
                        imprimiTexto(destacaPersonagemTakeus() + ": Ã‰ tÃ£o dificil acreditar?", TimeUnit.MILLISECONDS, temp_dialog);
                        System.out.println("\n");
                        imprimiTexto(destacaPersonagemPrincipal(nomePersonagem) + ": Isto... isto nÃ£o Ã© real?", TimeUnit.MILLISECONDS, temp_dialog);
                        System.out.println("\n");
                        imprimiTexto(destacaPersonagemTakeus() + ": O que Ã© real?... como se define real?", TimeUnit.MILLISECONDS, temp_dialog);
                        System.out.println("\n");
                        imprimiTexto(destacaPersonagemTakeus() + ": Se vocÃª se refere ao que pode sentir, cheirar, provar e ver", TimeUnit.MILLISECONDS, temp_dialog);
                        System.out.println("\n");
                        imprimiTexto(destacaPersonagemTakeus() + ": EntÃ£o real, Ã© apenas sinais eletricos interpreatados pelo seu cerebro.", TimeUnit.MILLISECONDS, temp_dialog);
                        System.out.println("\n");
                        imprimiTexto(destacaPersonagemTakeus() + ": O mundo que vocÃª conhece, existe apenas como parte de uma simulaÃ§Ã£o neurointerativa.", TimeUnit.MILLISECONDS, temp_dialog);
                        System.out.println("\n");
                        imprimiTexto(destacaPersonagemTakeus() + ": Que chamamos de axtrim.", TimeUnit.MILLISECONDS, temp_dialog);
                        System.out.println("\n");
                        imprimiTexto(destacaPersonagemTakeus() + ": Axtrim Ã© controle. Construida para nos manter sobre controle, para transformar o ser humano em energia para as mÃ¡quinas", TimeUnit.MILLISECONDS, temp_dialog);
                        System.out.println("\n");
                        imprimiTexto(destacaPersonagemPrincipal(nomePersonagem) + ": Isso nÃ£o Ã© verdade! NÃƒO! EU NÃƒO ACREDITO! NÃƒO Ã‰ POSSÃ�VEL!!", TimeUnit.MILLISECONDS, temp_dialog);
                        System.out.println("\n");
                        imprimiTexto(destacaPersonagemTakeus() + ": Eu nÃ£o disse que seria fÃ¡cil " + destacaPersonagemPrincipal(nomePersonagem) + ", eu disse que seria a VERDADE!", TimeUnit.MILLISECONDS, temp_dialog);
                        System.out.println("\n");
                        imprimiTexto(destacaPersonagemPrincipal(nomePersonagem) + ": Mas, mas... como eu mudo isso? como posso ajudar?", TimeUnit.MILLISECONDS, temp_dialog);
                        System.out.println("\n");
                        imprimiTexto(destacaPersonagemTakeus() + ": Gosto de sua vontade " + destacaPersonagemPrincipal(nomePersonagem) + "...", TimeUnit.MILLISECONDS, temp_dialog);
                        System.out.println("\n");
                        imprimiTexto(destacaPersonagemTakeus() + ": Para darmos inicio a mudanÃ§a temos que comeÃ§ar a mudanÃ§a em vocÃª", TimeUnit.MILLISECONDS, temp_dialog);
                        System.out.println("\n");
                        imprimiTexto(destacaPersonagemTakeus() + ": Precisamos dar inicio ao seu treinamento.", TimeUnit.MILLISECONDS, temp_dialog);
                        System.out.println("\n");
                        imprimiTexto(destacaPersonagemTakeus() + ": O que me diz " + destacaPersonagemPrincipal(nomePersonagem) + " podemos comeÃ§ar?", TimeUnit.MILLISECONDS, temp_dialog);
                        System.out.println("\n");

                        String resposta = "";

                        do {
                            resposta = sc.next();
                            if (resposta.toLowerCase().equals("sim") || resposta.toLowerCase().equals("vamos") || resposta.toLowerCase().equals("bora")) {
                                imprimiTexto(destacaPersonagemTakeus() + ": Ã“timo, vamos comeÃ§ar! ", TimeUnit.MILLISECONDS, temp_dialog);
                                System.out.println("\n");
                            } else {
                                imprimiTexto(destacaPersonagemTakeus() + ": O destino do mundo depende disso, pense novamente e responda!", TimeUnit.MICROSECONDS, temp_dialog);
                                System.out.println("\n");
                            }

                        } while (!(resposta.toLowerCase().equals("sim") || resposta.toLowerCase().equals("vamos") || resposta.toLowerCase().equals("bora")));

                        //inicia treinamento
                        //dois desafios, e finalizaÃ§Ã£o do capitlo 1
                        desafio1(sc);
                        System.out.println("\n");
                        desafio3(sc);

                        //finalizando capitulo1
                        System.out.println("\n");
                        imprimiTexto(destacaPersonagemTakeus() + ": " + destacaPersonagemPrincipal(nomePersonagem) + " vocÃª completou seu treinamento com sucesso, vamos continuar com o trabalho.", TimeUnit.MILLISECONDS, temp_dialog);

                        //iniciando capitlo 2
                        capitulo2();

                    } else if (cor.equals("AZUL")) {
                        //perde o jogo
                        acerto = true;
                        imprimiTexto(destacaPersonagemTakeus() + ": Lamento sua escolha " + destacaPersonagemPrincipal(nomePersonagem) + ". Pode continuar com sua vida sem sentido e patetica..", TimeUnit.MILLISECONDS, temp_dialog);
                        System.out.println("\n");
                        imprimiTexto("~ Takeus continuarÃ¡ procurando o escolhido...", TimeUnit.MICROSECONDS, temp_narrativa);

                    } else {
                        //valor invÃ¡lido
                        imprimiTexto(destacaPersonagemTakeus() + ": nÃ£o entendi, escolha entre a pilula " + ANSI_RED + "Vermelha" + ANSI_RESET + " ou " + ANSI_CYAN + "Azul" + ANSI_RESET + ": ", TimeUnit.MILLISECONDS, temp_dialog);
                    }
                } while (!acerto);
            } else {
                imprimiTexto(destacaPersonagemTakeus() + ": infelizmente vocÃª nÃ£o Ã© o que procuramos, saia do carro! ", TimeUnit.MILLISECONDS, temp_dialog);
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public static void capitulo2() {
        Scanner sc = new Scanner(System.in);
        try {
            System.out.println("\n");
            imprimiTexto(destacaPersonagemTakeus() + ": vamos para primeira etapa de nossa missÃ£o.", TimeUnit.MILLISECONDS, temp_dialog);
            System.out.println("\n");

            /* EntÃ£o Takeus leva +destacaPersonagem(nomePersonagem)+ Ã  uma cidade, dentro de AXTRIM chamada Karnaugh.
            Takeus diz: Precisamos encontrar o MAPA DE KARNAUGH para localizar os pontos e determinar os passos que iremos dar daqui a diante. */

            imprimiTexto("EntÃ£o Takeus leva " + destacaPersonagemPrincipal(nomePersonagem) + " Ã  uma dentro de AXTRIM chamada Karnaugh.", TimeUnit.MILLISECONDS, temp_narrativa);
            System.out.println("\n");
            imprimiTexto(destacaPersonagemTakeus() + ": precisamos encontrar o MAPA DE KARNAUGH para localizar os pontos e determinar os passos que iremos dar daqui a diante", TimeUnit.MILLISECONDS, temp_dialog);
            System.out.println("\n");
            imprimiTexto(destacaPersonagemTakeus() + ": ele Ã© guardado por uma sentinela que precisamos vencer antes de pega-lo.", TimeUnit.MILLISECONDS, temp_dialog);
            System.out.println("\n");
            imprimiTexto("Eles correm em direÃ§Ã£o Ã  um grande prÃ©dio e ao passar pela recepÃ§Ã£o sÃ£o atacados por um grupo que faz parte da seguranÃ§a do local.", TimeUnit.MILLISECONDS, temp_dialog);
            System.out.println("\n");
            imprimiTexto("~ O seguranÃ§a com trajes militares avanÃ§a em direÃ§Ã£o ao " + destacaPersonagemPrincipal(nomePersonagem) + " e impulsiona um golpe em direÃ§Ã£o ao seu rosto.", TimeUnit.MILLISECONDS, temp_narrativa);
            System.out.println("\n");
            imprimiTexto("~ Com sua percepÃ§Ã£o avanÃ§ada devido ao treinamentos " + destacaPersonagemPrincipal(nomePersonagem) + " analisa as possibilidades de aÃ§Ã£o..", TimeUnit.MILLISECONDS, temp_narrativa);
            System.out.println("\n");

            //ele sempra vai ganhar este desafio
            int tentativasDesafio4 = desafio4(sc);
            if (tentativasDesafio4 == 1) {
                imprimiTexto(destacaPersonagemPrincipal(nomePersonagem) + " desvia do golpe do seguranÃ§a, e acerta um golpe preciso e nÃ£o fatal em seu pescoÃ§o, neutralizando instantaneamente\n", TimeUnit.MILLISECONDS, temp_narrativa);
            } else if (tentativasDesafio4 == 2) {
                imprimiTexto(destacaPersonagemPrincipal(nomePersonagem) + " nÃ£o consegue se desvia do golpe, mas se recupera rapidamente, pegando com forÃ§a o braÃ§o do seguranÃ§a e o quebrando-o e o neutralizando\n", TimeUnit.MILLISECONDS, temp_narrativa);
            } else if (tentativasDesafio4 > 2) {
                imprimiTexto(destacaPersonagemPrincipal(nomePersonagem) + " leva o golpe com toda a forÃ§a em seu rosto, ficando zonzo e desnortiado, o seguranÃ§a aproveita a brecha e tenta lhe infligir mais um golpe.\n", TimeUnit.MILLISECONDS, temp_narrativa);
                imprimiTexto(destacaPersonagemPrincipal(nomePersonagem) + " recupera os sentidos rapidamente, e consegue evitar o segundo golpe, agarrando o braÃ§o esquerdo do seguranÃ§a e quebrando-o, e o neutralizando\n", TimeUnit.MILLISECONDS, temp_narrativa);
            }

            imprimiTexto(destacaPersonagemTakeus() + ": encontre o Sentinela, ficarei aqui cuidando destes seguranÃ§as!\n", TimeUnit.MILLISECONDS, temp_dialog);
            System.out.println("\n");
            imprimiTexto("De repente uma voz interrompe TAKEUS\n", TimeUnit.MILLISECONDS, temp_narrativa);
            System.out.println("\n");
            imprimiTexto("Sentinela: EntÃ£o vocÃªs estÃ£o me procurando?\n", TimeUnit.MILLISECONDS, temp_narrativa);
            System.out.println("\n");
            imprimiTexto(destacaPersonagemPrincipal(nomePersonagem) + ": Nos entregue o MAPA DE KARNAUGH e deixaremos vocÃª em paz!\n", TimeUnit.MILLISECONDS, temp_dialog);
            System.out.println("\n");
            imprimiTexto("Sentinela: Eu sou o guardiÃ£o deste MAPA, jamais entregaria a vocÃªs!\n", TimeUnit.MILLISECONDS, temp_dialog);
            System.out.println("\n");
            imprimiTexto(destacaPersonagemPrincipal(nomePersonagem) + " salta em direÃ§Ã£o a sentinela..\n", TimeUnit.MILLISECONDS, temp_dialog);
            System.out.println("\n");

            int tentativasDesafio5 = desafio5(sc);
            if (tentativasDesafio5 == 1) {
                imprimiTexto(destacaPersonagemPrincipal(nomePersonagem) + " desfere golpes certeiros, o Sentinela cai se desintegrando, como poeira ao vento, dando a impressÃ£o de um programa sendo desfragmentado.\n", TimeUnit.MILLISECONDS, temp_narrativa);
            } else if (tentativasDesafio5 <= 3) {
                imprimiTexto(destacaPersonagemPrincipal(nomePersonagem) + " aplica um golpe, porÃ©m o sentinela consegue desviar, e o acerta em suas costa com uma de suas garras.\n", TimeUnit.MILLISECONDS, temp_narrativa);
                imprimiTexto("ferido, o sentinela tenta desferir um golpe mortal em " + destacaPersonagemPrincipal(nomePersonagem), TimeUnit.MILLISECONDS, temp_narrativa);
                imprimiTexto(" por sorte " + destacaPersonagemPrincipal(nomePersonagem) + " consegue desviar do golpe, e revida com um chute em sua central de comando, assim a destruindo em pedaÃ§os\n", TimeUnit.MILLISECONDS, temp_narrativa);
            } else if (tentativasDesafio5 > 3) {
                //personagem morre
                imprimiTexto("O sentinela desfere um golpe certeiro e mortal com sua gerra em " + destacaPersonagemPrincipal(nomePersonagem) + ", assim o atravessando-o e o matando instantaneamente.\n", TimeUnit.MILLISECONDS, temp_narrativa);
                System.out.println("\n");
                imprimiTexto("Takeus ao presenciar tal cena cai de joelhos no chÃ£o e grita em desepero.\n", TimeUnit.MILLISECONDS, temp_narrativa);
                System.out.println("\n");
                imprimiTexto(destacaPersonagemTakeus() + ": NÃƒAAAAAOOOOOOO!!!!\n", TimeUnit.MILLISECONDS, temp_dialog);
                System.out.println("\n");
                imprimiTexto("seu grito ecoa por todo o predio..\n", TimeUnit.MILLISECONDS, temp_narrativa);
                System.out.println("\n");
                imprimiTexto("Com a morte de " + destacaPersonagemPrincipal(nomePersonagem) + " a humanidade contÃ­nua escrava do vÃ­rus que as prende numa ilusÃ£o dentro de AXTRIM para roubar sua energia e usa-as como fantoches.\n", TimeUnit.MILLISECONDS, temp_narrativa);
                sairDoJogo();
            }

            imprimiTexto("Se recuperando da luta " + destacaPersonagemPrincipal(nomePersonagem) + " anda em direÃ§Ã£o ao fim corredor e encontra uma porta, ao entrar na sala e ver o armario.\n", TimeUnit.MILLISECONDS, temp_narrativa);
            imprimiTexto("ele corre em direÃ§Ã£o a ele e o abre, encontrando um cofre eletronico\n", TimeUnit.MILLISECONDS, temp_dialog);

            imprimiTexto(destacaPersonagemPrincipal(nomePersonagem) + ": nesse cofre estÃ¡ o mapa que precisamos, preciso decodificar a senha para abri-lo.\n", TimeUnit.MILLISECONDS, temp_dialog);

            desafio6(sc);

            System.out.println("\n");
            //sem risco de morte, pois o personagem estÃ¡ apenas abrindo o cofre
            imprimiTexto(destacaPersonagemPrincipal(nomePersonagem) + " abre o cofre..\n", TimeUnit.MILLISECONDS, temp_narrativa);

            capitulo3();

        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public static void capitulo3() {
        Scanner sc = new Scanner(System.in);
        try {
            System.out.println("\n");
            imprimiTexto("~ " + destacaPersonagemPrincipal(nomePersonagem) + " vÃª um dispositivo semelhante Ã  um tablet, mas todo transparente.\n" +
                    "Ao pegÃ¡-lo ele ativa exibindo pontos de luz na cor verde conectados e piscando. Admirado e cansado da luta diz\n .", TimeUnit.MILLISECONDS, temp_narrativa);
            imprimiTexto(destacaPersonagemPrincipal(nomePersonagem) + ": EntÃ£o esse Ã© o MAPA DE KARNAUGH!\n", TimeUnit.MILLISECONDS, temp_dialog);

            imprimiTexto("~ Takeus finalmente chega na sala onde " + nomePersonagem + " venceu a luta, tambÃ©m estÃ¡ cansado e ferido\n", TimeUnit.MILLISECONDS, temp_narrativa);
            imprimiTexto(destacaPersonagemTakeus() + ": " + nomePersonagem + " vocÃª conseguiu vencer o Sentinela de Karnaugh, agora precisamos encontrar um amigo para nos ajudar interpretar o mapa e solucionar esse caos\n", TimeUnit.MILLISECONDS, temp_dialog);
            imprimiTexto("~ Eles saem e vÃ£o atÃ© um lugar simples, como um bairro de periferia e se dirigem Ã  uma casa simples.\n", TimeUnit.MILLISECONDS, temp_narrativa);
            imprimiTexto("~ Entrando lÃ¡ encontram um senhor pacato, de cabelos grisalhos, muito gentil, que estÃ¡ fazendo um chÃ¡ na cozinha\n", TimeUnit.MILLISECONDS, temp_narrativa);
            imprimiTexto(destacaPersonagemPrincipal("???") + ": estive esperando muito tempo vocÃªs, prazer conhece-lo " + nomePersonagem + ". VocÃª trouxe o MAPA DE KARNAUGH  e quer saber como usÃ¡-lo.\n", TimeUnit.MILLISECONDS, temp_dialog);
            imprimiTexto("~ " + nomePersonagem + " olha surpreso para Takeus que lhe explica...", TimeUnit.MILLISECONDS, temp_narrativa);
            imprimiTexto(destacaPersonagemTakeus() + ": Este Ã© Edward Veitch, ele pode lhe dizer como chegar onde precisa. Acompanhe-o e ouÃ§a o que ele tem a dizer.\n", TimeUnit.MILLISECONDS, temp_dialog);

            imprimiTexto("~ Edward Veitch sai da cozinha e vai para uma varanda, +nomePersonagem+ acompanha\n", TimeUnit.MILLISECONDS, temp_narrativa);
            imprimiTexto(destacaPersonagemPrincipal(nomePersonagem) + ": O que estÃ¡ acontecendo? Por que tudo isso?\n", TimeUnit.MILLISECONDS, temp_dialog);
            imprimiTexto("Edward Veitch: VocÃª Ã© o escolhido. SaberÃ¡ o que fazer no momento certo. Mas antes vocÃª precisa conhecer muito bem quem Ã© seu aliado e quem Ã© seu inimigo\n", TimeUnit.MILLISECONDS, temp_dialog);
            imprimiTexto(destacaPersonagemPrincipal(nomePersonagem) + ": Como irei saber isso?\n", TimeUnit.MILLISECONDS, temp_dialog);
            imprimiTexto("Edward Veitch: O MAPA que vocÃª pegou ao vencer aquele Sentinela irÃ¡ indicar o primeiro passo.\n" +
                    "Siga o trajeto mostrado. Cada ponto destes que estÃ¡ brilhando simboliza os principais prÃ©dios de KARNAUGH, as linhas que os ligam sÃ£o as vias principais que vocÃª deve seguir.\n" +
                    "NÃ£o mude de trajeto. Ao chegar no lugar final, vocÃª irÃ¡ saber o que fazer, mas precisa ir sozinho.\n", TimeUnit.MILLISECONDS, temp_dialog);
            imprimiTexto("~ " + nomePersonagem + " segue o trajeto indicado por Edward Veitch.\n", TimeUnit.MILLISECONDS, temp_narrativa);
            imprimiTexto("~ Em determinado momento da trajetÃ³ria, curiosamente Stelcios aparece.\n", TimeUnit.MILLISECONDS, temp_narrativa);
            imprimiTexto(destacaPersonagemPrincipal(nomePersonagem) + " se dirige a ele, surpreso por vÃª-lo ali.\n", TimeUnit.MILLISECONDS, temp_narrativa);
            imprimiTexto(destacaPersonagemStelcius() + ": Ora ora, se nÃ£o Ã© " + nomePersonagem + " eu achei que vocÃª nÃ£o iria conseguir chegar tÃ£o longe, espero que esteja preparado.\n", TimeUnit.MILLISECONDS, temp_dialog);
            imprimiTexto(destacaPersonagemStelcius() + ": Precisamos passar por aquela frota de seguranÃ§as para chegar no local de acesso da AXTRIM, que possibilita reprogramar definitivamente a mente das pessoas\n", TimeUnit.MILLISECONDS, temp_dialog);
            imprimiTexto("~ Eles vÃ£o e imediatamente a luta inicia contra aquele pequeno exÃ©rcito de seguranÃ§as super habilidosos.\n", TimeUnit.MILLISECONDS, temp_narrativa);


            int tentativasDesafio7 = desafio7(sc);

            if (tentativasDesafio7 == 1) {
                imprimiTexto("~ Com uma habilidade extraordinaria e focado com o desejo de salvar o mundo " + nomePersonagem + ", neutraliza todos os seguranÃ§as rapidamente.\n", TimeUnit.MILLISECONDS, temp_narrativa);
            } else if (tentativasDesafio7 >= 2) {
                imprimiTexto("~ Todos os seguranÃ§as partem para cima de Stelcius e " + nomePersonagem + ", vÃ¡rios mobilizam e infligem diversos golpes nos dois \n", TimeUnit.MILLISECONDS, temp_narrativa);
                imprimiTexto("~ Atordoado, Stelcius se enfurece, e comeÃ§a a golpear todos os seguranÃ§as em uma velocidade impressionante, assim neutralizando-os um por um.\n", TimeUnit.MILLISECONDS, temp_narrativa);
            }

            imprimiTexto("Stelcios: Vamos atÃ© a cÃ¢mara que permite que AXTRIM controle toda a humanidade\n", TimeUnit.MILLISECONDS, temp_dialog);
            imprimiTexto("~ Eles correm e entram no prÃ©dio e chegam a uma sala que tem uma porta de seguranÃ§a eletrÃ´nica.\n" +
                    "Stelcius a abre e visualizam uma espÃ©cie de â€œservidorâ€� muito robusto e tecnolÃ³gico conectado Ã  um computador central\n", TimeUnit.MILLISECONDS, temp_narrativa);
            imprimiTexto(destacaPersonagemStelcius() + ": Finalmente chegamos...\n", TimeUnit.MILLISECONDS, temp_dialog);
            imprimiTexto(destacaPersonagemStelcius() + " Caminha em direÃ§Ã£o ao computador...\n", TimeUnit.MILLISECONDS, temp_dialog);
            imprimiTexto(destacaPersonagemStelcius() + " Hahahahahahahaha...\n", TimeUnit.MILLISECONDS, temp_dialog);
            imprimiTexto(destacaPersonagemPrincipal(nomePersonagem + ": O que estÃ¡ acontecendo? Ã‰ esse computador que precisamos destruir?\n"), TimeUnit.MILLISECONDS, temp_dialog);
            imprimiTexto(destacaPersonagemStelcius() + ": Na verdade, se vocÃª destruir esse computador jamais poderÃ¡ libertar a humanidade. Mas agora que eu o acessei poderei concluir o que comecei... Hahahahaha\n", TimeUnit.MILLISECONDS, temp_dialog);
            imprimiTexto(destacaPersonagemPrincipal(nomePersonagem) + ": Como assim? do que estÃ¡ falando?\n", TimeUnit.MILLISECONDS, temp_dialog);
            imprimiTexto(destacaPersonagemStelcius() + ": Realmente Ã© de se surpreender que vocÃª chegou tÃ£o longe... Eu irei controlar toda a humanidade e vocÃª nÃ£o poderÃ¡ fazer nada para impedir! Hahahahahaha!\n", TimeUnit.MILLISECONDS, temp_dialog);
            imprimiTexto("~ " + nomePersonagem + "o ataca, tentando impedir, mas Stelcios lhe desfere um golpe com as costas de sua mÃ£o ao ponto de arremessa-lo para fora da sala principal que estavam\n", TimeUnit.MILLISECONDS, temp_narrativa);
            imprimiTexto("~ " + destacaPersonagemStelcius() + " acessa e abre o programa que permite controlar definitivamente a humanidade atravÃ©s de sua prÃ³pria mente, iniciando o carregamento para roda-lo.\n", TimeUnit.MILLISECONDS, temp_narrativa);
            imprimiTexto("~ Nesse momento " + nomePersonagem + " se levanta e ataca novamente, mas dessa vez usando toda sua habilidade consegue desviar do primeiro super golpe de Stelcios, iniciando uma luta jamais vista.\n", TimeUnit.MILLISECONDS, temp_narrativa);

            int tentativasDesafio8 = desafio8(sc);

            if (tentativasDesafio8 == 1) {
                imprimiTexto("~ " + nomePersonagem + " concentra toda sua forÃ§a em um unico golpe e acerta o ponto central onde conectava Stelcius a matrix princial do virus, causando uma explosÃ£o que acaba danificando parte do corpo de Stelcius\n", TimeUnit.MILLISECONDS, temp_narrativa);
            } else if (tentativasDesafio8 <= 3) {
                imprimiTexto(" ~ Stelcius, desvia do primeiro golpe de " + nomePersonagem + ", e ri de sua tentativa de acerta-lo..\n", TimeUnit.MILLISECONDS, temp_narrativa);
                imprimiTexto(" ~ porem " + nomePersonagem + "o supreende com um chute em seu estomago, o danificando-o, fazendo com que ele recue\n", TimeUnit.MILLISECONDS, temp_narrativa);
            } else {
                imprimiTexto("- Stelcius, desvia do primeiro golpe de " + nomePersonagem + ", e ri de sua tenttiva de acerta-lo..\n", TimeUnit.MILLISECONDS, temp_narrativa);
                imprimiTexto("Stelcius, imediatamente revida com um golpe certeiro, arremessando-o ao chÃ£o e o matando.\n", TimeUnit.MILLISECONDS, temp_narrativa);
                imprimiTexto("~ Com a morte de " + nomePersonagem, TimeUnit.MILLISECONDS, temp_narrativa);
                imprimiTexto("A humanidade contÃ­nua escrava do vÃ­rus que as prende numa ilusÃ£o dentro de AXTRIM para roubar sua energia e usa-as como fantoches.", TimeUnit.MILLISECONDS, temp_narrativa);
                sairDoJogo();
            }


            imprimiTexto("~ Ambos muitos cansados caem no chÃ£o debaixo de uma forte chuva\n", TimeUnit.MILLISECONDS, temp_narrativa);
            imprimiTexto("~ Stelcios se levanta...", TimeUnit.MILLISECONDS, temp_narrativa);
            imprimiTexto(destacaPersonagemStelcius() + ": " + nomePersonagem + " vocÃª nÃ£o me venceu ainda, eu nÃ£o posso perder\n", TimeUnit.MILLISECONDS, temp_dialog);
            imprimiTexto("~ E como se recuperasse suas forÃ§as Stelcius voa em direÃ§Ã£o Ã  " + nomePersonagem + " para ataca-lo, que estÃ¡ se levantando e se posicionando em pÃ© novamente para lutar.\n", TimeUnit.MILLISECONDS, temp_narrativa);
            imprimiTexto("~ " + nomePersonagem + " se prepara para defender o golpe e inicia novamente o embate\n", TimeUnit.MILLISECONDS, temp_narrativa);
            imprimiTexto("~ Enquanto essa luta acontece, Takeus descobre toda a verdade sobre Stelcios em um diÃ¡logo esclarecedor com Edward Veitch e sai Ã  procura de " + nomePersonagem + " e do computador central\n", TimeUnit.MILLISECONDS, temp_narrativa);
            imprimiTexto("~ Ele encontra a sala (agora bastante danificada pela luta) e chega ao computador que prossegue seu carregamento do programa final da AXTRIM\n", TimeUnit.MILLISECONDS, temp_narrativa);
            imprimiTexto("~ Ele tenta cancelar o programa, mas nÃ£o Ã© possÃ­vel pois Ã© protegido com muitos cÃ³digos criptografados em uma linguagem de programaÃ§Ã£o jamais vista antes\n", TimeUnit.MILLISECONDS, temp_narrativa);
            imprimiTexto("~ muito alÃ©m do nÃ­vel militar conhecido, com sÃ­mbolos e palavras nunca antes vistos por humano algum.\n" +
                    "EntÃ£o ele ali tenta descobrir qual o conceito utilizado para basear a chave daquela criptografia...\n", TimeUnit.MILLISECONDS, temp_narrativa);

            desafio9();

            System.out.println("\n");

            /*Luta acontecendo e Takeus tentando parar o programa de controle da AXTRIM)
            Se vencer o desafio final e ganhar o jogo:

            Stelcios acredita que venceu, +nomePersonagem+ exausto cai no chÃ£o de joelhos e recebe um golpe das mÃ£os de Stelcios que o atravessa como uma lÃ¢mina e o absorve. PorÃ©m comeÃ§am a sair luzes de seu corpo que vira como que uma poeira de programa sendo desfeito, luminosamente.
            Nesse exato momento, a tela do computador que Takeus tenta impedir a finalizaÃ§Ã£o do programa, estando jÃ¡ em 99% de conclusÃ£o exibe a mensagem â€œCarregamento cancelado: erro sistema!â€� e Takeus diz emocionado com lÃ¡grimas nos olhos: â€œRealmente ele era o escolhido. â€�

            O mundo finalmente pode alegrar-se com sua liberdade, pois jamais serÃ¡ escravo novamente de um sistema manipulador. Todos agradecem Ã  bravura de +nomePersonagem+ e jamais se esquecerÃ£o de tudo que fez.*/

        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public static void instrucoes() {
        Scanner sc = new Scanner(System.in);
        int escolha = 0;
        System.out.println("- InstruÃ§Ãµes -");
        System.out.println("Axtrim2033 apresenta vÃ¡rios desafios de multipla escolha, \n" +
                "basta escolhar uma das alternativas que serÃ¡ exibida (a,b,c,d OU e).\n" +
                "mas escolha com sabedoria, o destino do mundo estÃ¡ em suas mÃ£os...");
        do {
            System.out.println("");
            System.out.println("1 - Voltar para o menu principal");
            escolha = sc.nextInt();
            switch (escolha) {
                case 1:
                    menu(sc);
                    break;
                default:
                    System.out.println("OpÃ§Ã£o invÃ¡lida");
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
                    System.out.println("OpÃ§Ã£o invÃ¡lida");
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

    public static String destacaPersonagemStelcius() {
        return ANSI_GREEN + "Stelcius" + ANSI_RESET;
    }

    public static void sairDoJogo() {
        System.exit(0);
    }
}

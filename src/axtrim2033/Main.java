package axtrim2033;

import java.util.ArrayList;

import java.util.Collections;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		desafio5();
		desafio6();
	}

	public static void desafioJulio1() {

		Scanner entrada = new Scanner(System.in);

		boolean rcerta = false;
		int compara = 0;

		ArrayList alternativa = new ArrayList();
		alternativa.add("(A)");
		alternativa.add("(B)");
		alternativa.add("(C)");
		alternativa.add("(D)");
		alternativa.add("(E)");

		ArrayList resposta = new ArrayList();
		resposta.add("NAND");
		resposta.add("OR");
		resposta.add("NO");
		resposta.add("AND");
		resposta.add("NOR");

		String certa = "AND";

		do {

			System.out.println(
					"Você precisa de uma porta lógica que verifique entradas e somente a partir desta verificação ");
			System.out.println(
					"se chegue à uma saída VERDADEIRA, no entanto, ambas entradas também precisam ser VERDADEIRAS.");
			System.out.println("Qual porta lógica você deve usar para fazer essa verificação?");
			for (int i = 1; i <= 5; i++) {
				System.out.println(alternativa.get(i - 1) + " " + resposta.get(i - 1));
			}
			System.out.print("Escolha uma alternativa: ");
			String escolha = entrada.next();
			escolha = escolha.toLowerCase();

			switch (escolha) {

			case "a":
				compara = 0;
				break;

			case "b":
				compara = 1;
				break;

			case "c":
				compara = 2;
				break;

			case "d":
				compara = 3;
				break;

			case "e":
				compara = 4;
				break;

			default:
				System.out.println("Alternativa inválida!");
			}
			if (resposta.get(compara).equals(certa)) {
				System.out.println("Resposta certa!");
				rcerta = true;
			} else {
				System.out.println("Resposta incorreta, tente outra vez!");
				Collections.shuffle(resposta);
			}

		} while (!rcerta);

	}

	public static void desafioJulio2() {

		Scanner entrada = new Scanner(System.in);

		boolean rcerta = false;
		int compara = 0;

		ArrayList alternativa = new ArrayList();
		alternativa.add("(A)");
		alternativa.add("(B)");
		alternativa.add("(C)");
		alternativa.add("(D)");
		alternativa.add("(E)");

		ArrayList resposta = new ArrayList();
		resposta.add("NOR ; NOR ; NAND");
		resposta.add("NAND ; NOR ; NOR");
		resposta.add("NAND ; NAND ; NOR");
		resposta.add("NOR ; NOR ; NOR");
		resposta.add("NAND ; NAND ; NAND");

		String certa = "NAND ; NAND ; NOR";

		do {

			System.out.println(
					"Qual das alternativas representa a escolha adequada de portas lógicas em relação às seguintes necessidades:");
			System.out.println("• Só tenha saída VERDADEIRA, quando as duas entradas forem FALSAS");
			System.out.println("• Representa a lógica: S = ~ (A.B)");
			System.out.println("• Representa a lógica: S = ~ (A+B)");
			for (int i = 1; i <= 5; i++) {
				System.out.println(alternativa.get(i - 1) + " " + resposta.get(i - 1));
			}
			System.out.print("Escolha uma alternativa: ");
			String escolha = entrada.next();
			escolha = escolha.toLowerCase();

			switch (escolha) {

			case "a":
				compara = 0;
				break;

			case "b":
				compara = 1;
				break;

			case "c":
				compara = 2;
				break;

			case "d":
				compara = 3;
				break;

			case "e":
				compara = 4;
				break;

			default:
				System.out.println("Alternativa inválida!");
			}
			if (resposta.get(compara).equals(certa)) {
				System.out.println("Resposta certa!");
				rcerta = true;
			} else {
				System.out.println("Resposta incorreta, tente outra vez!");
				Collections.shuffle(resposta);
			}

		} while (!rcerta);
	}
		
		private static void desafio5() {
		Scanner entrada = new Scanner(System.in);
		String opcao;

		
		int cont = 1;
		int tentativas = 0;
		boolean acerto = false;

		System.out.println("Em qual base numérica está o numero 10101110 ");

		do {

			System.out.println("A)Está em hexadecimal");
			System.out.println("B)Está em decimal");
			System.out.println("C)Está em binario");
			System.out.println("D)Está em octal");
			System.out.println("E)Está na Base 10");

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
			System.out.println("As 3 tentativas estão incorretas ");

		}
	}

	public static void desafio6() {

		Scanner entrada = new Scanner(System.in);
		String opcao;

		int cont = 1;
		int tentativas = 0;
		boolean acerto = false;

		System.out
				.println("Quantos bits devem ser agrupados se você modificar da base (Binária) para a base (Octal)? ");

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
			System.out.println("As 3 tentativas estão incorretas ");

		}

	}
}

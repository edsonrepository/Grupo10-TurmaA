package axtrim2033;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		desafio5();
		desafio6();
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
}

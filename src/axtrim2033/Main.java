package axtrim2033;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		System.out.println("Teste");
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
					"Voc� precisa de uma porta l�gica que verifique entradas e somente a partir desta verifica��o ");
			System.out.println(
					"se chegue � uma sa�da VERDADEIRA, no entanto, ambas entradas tamb�m precisam ser VERDADEIRAS.");
			System.out.println("Qual porta l�gica voc� deve usar para fazer essa verifica��o?");
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
				System.out.println("Alternativa inv�lida!");
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
					"Qual das alternativas representa a escolha adequada de portas l�gicas em rela��o �s seguintes necessidades:");
			System.out.println("� S� tenha sa�da VERDADEIRA, quando as duas entradas forem FALSAS");
			System.out.println("� Representa a l�gica: S = ~ (A.B)");
			System.out.println("� Representa a l�gica: S = ~ (A+B)");
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
				System.out.println("Alternativa inv�lida!");
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
}

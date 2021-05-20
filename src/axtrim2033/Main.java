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

	public static void desafioHenrique1() {

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

	public static void desafioHenrique2() {

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
		respostas.add("254");
		respostas.add("111");
		respostas.add("233");

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

}

package axtrim2033;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		System.out.println("Teste");	
	}

	
	public static void desafioHenrique1() {
		
Scanner lets = new Scanner(System.in);
		
		ArrayList opcao = new ArrayList<String>();
		ArrayList respostas = new ArrayList<String>();
		
		String altString, respC,r;
		int H=0;
		
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
			
			
			System.out.println("Os computadores utilizam o sistema binário ou de base 2 que é um sistema de numeração em que todas as quantidades se representam com base em dois \n "
					+ "números, ou seja, (0 e 1). Em um computador o número 2012, em base decimal, será representado, em base binária, por:\r\n"
					);
			
				for(int L =1; L<=5; L++) {
					
					System.out.println(opcao.get(L-1)+ " - " + respostas.get(L-1));
				}
			
				System.out.println("Digite a alternativa correta: ");
				
				r = lets.next();
		
		
					
		
		switch (r.toLowerCase()){
		
		case "a":
		case "A":
		H=0;
		
		break;
		
		case"b":
		case"B":
		H=1;
	
		break;
		
		case"c":
		case"C":
		H=2;		
		
		break;
		
		case"d":
		case"D":
		H=3;
	
		break;
		
		case"e":
		case"E":
		H=4;
		
		break;
				
			default:
				
				System.out.println("Alternativa invalida");
				
				
		}
		if(respostas.get(H).equals(respC)) {
			
			System.out.println("Resposta correta.");
			result = true;
			
			

			
		}	else {
			
			System.out.println("Resposta incorreta.");
			Collections.shuffle(respostas);
			
		}
		
		} while (result == false);
		
		
		
		lets.close();
							
	}
		
		
}
	


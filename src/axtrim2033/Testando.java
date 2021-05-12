package axtrim2033;

import java.util.Scanner;

public class Testando {

    private static String nomePersonagem;
    private int hp = 100;
    
    public static void main( String[] args ) {
        
        Scanner sc = new Scanner( System.in );
        boasVindasIniciaHistoria(sc);
        
    }
    
    public static boolean esperaAcaoUsuario() {
        Scanner esperaPeloEnter = new Scanner( System.in );
        System.out.println( "Pressione alguma tecla para Continuar" );
        esperaPeloEnter.nextLine();
        return true;
    }
    
    public static void boasVindasIniciaHistoria(Scanner sc) {
        
        do {

            String boasVindas = "**************************************************************************"
                    + "\n"
                    + "\n"
                    + "\n**************************************************************************"
                    + "\nBEM VINDO AO MUNDO DE AXTRIM2033!"
                    + "\n"
                    + "\nDigite seu nome para continuar: ";
            System.out.println( boasVindas );
            nomePersonagem = sc.next();
            
        } while (nomePersonagem.isEmpty());
        
    }
    
    public static void continuaHistoria() {
        
        String parte1 = "OLÁ " + nomePersonagem + " ESTAMOS EM 2033, A PANDEMIA ASSOLOU ";
        esperaAcaoUsuario();
        
    }

}

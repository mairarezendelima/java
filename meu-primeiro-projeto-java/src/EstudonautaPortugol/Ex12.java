package EstudonautaPortugol;

import java.util.Scanner;

public class Ex12 {
    public static void main(String[] args) {
        String nomecompl, pnome;
        int posi;
        
        Scanner teclado = new Scanner(System.in);
        
        System.out.print("Digite seu nome completo: ");
        nomecompl = teclado.nextLine();

        teclado.close();

        posi = nomecompl.indexOf(" ", 0); // índice da primeira ocorrência de espaço vazio a partir do início
        pnome = nomecompl.substring(0, posi);
        
        System.out.println("Seu primeiro nome é " + pnome.toUpperCase());
        System.out.println("\n\n");
    }
}

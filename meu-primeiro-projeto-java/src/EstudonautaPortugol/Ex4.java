package EstudonautaPortugol;

import java.util.Scanner;

public class Ex4 {
	public static void main(String[] args) {

        int n1, n2;
        
        Scanner teclado = new Scanner(System.in);
        
        System.out.print("Digite um número: ");
        n1 = Integer.parseInt(teclado.nextLine());
        System.out.print("Digite outro número: ");
        n2 = Integer.parseInt(teclado.nextLine());

        teclado.close();

        System.out.println("\n---------- RESULTADOS ----------");
        System.out.println("\nSOMA = " + (n1 + n2));
        System.out.println("\nDIFERENÇA = " + (n1 - n2));
        System.out.println("\nPRODUTO = " + (n1 * n2));
        System.out.println("\nDIVISÃO REAL = " + (Float.intBitsToFloat(n1) / Float.intBitsToFloat(n2)));
        System.out.println("\nDIVISÃO INTEIRA = " + (n1 / n2));
        System.out.println("\nRESTO DA DIVISÃO = " + (n1 % n2));
        System.out.println("\n\n");
    }
}

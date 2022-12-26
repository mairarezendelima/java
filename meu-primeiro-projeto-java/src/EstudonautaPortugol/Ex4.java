package EstudonautaPortugol;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Ex4 {
	public static void main(String[] args) {

        int n1, n2;
        
        Scanner teclado = new Scanner(System.in);
        DecimalFormat deci = new DecimalFormat("0.00");
        
        System.out.print("Digite um número: ");
        n1 = Integer.parseInt(teclado.nextLine()); // Obter um inteiro a partir de um String
        System.out.print("Digite outro número: ");
        n2 = Integer.parseInt(teclado.nextLine());

        teclado.close();

        float n1Float = n1;
        float n2Float = n2;
        float res = n1Float / n2Float;

        System.out.println("\n---------- RESULTADOS ----------");
        System.out.println("\nSOMA = " + (n1 + n2));
        System.out.println("\nDIFERENÇA = " + (n1 - n2));
        System.out.println("\nPRODUTO = " + (n1 * n2));
        System.out.println("\nDIVISÃO REAL = " + (deci.format(res)));
        System.out.println("\nDIVISÃO INTEIRA = " + (n1 / n2));
        System.out.println("\nRESTO DA DIVISÃO = " + (n1 % n2));
        System.out.println("\n\n");
    }
}
//String myString = "4152";
//int myInt = Integer.parseInt(myString);

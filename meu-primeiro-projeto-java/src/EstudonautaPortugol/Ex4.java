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

        float n1Float = n1;
        float n2Float = n2;
        float res = n1Float / n2Float;

        System.out.println("---------- RESULTADOS ----------");
        System.out.println("SOMA = " + (n1 + n2));
        System.out.println("DIFERENÇA = " + (n1 - n2));
        System.out.println("PRODUTO = " + (n1 * n2));
        System.out.println("DIVISÃO REAL = " + (deci.format(res)));
        System.out.println("DIVISÃO INTEIRA = " + (n1 / n2));
        System.out.println("RESTO DA DIVISÃO = " + (n1 % n2));
        System.out.println("\n");
    }
}
//String myString = "4152";
//int myInt = Integer.parseInt(myString);

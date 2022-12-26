package EstudonautaPortugol;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Ex19 {
    public static void main(String[] args) {
        int n;
        float resp;
		
		Scanner teclado = new Scanner(System.in);
        DecimalFormat deci = new DecimalFormat("0.00");
        
        System.out.print("Digite um número: ");
		n = teclado.nextInt();

        teclado.close();

        float nFloat = n;

		if (n > 0) {
			resp = 1 / nFloat;
			System.out.println("O inverso de " + n + " é " + deci.format(resp));
		}
		else {
			resp = nFloat * (-1);
			System.out.println("O oposto de " + n + " é " + deci.format(resp));
		}
		System.out.println("\n\n");
    }
}

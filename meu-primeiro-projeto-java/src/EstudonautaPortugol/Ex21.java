package EstudonautaPortugol;

import java.util.Scanner;

public class Ex21 {
    public static void main(String[] args) {
        int n;
		
		Scanner teclado = new Scanner(System.in);
        
        System.out.print("Digite um número: ");
		n = teclado.nextInt();

        teclado.close();
		
		System.out.print("O número " + n + " digitado é ");
		if (n > 0) {
			 System.out.print("POSITIVO");
		}
		else if (n < 0) {
			System.out.print("NEGATIVO");
		}
		else {
			System.out.print("NULO");
		}
		System.out.println("\n\n");
    }
}

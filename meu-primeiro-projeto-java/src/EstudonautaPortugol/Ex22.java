package EstudonautaPortugol;

import java.util.Scanner;

public class Ex22 {
    public static void main(String[] args) {
        int v1, v2;
		
		Scanner teclado = new Scanner(System.in);
        
        System.out.print("Primeiro valor: ");
		v1 = teclado.nextInt();

		System.out.print("Segundo valor: ");
		v2 = teclado.nextInt();

		if (v1 > v2) {
			System.out.println("Os valores digitados em ordem são " + v2 + " e " + v1);
		}
		else if (v1 < v2) {
			System.out.println("Os valores digitados em ordem são " + v1 + " e " + v2);
		}
		else {
			System.out.println("Não há necessidade de ordená-los. Os valores são iguais!");
		}
		System.out.println("\n");
    }
}

package EstudonautaPortugol;

import java.util.Scanner;

public class Ex25 {
    public static void main(String[] args) {
        int a, b, c, maior, menor, meio;
		
		Scanner teclado = new Scanner(System.in);
        
        System.out.println("------------------- TRÊS VALORES EM ORDEM -------------------------");
		
        System.out.print("\nPrimeiro valor: ");
		a = teclado.nextInt();
		System.out.print("Segundo valor: ");
		b = teclado.nextInt();
		System.out.print("Terceiro valor: ");
		c = teclado.nextInt();

		if (a > b) {
			if (c > a) {
				maior = c;
				meio = a;
				menor = b;
			}
			else if (c > b) {
				maior = a;
				meio = c;
				menor = b;
			}
			else {
				maior = a;
				meio = b;
				menor = c;
			}
		}
		else if (c > b) {
			maior = c;
			meio = b;
			menor = a;
		}
		else if (c > a) {
			maior = b;
			meio = c;
			menor = a;
		}
		else {
			maior = b;
			meio = a;
			menor = c;
		}
		System.out.println("--------------------------------------------------------------------");
		System.out.println("MAIOR: " + maior);
		System.out.println("INTERMEDIÁRIO: " + meio);
		System.out.println("MENOR: " + menor);
		System.out.println("\n");
    }
}

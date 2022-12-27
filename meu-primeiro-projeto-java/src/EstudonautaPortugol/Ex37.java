package EstudonautaPortugol;

import java.util.Scanner;

public class Ex37 {
    public static void main(String[] args) {
        int indice = 1, idade, maior = 0, menor = 0;
		String nome, velho = "", jovem = "";
        
        Scanner teclado = new Scanner(System.in);

        while (indice <= 3) {
			System.out.println("-----------------\n");
			System.out.println(indice + "ª PESSOA");
			System.out.println("\n-----------------");

			System.out.print("\nNome: ");
			nome = teclado.next(); // String: O next() é para receber uma só palavra; se é pra receber uma frase, usar nextLine()
			System.out.print("Idade: ");
			idade = teclado.nextInt();

			if (indice == 1) {
				maior = idade;
				menor = idade;
				velho = nome;
				jovem = nome;
			}
			else {
				if (idade > maior) {
					maior = idade;
					velho = nome;
				}
				else if (idade < menor) {
					menor = idade;
					jovem = nome;
				}
			}
			indice += 1;
		}
        teclado.close();

		System.out.println("===================");
		System.out.println("\nA pessoa mais velha é " + velho + " com " + maior + " anos.");
		System.out.println("\nA pessoa mais jovem é " + jovem + " com " + menor + " anos.");
		System.out.println("\n\n");
    }
}

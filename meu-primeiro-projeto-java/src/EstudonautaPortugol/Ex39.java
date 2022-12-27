package EstudonautaPortugol;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Ex39 {
    public static void main(String[] args) {
        int numero = 0, indice = 0, soma = 0, maior = 0;
		float media;

        Scanner teclado = new Scanner(System.in);
        DecimalFormat deci = new DecimalFormat("0.00");

		while (numero != 9999) {
			System.out.println("----------------------------------------\n");
			System.out.println((indice + 1) + "º valor [Digite 9999 para encerrar]\n");
			System.out.println("----------------------------------------\n");
			System.out.print("Número: ");
			numero = teclado.nextInt();

			if (numero != 9999) {
				soma += numero;

				if (indice == 0) { // índice 0 = primeiro número digitado
					maior = numero;
				}
				else if (numero > maior) { // "numero" corresponde aos valores seguintes
					maior = numero;
				}
				indice++;
			}
		}

        teclado.close();

        float somaFloat = soma;
		media = somaFloat / indice;
		System.out.println("----------------------------------------");
		System.out.println("\nPrograma encerrado!");
		System.out.println("\n==========================================");
		System.out.println("\nAo todo, foram digitados " + indice + " valores.");
		System.out.println("\nA soma entre essses valores é " + soma);
		System.out.println("\nA média entre eles é " + deci.format(media));
		System.out.println("\nO maior valor digitado foi " + maior);
		System.out.println("\n==========================================");
		System.out.println("\n\n");
    }
}

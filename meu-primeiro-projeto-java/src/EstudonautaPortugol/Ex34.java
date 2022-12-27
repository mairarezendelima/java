package EstudonautaPortugol;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Ex34 {
    public static void main(String[] args) {
        int indice = 0, numero , indicePares = 0, indiceImpares = 0, somaPares = 0, somaImpares = 0;
		float mediaPares, mediaImpares, somaParesFloat, somaImparesFloat;
		
		Scanner teclado = new Scanner(System.in);
        DecimalFormat deci = new DecimalFormat("0.00");
        
        while (indice < 5) 
		{
			System.out.print("Digite um número inteiro: ");
			numero = teclado.nextInt();

			if (numero % 2 == 0) 
			{
				somaPares += numero;
				indicePares += 1;
			}
			else
			{
				somaImpares += numero;
				indiceImpares += 1;
			}
			indice += 1;
		}

        teclado.close();

        somaParesFloat = somaPares;
        somaImparesFloat = somaImpares;

		System.out.println("------------------------------------------------------------");
		mediaPares = somaParesFloat / indicePares; // O indice começa do 1
		mediaImpares = somaImparesFloat / indiceImpares;
		System.out.println("\nVocê digitou " + indicePares + " números pares. E a média entre eles é " + deci.format(mediaPares));
		System.out.println("\nVocê digitou " + indiceImpares + " números ímpares. E a média entre eles é " + deci.format(mediaImpares));
		System.out.println("\n\n");
    }
}

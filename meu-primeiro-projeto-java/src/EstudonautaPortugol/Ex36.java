package EstudonautaPortugol;

import java.util.Random;
import java.util.Scanner;

public class Ex36 {
    public static void main(String[] args) throws InterruptedException {
        int quant, indice = 1, numero, maiores5 = 0, divisiveis3 = 0;
		
		Scanner teclado = new Scanner(System.in);
        Random random = new Random();
        
        System.out.print("Quantos números vou sortear? ");
		quant = teclado.nextInt();

		System.out.println("---------------------------");
		System.out.println("Sorteando " + quant + " números:\n");
		while (indice <= quant)
		{
			numero = random.nextInt(10);
			System.out.print(numero + " ");

			if (numero > 5) {
				maiores5 += 1;
			}
			if (numero % 3 == 0) {
				divisiveis3 += 1;
			}
			Thread.sleep(500);
			indice += 1;
		}
		System.out.println("Dos " + quant + " números sorteados, temos " + maiores5 + " maiores que 5" + " e " + divisiveis3 + " divisíveis por 3");
		System.out.println("\n");
    }
}

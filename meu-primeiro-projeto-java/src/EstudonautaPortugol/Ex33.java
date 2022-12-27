package EstudonautaPortugol;

import java.util.Random;
import java.util.Scanner;

public class Ex33 {
    public static void main(String[] args) throws InterruptedException {
        int quant, indice = 0, soma = 0, numero;
		
		Scanner teclado = new Scanner(System.in);
        Random random = new Random();
        
        System.out.print("Quantos números você quer que eu sorteie? ");
		quant = teclado.nextInt();

        teclado.close();

		System.out.println("--------------------------------------------");
		
		System.out.print("\nSorteando os " + quant + " números: ");

		while (indice < quant) 
		{
            numero = random.nextInt(10);
            //double numero random.nextDouble() * 49; //Número aleatório de 0 a 49
			System.out.print(numero + " ");
			indice += 1;
			soma += numero;
			Thread.sleep(500);
		}
		System.out.println("\n--------------------------------------------");
		System.out.println("\nA soma entre todos esses valores é " + soma);
		System.out.println("\n\n");
    }
}

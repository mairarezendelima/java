package EstudonautaPortugol;

import java.util.Scanner;

public class Ex32 {
    public static void main(String[] args) {
        int indice = 1, valor, somaPares = 0, somaImpares = 0;

        Scanner teclado = new Scanner(System.in);

		while (indice <= 5)
		{
			System.out.print("Digite o " + indice + "º valor: ");
			valor = teclado.nextInt();

			if (valor % 2 == 0) 
			{
				somaPares += valor;
			}
			else
			{
				somaImpares += valor;
			}
			indice += 1;
		}

        teclado.close();

		System.out.println("---------------------------");
		System.out.println("\nA soma dos pares é " + somaPares);
		System.out.println("\nA soma dos ímpares é " + somaImpares);
		System.out.println("\n\n");
    }
}

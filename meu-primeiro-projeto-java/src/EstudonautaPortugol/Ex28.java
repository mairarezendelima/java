package EstudonautaPortugol;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Ex28 {
    public static void main(String[] args) {
        float preco;
		int opcao;
		
		Scanner teclado = new Scanner(System.in);
        DecimalFormat deci = new DecimalFormat("0.00");
        
        System.out.print("Digite o preço do produto: R$ ");
		preco = teclado.nextFloat();
		
		System.out.println("\n---------------------------------");
		System.out.println("\n     REAJUSTADOR DE PREÇOS     ");
		System.out.println("\n---------------------------------");
		System.out.println("\n1  Carnaval\t\t[+10%]");
		System.out.println("\n2  Férias escolares\t[+20%]");
		System.out.println("\n3  Dia das crianças\t[+5%]");
		System.out.println("\n4  Black Friday\t\t[-30%]");
		System.out.println("\n5  Natal\t\t[-5%]");
		System.out.println("\n---------------------------------");
		
        System.out.print("\nDigite a sua opção: ");
		opcao = teclado.nextInt();

        teclado.close();

		System.out.println("---------------------------------------------");
		
		switch(opcao)
		{
			case 1:
				System.out.println("\nNa época do carnaval, o preço do produto aumenta para R$ " + deci.format(preco * 1.10));
				break;
			case 2:
				System.out.println("\nNa época das férias escolares, o preço do produto aumenta para R$ " + deci.format(preco * 1.20));
				break;
			case 3:
				System.out.println("\nNo dia das crianças, o preço do produto aumenta para R$ " + deci.format(preco * 1.05));
				break;
			case 4:
				System.out.println("\nNa Black Friday, o preço do produto diminui para R$  " + deci.format(preco * 0.70));
				break;
			case 5:
				System.out.println("\nNo Natal, o preço do produto diminui para R$ " + deci.format(preco * 0.95));
				break;
			default:
				System.out.println("\nO preço do produto se mantém em R$ " + deci.format(preco));
				break;
		}
		System.out.println("\n----------------------------------------------");
		System.out.println("\n\n");
    }
}

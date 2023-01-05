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
		
		System.out.println("---------------------------------");
		System.out.println("     REAJUSTADOR DE PREÇOS     ");
		System.out.println("---------------------------------");
		System.out.println("1  Carnaval\t\t[+10%]");
		System.out.println("2  Férias escolares\t[+20%]");
		System.out.println("3  Dia das crianças\t[+5%]");
		System.out.println("4  Black Friday\t\t[-30%]");
		System.out.println("5  Natal\t\t[-5%]");
		System.out.println("---------------------------------");
		
        System.out.print("Digite a sua opção: ");
		opcao = teclado.nextInt();

		System.out.println("---------------------------------------------");

		switch (opcao) {
			case 1 ->
					System.out.println("Na época do carnaval, o preço do produto aumenta para R$ " + deci.format(preco * 1.10));
			case 2 ->
					System.out.println("Na época das férias escolares, o preço do produto aumenta para R$ " + deci.format(preco * 1.20));
			case 3 ->
					System.out.println("No dia das crianças, o preço do produto aumenta para R$ " + deci.format(preco * 1.05));
			case 4 ->
					System.out.println("Na Black Friday, o preço do produto diminui para R$  " + deci.format(preco * 0.70));
			case 5 -> System.out.println("No Natal, o preço do produto diminui para R$ " + deci.format(preco * 0.95));
			default -> System.out.println("O preço do produto se mantém em R$ " + deci.format(preco));
		}
		System.out.println("----------------------------------------------");
		System.out.println("\n");
    }
}

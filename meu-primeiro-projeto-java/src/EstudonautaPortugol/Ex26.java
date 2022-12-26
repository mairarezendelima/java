package EstudonautaPortugol;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Ex26 {
    public static void main(String[] args) {
        char opcao;
		int num1, num2;
		
	    System.out.println("        SUPER TABUADA         ");
		System.out.println("\n------------------------------");
		System.out.println("\n+\t\tAdição");
		System.out.println("\n-\t\tSubtração");
		System.out.println("\n*\t\tMultiplicação");
		System.out.println("\n/\t\tDivisão");
		System.out.println("\n------------------------------");
		
        Scanner teclado = new Scanner(System.in);
        DecimalFormat deci = new DecimalFormat("0.00");
        
        System.out.print("\nDigite a sua opção: ");
		opcao = teclado.next(".").charAt(0); // digitar 1, 2, 3 ou 4, que estão em formato de caracteres

		System.out.println("\n------------------------------");
		
		switch(opcao)
		{
			case '1':
				opcao = '+';
				break;
			case '2':
				opcao = '-';
				break;
			case '3':
				opcao = '*';
				break;
			case '4':
				opcao = '/';
				break;
			default:
				opcao = '+';
				break;
		}
		System.out.println("\nVocê escolheu a opção " + opcao);

		System.out.print("\nDigite o primeiro número: ");
		num1 = teclado.nextInt();
		System.out.print("Digite o segundo número: ");
		num2 = teclado.nextInt();

        float num1Float = num1;
        float num2Float = num2;
        teclado.close();

		System.out.println("\nRealizando a operação " + num1 + " " + opcao + " " + num2);
		System.out.println("\n\n--------- PROCESSANDO ---------");
		System.out.print("\nO resultado da ");
		
		switch(opcao)
		{ 
			case '+':
			    System.out.print("adição é " + (num1 + num2));
				break;
		    case '-':
				System.out.print("subtração é " + (num1 - num2));
				break;
		    case '*':
				System.out.print("multiplicação é " + (num1 * num2));
                break;
		    case '/':
		     	System.out.print("divisão é " + deci.format(num1Float / num2Float));
                break;
		    default:
		     	System.out.println("Erro! Sua operação não foi realizada");
				break;
		}
		System.out.println("\n-------------------------------");
		System.out.println("\n\n");
    }
}
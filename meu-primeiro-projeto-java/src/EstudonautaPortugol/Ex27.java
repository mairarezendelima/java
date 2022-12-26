package EstudonautaPortugol;
import java.text.DecimalFormat;
import java.util.Scanner;

public class Ex27 {
    public static void main(String[] args) {
        float peso;
		int opcao;
		
        Scanner teclado = new Scanner(System.in);
        DecimalFormat deci = new DecimalFormat("0.00");
        
        System.out.println("Qual é o seu peso na Terra (Kg)? ");
		peso = teclado.nextFloat();

		System.out.println("\n===== Escolha um planeta =====");
		System.out.println("\n1\tMercúrio");
		System.out.println("\n2\tVênus");
		System.out.println("\n3\tMarte");
		System.out.println("\n4\tJúpiter");
		System.out.println("\n5\tSaturno");
		System.out.println("\n6\tUrano");
		System.out.println("\n7\tNetuno");
		
		System.out.println("\n---------------------------------------------------");
		System.out.println("\nDigite sua opção --> ");
		opcao = teclado.nextInt();

        teclado.close();

		System.out.println("----------------------------------------------------");

		switch(opcao)
		{
			case 1:
				System.out.println("\nNo planeta Mercúrio, seu peso seria de " + deci.format(peso * 0.37) + " Kg");
				break;
			case 2:
				System.out.println("\nNo planeta Vênus, seu peso seria de " + deci.format(peso * 0.88) + " Kg");
				break;
			case 3:
				System.out.println("\nNo planeta Marte, seu peso seria de " + deci.format(peso * 0.38) + " Kg");
				break;
			case 4:
				System.out.println("\nNo planeta Júpiter, seu peso seria de " + deci.format(peso * 2.64) + " Kg");
				break;
			case 5:
				System.out.println("\nNo planeta Saturno, seu peso seria de " + deci.format(peso * 1.15) + " Kg");
				break;
			case 6:
				System.out.println("\nNo planeta Urano, seu peso seria de " + deci.format(peso * 1.17) + " Kg");
				break;
			case 7:
				System.out.println("\nNo planeta Netuno, seu peso seria de " + deci.format(peso * 1.18) + " Kg");
				break;
			default:
				System.out.println("\nErro! Tente novamente!");
				break;
		}
		System.out.println("\n\n");
    }
}

package EstudonautaPortugol;
import java.text.DecimalFormat;
import java.util.Scanner;

public class Ex27 {
    public static void main(String[] args) {
        float peso;
		int opcao;
		
        Scanner teclado = new Scanner(System.in);
        DecimalFormat deci = new DecimalFormat("0.00");
        
        System.out.print("Qual é o seu peso na Terra (Kg)? ");
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
		System.out.print("\nDigite sua opção --> ");
		opcao = teclado.nextInt();

        teclado.close();

		System.out.println("----------------------------------------------------");

		if (opcao == 1) {
			System.out.println("\nNo planeta Mercúrio, seu peso seria de " + deci.format(peso * 0.37) + " Kg");
		} else if (opcao == 2) {
			System.out.println("\nNo planeta Vênus, seu peso seria de " + deci.format(peso * 0.88) + " Kg");
		} else if (opcao == 3) {
			System.out.println("\nNo planeta Marte, seu peso seria de " + deci.format(peso * 0.38) + " Kg");
		} else if (opcao == 4) {
			System.out.println("\nNo planeta Júpiter, seu peso seria de " + deci.format(peso * 2.64) + " Kg");
		} else if (opcao == 5) {
			System.out.println("\nNo planeta Saturno, seu peso seria de " + deci.format(peso * 1.15) + " Kg");
		} else if (opcao == 6) {
			System.out.println("\nNo planeta Urano, seu peso seria de " + deci.format(peso * 1.17) + " Kg");
		} else if (opcao == 7) {
			System.out.println("\nNo planeta Netuno, seu peso seria de " + deci.format(peso * 1.18) + " Kg");
		} else {
			System.out.println("\nErro! Tente novamente!");
		}
		System.out.println("\n\n");
    }
}

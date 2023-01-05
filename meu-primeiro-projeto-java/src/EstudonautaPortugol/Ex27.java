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
		System.out.println("1\tMercúrio");
		System.out.println("2\tVênus");
		System.out.println("3\tMarte");
		System.out.println("4\tJúpiter");
		System.out.println("5\tSaturno");
		System.out.println("6\tUrano");
		System.out.println("7\tNetuno");
		
		System.out.println("---------------------------------------------------");
		System.out.print("Digite sua opção --> ");
		opcao = teclado.nextInt();

		System.out.println("----------------------------------------------------");

		if (opcao == 1) {
			System.out.println("No planeta Mercúrio, seu peso seria de " + deci.format(peso * 0.37) + " Kg");
		} else if (opcao == 2) {
			System.out.println("No planeta Vênus, seu peso seria de " + deci.format(peso * 0.88) + " Kg");
		} else if (opcao == 3) {
			System.out.println("No planeta Marte, seu peso seria de " + deci.format(peso * 0.38) + " Kg");
		} else if (opcao == 4) {
			System.out.println("No planeta Júpiter, seu peso seria de " + deci.format(peso * 2.64) + " Kg");
		} else if (opcao == 5) {
			System.out.println("No planeta Saturno, seu peso seria de " + deci.format(peso * 1.15) + " Kg");
		} else if (opcao == 6) {
			System.out.println("No planeta Urano, seu peso seria de " + deci.format(peso * 1.17) + " Kg");
		} else if (opcao == 7) {
			System.out.println("No planeta Netuno, seu peso seria de " + deci.format(peso * 1.18) + " Kg");
		} else {
			System.out.println("Erro! Tente novamente!");
		}
		System.out.println("\n");
    }
}

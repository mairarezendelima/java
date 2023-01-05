package EstudonautaPortugol;

import java.util.Scanner;

public class Ex40 {
    public static void main(String[] args) throws InterruptedException {
        int n1, n2, opcao = 0;
		
        Scanner teclado = new Scanner(System.in);
        
        System.out.print("Operando 1: ");
        n1 = teclado.nextInt();
        System.out.print("Operando 2: ");
        n2 = teclado.nextInt();

        while(opcao != 5) {
            System.out.println("===== Escolha uma operação =====");
            System.out.println("[1]\tAdição");
            System.out.println("[2]\tSubtração");
            System.out.println("[3]\tMultiplicação");
            System.out.println("[4]\tEntrar com novos dados");
            System.out.println("[5]\tSair");

            System.out.print(">>>>>> Sua opção: ");
            opcao = teclado.nextInt();

            if (opcao == 1) {
                System.out.println("---------------------------------");
                System.out.println("Calculando " + n1 + " + " + n2 + " = " + (n1 + n2));
                System.out.println("---------------------------------");
            } else if (opcao == 2) {
                System.out.println("---------------------------------");
                System.out.println("Calculando " + n1 + " - " + n2 + " = " + (n1 - n2));
                System.out.println("---------------------------------");
            } else if (opcao == 3) {
                System.out.println("---------------------------------");
                System.out.println("Calculando " + n1 + " * " + n2 + " = " + (n1 * n2));
                System.out.println("---------------------------------");
            } else if (opcao == 4) {
                System.out.print("Operando 1: ");
                n1 = teclado.nextInt();
                System.out.print("Operando 2: ");
                n2 = teclado.nextInt();
            } else if (opcao == 5) {
                System.out.println("======== Saindo ========");
                System.out.println("===== Volte sempre =====");
            } else {
                System.out.println("===== Opção inválida! =====");
            }
            Thread.sleep(500);
        }
        System.out.println("\n");
    }
}

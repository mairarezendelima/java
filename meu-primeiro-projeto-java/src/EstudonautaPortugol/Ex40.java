package EstudonautaPortugol;

import java.util.Scanner;

public class Ex40 {
    public static void main(String[] args) throws InterruptedException {
        int n1 = 0, n2 = 0, opcao = 0;
		
        Scanner teclado = new Scanner(System.in);
        
        System.out.print("Operando 1: ");
        n1 = teclado.nextInt();
        System.out.print("Operando 2: ");
        n2 = teclado.nextInt();

        while(opcao != 5) {
            System.out.println("\n\n===== Escolha uma operação =====");
            System.out.println("\n[1]\tAdição");
            System.out.println("\n[2]\tSubtração");
            System.out.println("\n[3]\tMultiplicação");
            System.out.println("\n[4]\tEntrar com novos dados");
            System.out.println("\n[5]\tSair");

            System.out.print("\n>>>>>> Sua opção: ");
            opcao = teclado.nextInt();
            
            switch(opcao) {
                case 1:
                    System.out.println("---------------------------------");
                    System.out.println("\nCalculando " + n1 + " + " + n2 + " = " + (n1 + n2));
                    System.out.println("\n---------------------------------");
                    break;
                case 2:
                    System.out.println("---------------------------------");
                    System.out.println("\nCalculando " + n1 + " - " + n2 + " = " + (n1 - n2));
                    System.out.println("\n---------------------------------");
                    break;
                case 3:
                    System.out.println("---------------------------------");
                    System.out.println("\nCalculando " + n1 + " * " + n2 + " = " + (n1 * n2));
                    System.out.println("\n---------------------------------");
                    break;
                case 4:
                    System.out.print("\nOperando 1: ");
                    n1 = teclado.nextInt();
                    System.out.print("Operando 2: ");
                    n2 = teclado.nextInt();
                    break;
                case 5:
                    System.out.println("\n======== Saindo ========");
                    System.out.println("\n===== Volte sempre =====");
                    break;
                default:
                    System.out.println("\n===== Opção inválida! =====\n");
                    break;
            }
            Thread.sleep(500);
        }
        teclado.close();
        System.out.println("\n\n");
    }
}

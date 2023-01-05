package EstudonautaPortugol;

import java.util.Scanner;

public class Ex49 {
    public static void main(String[] args) throws InterruptedException {
        int indice, n1 = 0, n2 = 1, n3, quant;

        Scanner teclado = new Scanner(System.in);

        System.out.println("===== Sequência de Fibonacci =====");
        System.out.print("Quantos elementos você quer exibir? ");
        quant = teclado.nextInt();

        // n1 e n2 já são conhecidos
        System.out.print(n1 + " ");
        Thread.sleep(500);
        System.out.print(n2 + " ");
        Thread.sleep(500);

        for (indice = 2; indice < quant; indice++) {
            n3 = n1 + n2;
            System.out.print(n3 + " ");
            Thread.sleep(500);
            n1 = n2;
            n2 = n3;
        }
        System.out.println("Acabou!");
        System.out.println("\n");
    }
}

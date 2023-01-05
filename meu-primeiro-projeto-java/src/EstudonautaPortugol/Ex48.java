package EstudonautaPortugol;

import java.util.Scanner;

public class Ex48 {
    public static void main(String[] args) throws InterruptedException {
        int numero, indice, quantDivisivel = 0;

        Scanner teclado = new Scanner(System.in);

        System.out.print("Digite um número: ");
        numero = teclado.nextInt();

        for (indice = 1; indice <= numero; indice++) {
            if (numero % indice == 0) {
                System.out.print("[" + indice + "] ");
                quantDivisivel++;
            }
            else {
                System.out.print(indice + " ");
            }
            Thread.sleep(500);
        }
        System.out.println("O número " + numero + " foi divisível " + quantDivisivel + " vezes");
        if (quantDivisivel < 3) {
            System.out.println("Logo, o número " + numero + " É primo!");
        }
        else {
            System.out.println("Logo, o número " + numero + " NÃO é primo!");
        }
        System.out.println("\n");
    }
}

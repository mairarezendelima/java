package EstudonautaPortugol;

import java.util.Scanner;

public class Ex50 {
    public static void main(String[] args) throws InterruptedException {
        int ini, fim, indice1, indice2; // ini < fim

        Scanner teclado = new Scanner(System.in);

        System.out.println("-------------------------");
        System.out.println("      MULTI TABUADA     ");
        System.out.println("-------------------------");

        System.out.print("Tabuada inicial = ");
        ini = teclado.nextInt();
        System.out.print("Tabuada final = ");
        fim = teclado.nextInt();

        for (indice1 = ini; indice1 <= fim; indice1++) {
            Thread.sleep(500);
            System.out.println("-------------------------");
            System.out.println("      TABUADA DE " + indice1 + "    ");
            System.out.println("-------------------------");
            Thread.sleep(500);
            for (indice2 = 1; indice2 <= 10; indice2++) {
                System.out.println(indice1 + " x " + indice2 + " = " + indice1 * indice2);
                Thread.sleep(500);
            }
        }
        System.out.println("-------------------------");
        System.out.println("     FIM DO PROGRAMA     ");
        System.out.println("-------------------------");
    }
}

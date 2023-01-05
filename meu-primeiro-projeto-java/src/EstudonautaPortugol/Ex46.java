package EstudonautaPortugol;

import java.util.Scanner;

public class Ex46 {
    public static void main(String[] args) throws InterruptedException {
        int numero, indice;

        Scanner teclado = new Scanner(System.in);

        System.out.print("Tabuada do número: ");
        numero = teclado.nextInt();

        for (indice = 1; indice <= 10; indice++) {
            System.out.println(numero + " x " + indice + " = " + numero * indice);
            Thread.sleep(500);
        }
        System.out.println("\n");
    }
}

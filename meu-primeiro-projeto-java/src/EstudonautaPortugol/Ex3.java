package EstudonautaPortugol;

import java.util.Scanner;

public class Ex3 {

    public static void main(String[] args) {
        int n;
        
        Scanner teclado = new Scanner(System.in);

        System.out.print("Me diga um número: ");
        n = Integer.parseInt(teclado.nextLine());

        System.out.println("O antecessor de " + n + " é " + (n-1));
        System.out.println("O sucessor de " + n + " é " + (n+1));
        System.out.println("\n");
    }
}

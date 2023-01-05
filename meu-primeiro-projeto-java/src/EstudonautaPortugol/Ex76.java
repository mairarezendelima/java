package EstudonautaPortugol;

import java.util.Scanner;

public class Ex76 {
    static int somador(int v1, int v2) {
        int res;
        res = v1 + v2;
        return res;
    }

    public static void main(String[] args) throws InterruptedException {

        Scanner teclado = new Scanner(System.in);

        int n1;
        int n2;
        int s;

        System.out.print("Primeiro valor: ");
        n1 = teclado.nextInt();

        System.out.print("Segundo valor: ");
        n2 = teclado.nextInt();

        s = somador(n1, n2);
        System.out.print("A soma dos dois valores é " + s);
    }
}

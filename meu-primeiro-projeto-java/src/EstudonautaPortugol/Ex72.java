package EstudonautaPortugol;

import java.util.Scanner;

public class Ex72 {
    static void tabuada(int n) throws InterruptedException {
        int res;
        System.out.print("\n--------- TABUADA DE " + n + " -----------\n");

        for (int cont = 1; cont <= 10; cont++) {
            res = n * cont;
            System.out.print(n + " x " + cont + " = " + res + "\n");
            Thread.sleep(200);
        }
        System.out.print("-------------------------------");
    }

    public static void main(String[] args) throws InterruptedException {
        int num;

        Scanner teclado = new Scanner(System.in);

        System.out.print("Quer ver a tabuada de qual número? ");
        num = teclado.nextInt();

        tabuada(num);
    }
}

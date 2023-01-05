package EstudonautaPortugol;

import java.util.Scanner;

public class Ex79 {
    static String fibonacci(int qtd) {
        StringBuilder fib = new StringBuilder("0 -> 1 -> ");
        int p1, p2, p3;
        p1 = 0;
        p2 = 1;
        for (int cont = 3; cont <= qtd; cont ++) {
            p3 = p1 + p2;
            fib.append(p3);
            fib.append(" -> ");
            p1 = p2;
            p2 = p3;
        }
        return fib + "FIM";
    }

    public static void main(String[] args) throws InterruptedException {
        int tot;

        Scanner teclado = new Scanner(System.in);

        System.out.print("Digite o número de termos: ");
        tot = teclado.nextInt();
        System.out.print("Sequência de Fibonacci: " + fibonacci(tot));
    }
}

package EstudonautaPortugol;

import java.util.Scanner;

public class Ex77 {
    static boolean primo(int n) {
        boolean eprimo = true;

        for (int c = 2; c < n; c++) {
            if (n % c == 0) { // 11/2, 11/3, 11/4, 11/5, 11/6, 11/7, 11/8, 11/9, 11/10 não dão resto zero
                eprimo = false;
                break;
            }
        }
        return eprimo;
    }

    public static void main(String[] args) {
        int num;

        Scanner teclado = new Scanner(System.in);

        System.out.print("Digite um número para saber se ele é primo: ");
        num = teclado.nextInt();

        if (primo(num)) {
            System.out.print("O número " + num + " é primo!");
        } else {
            System.out.print("O número " + num + " não é primo!");
        }
    }
}

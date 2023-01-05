package EstudonautaPortugol;

import java.util.Random;
import java.util.Scanner;

public class BuscaSequencialVetor {
    public static void main(String[] args) {
        int[]num = new int[8];

        Scanner teclado = new Scanner(System.in);
        Random random = new Random();

        for (int p = 0; p < num.length; p++) {
            num[p] = random.nextInt(1, 30);
        }
        boolean achei = false;
        int chave;

        System.out.print("Qual é a chave? ");
        chave = teclado.nextInt();

        for (int p = 0; p < num.length; p++) {
            if (num[p] == chave) {
                System.out.print("\nEncontrei a chave na posição " + p);
                achei = true;
            }
        }
        if (!achei) {
            System.out.print("Infelizmente, a chave " + chave + " não se encontra no vetor");
        }
        System.out.print("\n\n");
    }
}

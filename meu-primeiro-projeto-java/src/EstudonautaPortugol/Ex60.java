package EstudonautaPortugol;

import java.util.Random;

public class Ex60 {
    public static void main(String[] args) throws InterruptedException {
        int[] vetor = new int[10];
        int maior = 0, totimp = 0, passo, totmaior = 0, somapar = 0;

        Random random = new Random();

        System.out.println("Sorteando 10 valores...\n");
        for (passo = 0; passo < vetor.length; passo++) {
            vetor[passo] = random.nextInt(10);
        }

        for (passo = 0; passo < vetor.length; passo++) {
            System.out.print(vetor[passo] + " ");
            Thread.sleep(300);
            if (passo == 0) {
                maior = vetor[0];
            }
            else if (vetor[passo] > maior) {
                maior = vetor[passo];
            }
        }
        System.out.println("....PRONTO!");
        System.out.println("-----------------------------------");
        System.out.println("Analisando os valores sorteados...");
        System.out.println("-----------------------------------");
        Thread.sleep(700);
        System.out.println("O maior valor sorteado foi " + maior);

        System.out.print("O maior valor ocorreu nas posições: ");
        for (passo = 0; passo < vetor.length; passo++) {
            if (vetor[passo] == maior) {
                System.out.print(passo + " ");
                totmaior++;
                Thread.sleep(400);
            }
        }
        System.out.println("\nO maior valor apareceu " + totmaior + " vezes");
        System.out.println("-----------------------------------");

        System.out.print("Valores pares nas posições: ");
        for (passo = 0; passo < vetor.length; passo++) {
            if (vetor[passo] % 2 == 0) {
                System.out.print(passo + " ");
                somapar += vetor[passo];
            }
        }
        System.out.println("\nA soma dos pares é " + somapar);
        System.out.println("-----------------------------------");
        Thread.sleep(500);

        System.out.print("Valores ímpares nas posições: ");
        for (passo = 0; passo < vetor.length; passo++) {
            if (vetor[passo] % 2 == 1) {
                System.out.print(passo + " ");
                totimp++;
            }
        }
        System.out.println("\nTemos " + totimp + " valores ímpares ao todo");
        System.out.println("-----------------------------------");
        System.out.println("\n");
    }
}

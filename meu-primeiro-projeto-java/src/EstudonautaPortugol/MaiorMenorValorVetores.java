package EstudonautaPortugol;

import java.util.Random;

public class MaiorMenorValorVetores {
    public static void main(String[] args) throws InterruptedException {
        int[] vet = new int[10];

        Random random = new Random();

        // Gera números for  o vetor
        for (int p = 0; p < vet.length;p++) {
            vet[p] = random.nextInt(1,5);
        }
        // Mostra o vetor na tela
        System.out.print("O vetor gerado foi: ");
        for (int p = 0; p < vet.length; p++) {
            System.out.print(vet[p] + " -> ");
            Thread.sleep(400);
        }
        System.out.print("FIM\n");

        // Descobrindo o maior valor
        int maior = 0;
        int menor = 0;

        for (int p = 0; p < vet.length; p++) {
            if (p == 0) {
                maior = vet[0];
                menor = vet[0];
            }
            else {
                if (vet[p] > maior) {
                    maior = vet[p];
                }
                else if (vet[p] < menor) {
                    menor = vet[p];
                }
            }
        }
        // Análise do maior
        Thread.sleep(400);
        System.out.print("O maior valor gerado foi " + maior);

        for (int p = 0; p < vet.length; p++) {
            if (vet[p] == maior) {
                System.out.print("\n\tEncontrei o maior valor na posição " + p);
                Thread.sleep(400);
            }
        }
        // Análise do menor
        System.out.print("\nO menor valor gerado foi " + menor);

        for  (int p = 0; p < vet.length; p++) {
            if (vet[p] == menor) {
                System.out.print("\n\tEncontrei o menor valor na posição " + p);
                Thread.sleep(400);
            }
        }
        System.out.print("\n\n");
    }
}

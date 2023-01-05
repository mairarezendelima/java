package EstudonautaPortugol;

import java.util.Random;
import java.util.Scanner;

public class ContagemVetores {
    public static void main(String[] args) throws InterruptedException {

        Scanner teclado = new Scanner(System.in);
        Random random = new Random();

        // Preenchimento do vetor
        int[] vet = new int[9];
        for (int p = 0; p < vet.length; p++) {
            vet[p] = random.nextInt(1, 10);
        }
        System.out.print("Os valores sorteados são: ");

        // Exibição do vetor
        for (int p = 0; p < vet.length; p++) {
            System.out.print(vet[p] + " -> ");
            Thread.sleep(500);
        }
        System.out.print("FIM\n");

        // Busca pela chave
        int chave, tot = 0;
        System.out.print("Está procurando por qual valor? ");
        chave = teclado.nextInt();
        System.out.print("Procurando por valores maiores ou iguais a " + chave + "...\n");
        Thread.sleep(500);

        for (int p = 0; p < vet.length; p++) {
            if (vet[p] >= chave) {
                System.out.print("Achado valor " + vet[p] + " na posição " + p + "\n");
                Thread.sleep(500);
                tot++;
            }
        }
        // Resultado final
        if (tot == 0) {
            System.out.print("Valores acima de " + chave + " não foram encontrados dentro do vetor\n");
        }
        else {
            System.out.print("Valores acima de " + chave + " foram encontrados " + tot + " vezes dentro do vetor\n");
        }
    }
}

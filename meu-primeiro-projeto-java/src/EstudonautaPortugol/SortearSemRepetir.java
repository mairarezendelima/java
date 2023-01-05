package EstudonautaPortugol;

import java.util.Random;

public class SortearSemRepetir {
    public static void main(String[] args) throws InterruptedException {
        int[] vet = new int[10];

        Random random = new Random();

        // Sorteia sem repetições
        int p = 0;
        boolean encontrado;

        while (p < vet.length) {
            vet[p] = random.nextInt(1, 20);
            encontrado = false;

            for (int aux = 0; aux < p; aux++) { // busca sequencial por valores repetidos
                if (vet[aux] == vet[p]) { // valor é repetido
                    encontrado = true;
                    break;
                }
            }
            if (!encontrado) {
                p++;
            }
        }

        // Mostrar o vetor
        for (int i = 0; i < vet.length; i++) {
            System.out.print(vet[i] + " ");
            Thread.sleep(200);
        }
        System.out.print("FIM!");
    }
}


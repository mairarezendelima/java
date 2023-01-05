package EstudonautaPortugol;

import java.util.Random;

public class OrdenandoVetor {
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
        // Ordenando o vetor (bubble sort)
        int aux;
        for (int princ = 0; princ < vet.length - 1; princ++) {
            for (int sec = princ + 1; sec < vet.length; sec++) {
                if (vet[princ] > vet[sec]) { // ordem crescente; para ordem decrescente, é só inverter o sinal de > para <
                    aux = vet[princ]; // isso é o swap
                    vet[princ] = vet[sec];
                    vet[sec] = aux;
                }
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

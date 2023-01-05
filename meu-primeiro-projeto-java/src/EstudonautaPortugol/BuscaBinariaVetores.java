package EstudonautaPortugol;

import java.util.Random;
import java.util.Scanner;

public class BuscaBinariaVetores {
    public static void main(String[] args) throws InterruptedException {
        int[] vet = new int[10];

        Scanner teclado = new Scanner(System.in);
        Random random = new Random();

        // Sorteia sem repetições
        int p = 0;
        boolean encontrado1, encontrado2;
        while(p < vet.length) {
            vet[p] = random.nextInt(1, 20);
            encontrado1 = false;
            for (int aux = 0; aux < p; aux++) {
                if (vet[aux] == vet[p]) {
                    encontrado1 = true;
                    break;
                }
            }
            if (!encontrado1) {
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
        // Busca binária
        int chave;
        System.out.print("\nQuer achar qual valor? ");
        chave = teclado.nextInt();
        encontrado2 = false;
        int ini = 0, fim = vet.length - 1, meio = 0;
        while (ini < fim) {
            meio = (ini + fim) / 2;
            if (vet[meio] == chave) {
                encontrado2 = true;
                break;
            } else {
                if (chave > vet[meio]) {
                    ini = meio + 1;
                } else {
                    fim = meio - 1;
                }
            }
        }
        if (encontrado2) {
            System.out.print("O valor " + chave + " foi encontrado na posição " + meio + " do vetor.");
        } else {
            System.out.print("Infelizmente, o valor " + chave + " não se encontra no vetor.");
        }
        System.out.print("\nFIM!");
    }
}

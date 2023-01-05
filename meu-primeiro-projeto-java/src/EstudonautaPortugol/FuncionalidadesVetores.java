package EstudonautaPortugol;

import java.util.Random;
import java.util.Scanner;

public class FuncionalidadesVetores {
    public static void main(String[] args) throws InterruptedException {

        Scanner teclado = new Scanner(System.in);
        Random random = new Random();

        //Gerar o vetor
        int pos = 0;
        int[] vet = new int[10];
        boolean encontrado1, encontrado2;

        while (pos < vet.length) {
            vet[pos] = random.nextInt(1, 30);
            encontrado1 = false;
            for  (int aux = 0; aux < pos; aux++) {
                if (vet[aux] == vet[pos]) {
                    encontrado1 = true;
                    break;
                }
            }
            if (!encontrado1) {
                pos++;
            }
        }

        //Ordena o vetor (bubble sort)
        int aux;
        for (int p = 0; p < vet.length - 1; p++) {
            for (int s = p + 1; s < vet.length; s++) {
                if (vet[p] > vet[s]) {
                    aux = vet[p]; //Isso é o swap
                    vet[p] = vet[s];
                    vet[s] = aux;
                }
            }
        }
        //Mostrar o vetor na tela
        for (int i = 0; i < vet.length; i++) {
            System.out.print(vet[i] + " ");
            Thread.sleep(400);
        }

        //Busca binária
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
            }
            else {
                if (chave > vet[meio]) {
                    ini = meio + 1;
                }
                else {
                    fim = meio - 1;
                }
            }
        }
        if (encontrado2) {
            System.out.print("O valor " + chave + " foi encontrado na posição " + meio + " do vetor");
        }
        else {
            System.out.print("Infelizmente, o valor " + chave + " não se encontra dentro do vetor");
        }
        System.out.print("\n\n");
    }
}


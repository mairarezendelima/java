package EstudonautaPortugol;

import java.util.Scanner;

public class Ex56 {
    public static void main(String[] args) throws InterruptedException {
        int numero, pos;
        int [] vetor = new int[10];

        Scanner teclado = new Scanner(System.in);

        System.out.print("Digite um número: ");
        numero = teclado.nextInt();

        vetor[0] = numero; // Valor inicial é o digitado

        // Preenche o vetor
        for (pos = 1; pos < vetor.length; pos++) {
            vetor[pos] = vetor[pos - 1] + 5;
        }
        // Mostra o vetor na tela
        System.out.print("O vetor foi gerado com os valores: \n");
        for (pos = 0; pos < vetor.length; pos++) {
            System.out.print(pos + ": {" + vetor[pos] + "}  ");
            Thread.sleep(500);
        }
        System.out.println("FIM!\n");
    }
}

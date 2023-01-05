package EstudonautaPortugol;

import java.text.DecimalFormat;
import java.util.Random;

public class TotaisVetores {
    public static void main(String[] args) throws InterruptedException {
        int[] vet = new int[9];

        Random random = new Random();
        DecimalFormat deci = new DecimalFormat("0.00");

        // Geração de números for o vetor
        for (int p = 0; p < vet.length; p++) {
            vet[p] = random.nextInt(1, 10);
        }
        // Mostra o vetor na tela
        System.out.print("O vetor gerado foi: ");
        for (int p = 0; p < vet.length; p++) {
            System.out.print(vet[p] + " -> ");
            Thread.sleep(400);
        }
        System.out.print("FIM\n");
        float soma = 0;

        // Resultados
        for (int p = 0; p < vet.length; p++) {
            soma += vet[p];
        }
        float media = soma / vet.length;
        System.out.print("A soma de todos os valores acima é " + soma);
        System.out.print("\nA média geral é " + deci.format(media));
        System.out.print("\nOs valores acima de média são: ");

        for (int p = 0; p < vet.length; p++) {
            if (vet[p] >= media) {
                System.out.print("\n     " + p + " = {" + vet[p] + "}");
                Thread.sleep(400);
            }
        }
        System.out.print("\n\n");
    }
}

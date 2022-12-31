package EstudonautaPortugol;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Ex63 {
    public static void main(String[] args) throws InterruptedException {
        int passo, maior = 0;
        int[] idade = new int[6];
        String[] nome = new String[6];
        float media, soma = 0.0f;

        Scanner teclado = new Scanner(System.in);
        DecimalFormat deci = new DecimalFormat("0.00");

        for (passo = 0; passo < nome.length; passo++) {
            do {
                System.out.print("Nome da pessoa [" + passo + "]: ");
                nome[passo] = teclado.next();
            } while (nome[passo].equals(""));
            do {
                System.out.print("Idade de " + nome[passo] + ": ");
                idade[passo] = teclado.nextInt();
                soma += idade[passo];
                if (passo == 0) {
                    maior = idade[passo];
                }
                else if (idade[passo] > maior) {
                    maior = idade[passo];
                }
            } while (idade[passo] < 0 && idade[passo] > 130);
            System.out.print("------------------------------------------\n");
        }
        media = soma / idade.length;
        System.out.print("===== ANALISANDO AS PESSOAS CADASTRADAS =====\n\n");
        Thread.sleep(500);
        System.out.print("Média de idade: " + deci.format(media) + " anos\n");
        Thread.sleep(500);
        System.out.print("Pessoas acima da média: \n");
        for (passo = 0; passo < nome.length; passo++) {
            if (idade[passo] >= media) {
                System.out.print("-> " + nome[passo] + "(" + idade[passo] + " anos)\n");
                Thread.sleep(500);
            }
        }
        Thread.sleep(500);
        System.out.print("------------------------------------------\n");
        System.out.print("Maior idade do grupo: " + maior + " anos");
        Thread.sleep(500);
        System.out.print("\nQuem tem a maior idade: \n");
        for (passo = 0; passo < nome.length; passo++) {
            if (idade[passo] == maior) {
                System.out.print("-> " + nome[passo] + " \n");
                Thread.sleep(500);
            }
        }
    }
}

package EstudonautaPortugol;

import java.text.DecimalFormat;
import java.util.Random;

public class Ex67 {
    public static void main(String[] args) throws InterruptedException {
        int[][] matriz = new int[5][5];
        int l, c, totc = 0, totl = 0, num, soma = 0;
        float media = 0.0f;
        float numFloat, somaFloat;

        Random random = new Random();
        DecimalFormat deci = new DecimalFormat("0.00");

        for (l = 0; l < matriz.length; l++) {
            for (c = 0; c < matriz[0].length; c++) {
                matriz[l][c] = random.nextInt(10);
            }
        }
        for (l = 0; l < matriz.length; l++) {
            for (c = 0; c < matriz[0].length; c++) {
                System.out.print(matriz[l][c] + "\t");
                soma += matriz[l][c];
            }
            System.out.print("\n");
            Thread.sleep(300);
        }
        System.out.print("-----------------------------------------------");

        for (l = 0; l < matriz.length; l++) {
            for (c = 0; c < matriz[0].length; c++) {
                num = matriz.length * matriz[0].length;
                somaFloat = soma;
                numFloat = num;
                media = somaFloat / numFloat;
            }
        }
        System.out.print("\nA média dos valores é " + deci.format(media));
        System.out.print("\n-----------------------------------------------");
        Thread.sleep(300);

        System.out.print("\nNa segunda linha, os valores acima da média são: \n");
        for (c = 0; c < matriz[0].length; c++) {
            if (matriz[1][c] >= media) {
                System.out.print("[" + 1 + "]" + "[" + c + "] = " + matriz[1][c] + "\n");
                totl++;
            }
        }
        System.out.print("Total = " + totl + " ocorrências");
        System.out.print("\n-----------------------------------------------");
        Thread.sleep(300);

        System.out.print("\nNa terceira coluna, os valores abaixo da média são: \n");
        for (l = 0; l < matriz.length; l++) {
            if (matriz[l][2] < media) {
                System.out.print("[" + l + "]" + "[" + 2 + "] = " + matriz[l][2] + "\n");
                totc++;
            }
        }
        System.out.print("Total = " + totc + " ocorrências");
        System.out.print("\n-----------------------------------------------");
        System.out.print("\n\n");
    }
}

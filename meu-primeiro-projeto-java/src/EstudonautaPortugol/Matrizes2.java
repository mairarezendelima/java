package EstudonautaPortugol;

import java.util.Random;

public class Matrizes2 {
    public static void main(String[] args) throws InterruptedException {
        int[][] valor = new int[4][4];

        Random random = new Random();

        // Gerar a matriz
        for (int l = 0; l < valor.length; l++) {
            for (int c = 0; c < valor[0].length; c++) {
                //System.out.print("Digite um valor da posição ["+l+"]["+c+"]: ")
                valor[l][c] = random.nextInt(1, 10);
            }
        }
        // Mostrar a segunda linha
        int s2l = 0;
        System.out.print("\nOs itens da segunda linha são:   ");
        for (int c = 0; c < valor[0].length; c++) {
            System.out.print(valor[1][c] + "\t");
            s2l += valor [1][c];
        }
        System.out.print("TOTAL = " + s2l);

        // Mostrar a terceira coluna
        int s3c = 0;
        System.out.print("\nOs itens da terceira coluna são: ");
        for (int l = 0; l < valor.length; l++) {
            System.out.print(valor[l][2] + "\t");
            s3c += valor [l][2];
        }
        System.out.print("TOTAL = " + s3c);
        System.out.println("\n");

        // Mostrar a matriz
        for (int l = 0; l < valor.length; l++) {
            for (int c = 0; c < valor[0].length; c++) {
                System.out.print(valor[l][c] + "\t");
                Thread.sleep(200);
            }
            System.out.print("\n");
        }
        System.out.print("\nFIM!");
    }
}

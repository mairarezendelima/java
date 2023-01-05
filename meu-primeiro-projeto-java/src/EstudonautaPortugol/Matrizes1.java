package EstudonautaPortugol;

import java.util.Random;

public class Matrizes1 {
    public static void main(String[] args) throws InterruptedException {
        int[][] valor = new int[3][7];

        Random random = new Random();

        // Gerar a matriz
        for (int l = 0; l < valor.length; l++) {
            for (int c = 0; c < valor[0].length; c++) {
                //System.out.print("Digite um valor da posição ["+l+"]["+c+"]: ")
                valor[l][c] = random.nextInt(1, 10);
            }
        }
        // Mostrar a matriz
        for (int l = 0; l < valor.length; l++) {
            for (int c = 0; c < valor[0].length; c++) {
                System.out.print(valor[l][c] + "\t");
                Thread.sleep(200);
            }
            System.out.print("\n");
        }
        System.out.print("FIM!");
    }
}


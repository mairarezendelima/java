package EstudonautaPortugol;

import java.util.Random;

public class Ex65 {
    public static void main(String[] args) throws InterruptedException {
        int l, c, soma;
        int[][] matriz = new int[4][4];

        Random random = new Random();

        // Gerando a matriz
        System.out.print("Sorteando valores para matriz 4 x 4:\n\n");
        for(l = 0; l < matriz.length; l++) {
            for(c = 0; c < matriz.length; c++) {
                matriz[l][c] = random.nextInt(10);
            }
        }

        // Mostrando a matriz
        for(l = 0; l < matriz.length; l++) {
            for(c = 0; c < matriz[0].length; c++) {
                System.out.print(matriz[l][c] + "\t");
                Thread.sleep(300);
            }
            System.out.print("\n");
        }
        System.out.print("----------------------------------------");
        // Somando
        for(c = 0; c < matriz[0].length; c++) {
            soma = 0;
            System.out.print("\nSomando a coluna [" + c + "]: ");
            for(l = 0; l < matriz.length; l++) {
                soma += matriz[l][c];
                System.out.print(matriz[l][c]);
                if (l != matriz[0].length - 1) {
                    System.out.print(" + ");
                }
                else {
                    System.out.print(" = ");
                }
            }
            System.out.print(soma);
            Thread.sleep(300);
        }
        System.out.print("\n----------------------------------------\n");
    }
}

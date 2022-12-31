package EstudonautaPortugol;

import java.util.Scanner;

public class Ex66 {
    public static void main(String[] args) throws InterruptedException {
        int[][] matriz = new int[3][3];
        int l, c, maior = 0;

        Scanner teclado = new Scanner(System.in);

        for (l = 0; l < matriz.length; l++) {
            for (c = 0; c < matriz[0].length; c++) {
                System.out.print("Digite o valor para a posição [" + l + "][" + c + "]: ");
                matriz[l][c] = teclado.nextInt();
                //Para testes rápidos:
                //matriz[l][c] = sorteia(1, 10)
                //System.out.print(matriz[l][c], "\n")
            }
        }
        System.out.print("-------------------------------------------");
        System.out.print("\nProcurando pelo maior valor...\n");
        Thread.sleep(300);
        for (l = 0; l < matriz.length; l++) {
            for (c = 0; c < matriz[0].length; c++) {
                System.out.print(matriz[l][c] + " -> ");
                Thread.sleep(300);
                if (l == 0 && c == 0) {
                    maior = matriz[l][c];
                }
                else if (matriz[l][c] > maior) {
                    maior = matriz[l][c];
                }
            }
            System.out.print("...\n");
        }
        System.out.print("ANALISADO!");
        System.out.print("\n-------------------------------------------");
        System.out.print("\nMaior valor encontrado: " + maior);
        System.out.print("\n-------------------------------------------");
        System.out.print("\nMaior valor encontrado nas posições: \n");
        for (l = 0; l < matriz.length; l++) {
            for (c = 0; c < matriz[0].length; c++) {
                if (matriz[l][c] == maior) {
                    System.out.print("[" + l + "][" + c + "] -> ");
                }
            }
        }
        System.out.print("FIM!");
        System.out.print("\n\n");
    }
}

package EstudonautaPortugol;

import java.util.Random;
import java.util.Scanner;

public class Ex68 {
    public static void main(String[] args) throws InterruptedException {
        char[][] matriz = new char[4][4];
        int l, c, quant = 5, pL, pC, bomba = 0;

        Scanner teclado = new Scanner(System.in);
        Random random = new Random();

        System.out.print("==========================");
        System.out.print("\n       CAMPO MINADO       ");
        System.out.print("\n==========================");
        //Preenche a matriz
        for (l = 0; l < matriz.length; l++) {
            for (c = 0; c < matriz[0].length; c++) {
                matriz[l][c] = '-';
            }
        }
        //Sorteando as bombas
        while (bomba < quant) {
            pL = random.nextInt(matriz.length - 1);
            pC = random.nextInt(matriz[0].length - 1);
            if (matriz[pL][pC] == '-') {
                matriz[pL][pC] = '0';
                bomba++;
            }
        }
        int total = 3, tent = 1, pontos = 0, lin, col;
        boolean bum = false;

        //Iniciando o jogo
        while (tent < total || pontos < (total * 2)) {
            //Tabuleiro com ????
            System.out.print("\n--------------------------\n");
            for (l = 0; l < matriz.length; l++) {
                for (c = 0; c < matriz[0].length; c++) {
                    if (matriz[l][c] == '-' || matriz[l][c] == '0') {
                        System.out.print("?\t");
                    }
                    else {
                        System.out.print(matriz[l][c] + "\t");
                    }
                    Thread.sleep(300);
                }
                System.out.print("\n");
            }
            //Jogada
            System.out.print("--------------------------");
            System.out.print("\nFaça sua jogada! Tentativa " + tent + "\n");
            do {
                System.out.print("LINHA = ");
                lin = teclado.nextInt();
            } while (lin >= matriz.length);
            do {
                System.out.print("COLUNA = ");
                col = teclado.nextInt();
            } while (col >= matriz[0].length);
            if (matriz[lin][col] == '0') {
                System.out.print("\nTiro errado! Você acertou uma bomba!");
                bum = true;
                matriz[lin][col] = '*';
                break;
            }
            else if (matriz[lin][col] == '-') {
                System.out.print("\nTiro certo! Parabéns!");
                matriz[lin][col] = 'V';
                tent++;
                pontos += 2;
            }
            else if (matriz[lin][col] == 'V') {
                System.out.print("\nVocê já atirou nessa posição. Tente novamente!");
            }
        }
        System.out.print("\n==========================");
        System.out.print("\n       GAME OVER       ");
        System.out.print("\n==========================\n");
        System.out.print("--------------------------\n");
        //Tabuleiro completo
        for (l = 0; l < matriz.length; l++) {
            for (c = 0; c < matriz[0].length; c++) {
                System.out.print(matriz[l][c] + "\t");
                Thread.sleep(300);
            }
            System.out.print("\n");
        }
        System.out.print("--------------------------\n");
        if (bum) {
            System.out.print("\nVOCÊ NÃO GANHOU! :(");
        }
        else {
            System.out.print("\nVITÓRIA! VOCÊ GANHOU! :)");
        }
        Thread.sleep(1000);
        System.out.print("\nVocê fez " + pontos + " pontos em " + (tent - 1) + " tentativas\n\n");
    }
}

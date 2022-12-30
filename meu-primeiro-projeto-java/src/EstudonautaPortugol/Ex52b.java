package EstudonautaPortugol;

import java.util.Scanner;

public class Ex52b {
    public static void main(String[] args) throws InterruptedException {
        int quantLinhas, indiceLinhas, indiceEstrelas, quantEstrelas = 1;

        Scanner teclado = new Scanner(System.in);

        System.out.print("Quantas linhas a pirâmide vai ter? ");
        quantLinhas = teclado.nextInt();

        for (indiceLinhas = 1; indiceLinhas <= quantLinhas; indiceLinhas++) {
            for (indiceEstrelas = 1; indiceEstrelas <= quantEstrelas; indiceEstrelas++) {
                System.out.print("* ");
                Thread.sleep(200);
            }
            quantEstrelas += 1;
            System.out.print("\n");
        }
        System.out.println("\n\n");
    }
}
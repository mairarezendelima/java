package EstudonautaPortugol;

import java.util.Scanner;

public class Ex52c {
    public static void main(String[] args) throws InterruptedException {
        int quantLinhas, indiceLinhas, indiceEstrelas, quantEstrelas;

        Scanner teclado = new Scanner(System.in);

        System.out.print("Quantas linhas o triângulo vai ter? ");
        quantLinhas = teclado.nextInt();

        quantEstrelas = quantLinhas;

        for (indiceLinhas = 1; indiceLinhas <= quantLinhas; indiceLinhas++) {
            for (indiceEstrelas = 1; indiceEstrelas <= quantEstrelas; indiceEstrelas++) {
                System.out.print("* ");
                Thread.sleep(200);
            }
            quantEstrelas -= 1;
            System.out.print("\n");
        }
        System.out.println("\n");
    }
}

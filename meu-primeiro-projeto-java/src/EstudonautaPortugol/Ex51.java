package EstudonautaPortugol;

import java.util.Scanner;

public class Ex51 {
    public static void main(String[] args) throws InterruptedException {
        int quantLinhas, quantEstrelas = 1, indiceLinhas, indiceEstrelas;

        Scanner teclado = new Scanner(System.in);

        System.out.println("Quantas linhas o seu triângulo vai ter? ");
        quantLinhas = teclado.nextInt();

        for (indiceLinhas = 1; indiceLinhas <= quantLinhas; indiceLinhas++) {
            for (indiceEstrelas = 1; indiceEstrelas <= quantEstrelas; indiceEstrelas++) {
                System.out.print("* ");
                Thread.sleep(300);
            }
            quantEstrelas++;
            System.out.print("\n");
        }
    }
}

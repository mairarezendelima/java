package EstudonautaPortugol;

import java.util.Scanner;

public class Ex52e {
    public static void main(String[] args) throws InterruptedException {
        int quantLinhas, indiceLinhas, indiceEstrelas, indiceEspacos, quantEspacos = 0, quantEstrelas;

        Scanner teclado = new Scanner(System.in);

        System.out.print("Quantas linhas o triângulo vai ter? ");
        quantLinhas = teclado.nextInt();

        quantEstrelas = (quantLinhas * 2) - 1; // 5 linhas: 9 estrelas na primeira linha

        for (indiceLinhas = 1; indiceLinhas <= quantLinhas; indiceLinhas++) {
            for (indiceEspacos = 1; indiceEspacos <= quantEspacos; indiceEspacos++) {
                System.out.print("  ");
                Thread.sleep(200);
            }
            quantEspacos += 2;

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

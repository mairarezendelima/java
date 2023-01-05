package EstudonautaPortugol;

import java.util.Scanner;

public class Ex52d {
    public static void main(String[] args) throws InterruptedException {
        int quantLinhas, indiceLinhas, indiceEstrelas, indiceEspacos, quantEspacos, quantEstrelas = 1;

        Scanner teclado = new Scanner(System.in);

        System.out.print("Quantas linhas o triângulo vai ter? ");
        quantLinhas = teclado.nextInt();

        quantEspacos = (quantLinhas * 2) - 1 - 1; // Ex: 4 linhas -> A primeira linha tem 1 estrela + 6 espaços; 6 é igual a (4*2)-1-1

        for (indiceLinhas = 1; indiceLinhas <= quantLinhas; indiceLinhas++) {
            for (indiceEspacos = 1; indiceEspacos <= quantEspacos; indiceEspacos++) {
                System.out.print("  ");
                Thread.sleep(200);
            }
            quantEspacos -= 1;
            for (indiceEstrelas = 1; indiceEstrelas <= quantEstrelas; indiceEstrelas++) {
                System.out.print("* ");
                Thread.sleep(200);
            }
            quantEstrelas += 1;
            System.out.print("\n");
        }
        System.out.println("\n");
    }
}

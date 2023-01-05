package EstudonautaPortugol;

import java.util.Scanner;

public class Ex47 {
    public static void main(String[] args) throws InterruptedException {
        int ini, fim, passo, indice;

        Scanner teclado = new Scanner(System.in);

        System.out.print("Início: ");
        ini = teclado.nextInt();
        System.out.print("Final: ");
        fim = teclado.nextInt();
        System.out.print("Passo: ");
        passo = teclado.nextInt();

        if (passo <= 0) {
            passo *= -1;
        }
        if (ini < fim) {
            for (indice = ini; indice <= fim; indice += passo) { // Ordem crescente; enquanto o indice for MENOR ou igual ao fim, ADICIONAR um passo
                System.out.print(indice + "... ");
                Thread.sleep(500);
            }
        }
        else {
            for (indice = ini; indice >= fim; indice -= passo) { // Ordem decrescente; enquanto o indice for MAIOR ou igual ao fim, SUBTRAIR um passo
                System.out.print(indice + "... ");
                Thread.sleep(500);
            }
        }
        System.out.println("Acabou!");
        System.out.println("\n");
    }
}

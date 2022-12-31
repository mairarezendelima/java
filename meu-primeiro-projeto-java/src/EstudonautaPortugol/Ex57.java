package EstudonautaPortugol;

import java.util.Random;

public class Ex57 {
    public static void main(String[] args) throws InterruptedException {
        int passo;
        int[] valor = new int[10];

        Random random = new Random();

        System.out.println("===== VOU SORTEAR 10 NÚMEROS =====");
        System.out.println("Valores sorteados: ");

        for (passo = 0; passo < valor.length; passo++) {
            valor[passo] = random.nextInt(10);
            System.out.print(passo + ":{" + valor[passo] + "}  ");
            Thread.sleep(500);
        }
        System.out.println("\nValores na ordem inversa do sorteio: ");

        for (passo = valor.length - 1; passo >= 0; passo--) {
            System.out.print(passo + ":{" + valor[passo] + "}  ");
            Thread.sleep(500);
        }
        System.out.println("\n");
    }
}

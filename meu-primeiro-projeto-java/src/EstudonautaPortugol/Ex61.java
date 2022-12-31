package EstudonautaPortugol;

import java.util.Scanner;

public class Ex61 {
    public static void main(String[] args) throws InterruptedException {
        int pos, totm5 = 0, totvog = 0, tots = 0;
        String[] vet = new String[6];
        char inicial;

        Scanner teclado = new Scanner(System.in);

        for (pos = 0; pos < vet.length; pos++) {
            System.out.print("Nome for a posição [" + pos + "]: ");
            vet[pos] = teclado.next();
        }
        System.out.print("\n===== " + vet.length + " NOMES CADASTRADOS =====");
        System.out.print("\n\n--------- ANALISANDO ----------\n");

        System.out.print("\nNomes com menos de 5 letras...\n");
        for (pos = 0; pos < vet.length; pos++) {
            if (vet[pos].length() < 5) {
                System.out.print("[" + pos + "] = " + vet[pos] + "  ");
                Thread.sleep(500);
                totm5++;
            }
        }
        System.out.print("-----> TOTAL = " + totm5);
        System.out.print("\n-----------------------------------\n");

        System.out.print("Nomes começando com vogal...\n");
        for (pos = 0; pos < vet.length; pos++) {
            inicial = vet[pos].toUpperCase().charAt(0); // Posição 0: inicial
            if (inicial == 'A' || inicial == 'E' || inicial == 'I' || inicial == 'O' || inicial == 'U') {
                System.out.print("[" + pos + "] = " + vet[pos] + "  ");
                Thread.sleep(500);
                totvog++;
            }
        }
        System.out.print("-----> TOTAL = " + totvog);
        System.out.print("\n-----------------------------------\n");

        System.out.print("Nomes que possuem a letra 'S': \n");
        for (pos = 0; pos < vet.length; pos++) {
            if (vet[pos].toUpperCase().indexOf('S') != -1) {
                System.out.print("[" + pos + "] = " + vet[pos] + "  ");
                Thread.sleep(500);
                tots++;
            }
        }
        System.out.print("-----> TOTAL = " + tots);
        System.out.print("\n-----------------------------------\n");
        System.out.print("\n\n");
    }
}

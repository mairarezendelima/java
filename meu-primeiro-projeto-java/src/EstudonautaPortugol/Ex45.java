package EstudonautaPortugol;

import java.util.Random;
import java.util.Scanner;

public class Ex45 {
    public static void main(String[] args) {
        int indice = 1, palpite, numero, total = 3;

        Scanner teclado = new Scanner(System.in);
        Random random = new Random();

        numero = random.nextInt(10);

        System.out.println("Vou pensar em um número entre 1 e 10");
        System.out.println("\nVocê tem " + total + " chances para tentar adivinhar");

        do {
            System.out.println("\n---------------------------------------");
            System.out.println("\n         Chance nº " + indice + " de " + total + "      ");
            System.out.println("\n---------------------------------------");
            System.out.print("\nQual é o seu palpite? ");
            palpite = teclado.nextInt();

            if (palpite == numero) {
                System.out.println("\nPARABÉNS! Você ACERTOU o número com " + indice+ " tentativa(s)!");
                break;
            }
            else {
                System.out.println("Infelizmente não foi dessa vez...");
                System.out.println("\nMas vou te dar outra chance.");
                indice += 1;
                if (palpite < numero) {
                    System.out.println("\nChute um valor MAIOR");
                }
                else {
                    System.out.println("\nChute um valor MENOR");
                }
            if (indice > total) {
                System.out.println("\nSuas chances acabaram!");
                break;
            }
            }
        } while (true);
        teclado.close();
        System.out.println("\n\n===== FIM DO JOGO =====");
        System.out.println("\n\n");
    }
}

package HackerRank;

import java.util.Scanner;

public class Desafio3 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("================================");

        for(int i = 0; i < 3; i++)
        {
            String s1 = sc.next();
            int x = sc.nextInt();
            System.out.printf("%-15s%03d", s1, x); // %-15s -> %s: string, 15 caracteres justificados à esquerda (sinal negativo)
            // %03d -> %d: inteiro, com 3 digitos e zero na frente deles
            System.out.println();
        }
        System.out.println("================================");

    }
}

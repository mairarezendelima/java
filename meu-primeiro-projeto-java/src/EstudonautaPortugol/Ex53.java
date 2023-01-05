package EstudonautaPortugol;

import java.util.Scanner;

public class Ex53 {
    public static void main(String[] args) {
        int numero, soma = 0, indice = 1;
        String valor;
        char continuar;
        boolean integerOrNot;

        Scanner teclado = new Scanner(System.in);

        do {
            while (true) {
                System.out.print("Digite o " + indice + "º número: ");
                valor = teclado.next();

                integerOrNot = valor.matches("-?\\d+");

                if (integerOrNot) {
                    numero = Integer.parseInt(valor); // converte string em inteiro
                    if (numero >= 1 && numero <= 10) {
                        break;
                    } else {
                        System.out.println("ERRO. O valor deve estar entre 1 e 10\n");
                    }
                } else {
                    System.out.println("ERRO. O valor deve ser um número inteiro\n");
                }
            }
            indice += 1;
            soma += numero;

            while(true) {
                System.out.print("Quer continuar? [S/N] ");
                continuar = teclado.next().charAt(0);

                if (Character.isLetter(continuar)) {
                    if (Character.toUpperCase(continuar) == 'N' || Character.toUpperCase(continuar) == 'S') {
                        break;
                    }
                    else {
                        System.out.println("ERRO. Por favor, responda S ou N\n");
                    }
                } else {
                    System.out.println("ERRO. O valor deve ser uma letra\n");
                }
            }
        } while (Character.toUpperCase(continuar) == 'S');

        System.out.println("-------------------------");
        System.out.println("Você digitou " + indice + " valores");
        System.out.println("A soma entre eles é " + soma);
        System.out.println("-------------------------");
        System.out.println("\n");
    }
}
package EstudonautaPortugol;

import java.util.Scanner;

public class Ex43 {
    public static void main(String[] args) {
        int valor, indice = 0, quantPares = 0, quantImpares = 0, menorImpar = 0;
        char resp;

        Scanner teclado = new Scanner(System.in);

        do {
            indice++;
            System.out.print("Digite o " + indice + "º valor : ");
            valor = teclado.nextInt();
            System.out.print("Quer continuar? [S/N] ");
            resp = teclado.next().charAt(0);
            if (valor % 2 == 0) {
                quantPares += 1;
            }
            else {
                quantImpares += 1;
                if (quantImpares == 1) {
                    menorImpar = valor;
                }
                else if (quantImpares < menorImpar) {
                        menorImpar = valor;
                }
            }
        } while (Character.toUpperCase(resp) == 'S');
        System.out.println("---------------------------------");
        System.out.println("Ao todo, você digitou " + indice + " valores");
        System.out.println("Você digitou " + quantPares + " valores pares");
        System.out.println("Você digitou " + quantImpares + " valores ímpares");
        System.out.println("O valor " + menorImpar + " foi o menor número ímpar digitado");
        System.out.println("\n");
    }
}

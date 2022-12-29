package EstudonautaPortugol;

import java.util.Random;
import java.util.Scanner;

public class Ex44 {
    public static void main(String[] args) {
        int numero, indice = 0, maior = 0, menor = 0, quant5sorteado = 0, soma = 0;
        char sortear;

        Scanner teclado = new Scanner(System.in);
        Random random = new Random();

        do {
            indice += 1;
            numero = random.nextInt(10);
            System.out.print(numero + " ");

            soma += numero;

            System.out.println("\nO " + indice + "º valor sorteado foi " + numero);
            System.out.println("\nQuer sortear mais um? [S/N] ");
            sortear = teclado.next().charAt(0);
            if (numero == 5) {
                quant5sorteado += 1;
            }
            if (indice == 1) {
                maior = numero;
                menor = numero;
            }
            else {
                if (numero > maior) {
                    maior = numero;
                }
                else if (numero < menor) {
                        menor = numero;
                }
            }
        } while (Character.toUpperCase(sortear) == 'S');

        System.out.println("\n----------------------------------");
        System.out.println("\nVocê me fez sortear " + indice + " valores");
        System.out.println("\nA soma de todos eles foi igual a " + soma);
        System.out.println("\nO maior valor foi " + maior + " e o menor valor foi " + menor);
        System.out.println("\nO valor 5 foi sorteado " + quant5sorteado + " vezes");
        System.out.println("\n\n");
    }
}

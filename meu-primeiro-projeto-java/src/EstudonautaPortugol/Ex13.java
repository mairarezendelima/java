package EstudonautaPortugol;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Ex13 {
    public static void main(String[] args) {
        float nota1, nota2, media;

        Scanner teclado = new Scanner(System.in);
        DecimalFormat deci = new DecimalFormat("0.0");
        
        System.out.print("Digite a sua primeira nota: ");
        nota1 = teclado.nextFloat();
        System.out.print("Digite a sua segunda nota: ");
        nota2 = teclado.nextFloat();

        media = (nota1 + nota2) / 2;

        if (media >= 7) { 
            System.out.println("MEUS PARABÉNS!");
        }
        System.out.println("A sua média final foi de " + deci.format(media));
        System.out.println("\n");
    }
}

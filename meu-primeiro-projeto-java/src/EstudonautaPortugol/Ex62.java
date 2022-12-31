package EstudonautaPortugol;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Ex62 {
    public static void main(String[] args) throws InterruptedException {
        int passo;
        String[] nome = new String[6];
        char[] sexo = new char[6];
        float[] sal = new float[6];

        Scanner teclado = new Scanner(System.in);
        DecimalFormat deci = new DecimalFormat("0.00");

        for (passo = 0; passo < nome.length; passo++) {
            System.out.print("===== CADASTRO " + (passo + 1) + " =====");
            do {
                System.out.print("\nNome: ");
                nome[passo] = teclado.next();
            } while (nome[passo].equals(""));
            do {
                System.out.print("Sexo: [M/F] ");
                sexo[passo] = teclado.next().charAt(0);
            } while (Character.toUpperCase(sexo[passo]) != 'M' && Character.toUpperCase(sexo[passo]) != 'F');
            System.out.print("Salário: R$ ");
            sal[passo] = teclado.nextFloat();
        }
        System.out.print("\n         LISTAGEM COMPLETA      ");
        System.out.print("\n------------------------------------------");
        Thread.sleep(500);
        System.out.print("\nNOME\t\tSEXO\t\tSALÁRIO");
        System.out.print("\n-------------------------------------------");
        Thread.sleep(500);

        for (passo = 0; passo < nome.length; passo++) {
            System.out.print("\n" + nome[passo] + "\t\t\t");
            Thread.sleep(500);
            System.out.print(Character.toUpperCase(sexo[passo]));
            Thread.sleep(500);
            System.out.print("\t\t\tR$ " + deci.format(sal[passo]));
            Thread.sleep(500);
        }
        System.out.print("\n-------------------------------------------\n\n");
    }
}

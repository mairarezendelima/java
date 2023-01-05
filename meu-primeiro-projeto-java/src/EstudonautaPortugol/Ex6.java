package EstudonautaPortugol;

import java.util.Scanner;
import java.text.DecimalFormat;

public class Ex6 {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);
        DecimalFormat deci = new DecimalFormat("0.00");

		System.out.print("Distância em metros: ");

		float d = teclado.nextFloat();

        teclado.close();

		System.out.println("\n---------- CONVERTENDO ----------\n");
        System.out.println(deci.format(d / 1000) + " Km\n");
        System.out.println(deci.format(d / 100) + " hm\n");
        System.out.println(deci.format(d / 10) + " dam\n");
        System.out.println(deci.format(d * 10) + " dm\n");
        System.out.println(deci.format(d * 100) + " cm\n");
        System.out.println(deci.format(d * 1000) + " mm\n");
		System.out.println("\n\n");
    }
}

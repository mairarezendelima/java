package EstudonautaPortugol;

import java.util.Scanner;
import java.text.DecimalFormat;

public class Ex6 {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);
        DecimalFormat deci = new DecimalFormat("0.00");

		System.out.print("Distância em metros: ");

		float d = teclado.nextFloat();

		System.out.println("---------- CONVERTENDO ----------");
        System.out.println(deci.format(d / 1000) + " Km");
        System.out.println(deci.format(d / 100) + " hm");
        System.out.println(deci.format(d / 10) + " dam");
        System.out.println(deci.format(d * 10) + " dm");
        System.out.println(deci.format(d * 100) + " cm");
        System.out.println(deci.format(d * 1000) + " mm");
		System.out.println("\n");
    }
}

package EstudonautaPortugol;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Ex7 {
    public static void main(String[] args) {
		float l, a, ar, lt;

		Scanner teclado = new Scanner(System.in);
        DecimalFormat deci = new DecimalFormat("0.00");
        
        System.out.print("Largura (m): ");
        l = teclado.nextFloat();
		System.out.print("Altura (m): ");
        a = teclado.nextFloat();

		ar = l * a;
		lt = ar / 2;
		
		System.out.println("Uma parede de " + l + " m por " + a + " m tem área de " + deci.format(ar) + " m²");
		System.out.println("Precisaremos de " + deci.format(lt) + " latas de tinta");
		System.out.println("\n");
    }
}

package EstudonautaPortugol;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Ex18 {
    public static void main(String[] args) {
        System.out.println("\n---------------------------------------------------");
		System.out.println("\n            VIAÇÃO ESTUDONAUTA         ");
		System.out.println("\n---------------------------------------------------");
		System.out.println("\nViagens até 200km: \t\t\tR$ 0.50/km");
		System.out.println("\nViagens acima de 200km: \t\tR$ 0.35/km");
		System.out.println("\n===================================================");
		
		float dist, fator, total;

        Scanner teclado = new Scanner(System.in);
        DecimalFormat deci = new DecimalFormat("0.00");
		
		System.out.print("\nInforme a distância total, em km: ");
		dist = teclado.nextFloat();

        teclado.close();

		System.out.println("\n------------------ RESULTADO ----------------------");
		
		if (dist <= 200) {
			fator = 0.5f;
		}
		else {
			fator = 0.35f;
		}
		total = dist * fator;
		
		System.out.println("\nUma viagem de " + dist + " km vai custar R$ " + deci.format(fator) + "/km.");
		System.out.println("\nValor total: R$ " + deci.format(total));
		System.out.println("\n====================================================");
		System.out.println("\n\n");
    }
}

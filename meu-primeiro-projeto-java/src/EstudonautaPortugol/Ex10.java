package EstudonautaPortugol;

import java.util.Scanner;

public class Ex10 {
    public static void main(String[] args) {

		int anos, cig, totcig, dperd;
		
        Scanner teclado = new Scanner(System.in);
		
		System.out.print("Há quantos anos você fuma? ");
        anos = teclado.nextInt();
		System.out.print("Quantos cigarros você fuma por dia? ");
        cig = teclado.nextInt();


		totcig = anos * cig * 365;
		dperd = totcig * 10 / 1440; // Um dia tem 1440 minutos. Em 10 minutos, temos 10 / 1440 dias. 
		
		System.out.println("Ao todo, até agora você já fumou " + totcig + " cigarros!");
		System.out.println("Estima-se que você já perdeu " + dperd + " dias de vida!");
		System.out.println("\n");
    }
}

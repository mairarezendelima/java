package EstudonautaPortugol;

import java.util.Calendar;
import java.util.Scanner;

public class Ex20 {
    public static void main(String[] args) {
        int hinic = 18, horaAtual;
		float preco = 20.00f, din;
		
		Calendar cal = Calendar.getInstance();
        //Calendar cal = GregorianCalendar.getInstance();
        horaAtual = cal.get(Calendar.HOUR_OF_DAY); // HOUR_OF_DAY: formato 24h; HOUR: formato 12h

        
        System.out.println("\n              CINEMA ESTUDONAUTA                   ");
		System.out.println("\n---------------------------------------------------");
		System.out.println("\nHORÁRIO DO FILME: \t\t\t" + hinic + " h");
		System.out.println("\nPREÇO DO INGRESSO: \t\t\tR$ " + preco);
		System.out.println("\n---------------------------------------------------");
		System.out.println("\nAgora são " + horaAtual + " horas.");

        Scanner teclado = new Scanner(System.in);

		System.out.print("\nQuanto dinheiro você tem? R$ ");
		din = teclado.nextFloat();

        teclado.close();

		System.out.println("---------------------------------------------------");
		
		if ((din >= preco) && (horaAtual <= hinic)) {
			System.out.println("\nVocê consegue comprar o ingresso com esse valor! \nSeja bem-vindo(a)!");
		}
		else {
			System.out.println("\nInfelizmente não é possível comprar o ingresso! \nTente outro dia!");
		}
		System.out.println("\n\n");
    }
}

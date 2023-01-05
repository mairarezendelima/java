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

        
        System.out.println("              CINEMA ESTUDONAUTA                   ");
		System.out.println("---------------------------------------------------");
		System.out.println("HORÁRIO DO FILME: \t\t\t" + hinic + " h");
		System.out.println("PREÇO DO INGRESSO: \t\t\tR$ " + preco);
		System.out.println("---------------------------------------------------");
		System.out.println("Agora são " + horaAtual + " horas.");

        Scanner teclado = new Scanner(System.in);

		System.out.print("Quanto dinheiro você tem? R$ ");
		din = teclado.nextFloat();

		System.out.println("---------------------------------------------------");
		
		if ((din >= preco) && (horaAtual <= hinic)) {
			System.out.println("Você consegue comprar o ingresso com esse valor! \nSeja bem-vindo(a)!");
		}
		else {
			System.out.println("Infelizmente não é possível comprar o ingresso! \nTente outro dia!");
		}
		System.out.println("\n");
    }
}

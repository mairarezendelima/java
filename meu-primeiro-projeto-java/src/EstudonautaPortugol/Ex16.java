package EstudonautaPortugol;

import java.util.Calendar;
import java.util.Scanner;

public class Ex16 {
    public static void main(String[] args) {
        int anoNasc, idade, anoAtual;
		
		Scanner teclado = new Scanner(System.in);
        
        System.out.print("Em que ano você nasceu? ");
		anoNasc = teclado.nextInt();

		Calendar cal = Calendar.getInstance();
        //Calendar cal = GregorianCalendar.getInstance();
        anoAtual = cal.get(Calendar.YEAR);
        idade = anoAtual - anoNasc;
		
		System.out.println("Sua idade atual é " + idade + " anos.");

		if (idade >= 18) {
			System.out.println("Espero sinceramente que você tenha se alistado.");
		} 
		else {
			System.out.println("Você ainda não competou 18 anos. Não pode se alistar.");
		}
		System.out.println("\n");
    }
}

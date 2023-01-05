package EstudonautaPortugol;

import java.util.Calendar;
import java.util.Scanner;

public class Ex23 {
    public static void main(String[] args) {
        int anoNasc, idade, alist, atras, adiant, anoAtual;
		
		Scanner teclado = new Scanner(System.in);
        
        System.out.print("Em que ano você nasceu? ");
		anoNasc = teclado.nextInt();
		
		Calendar cal = Calendar.getInstance();
        //Calendar cal = GregorianCalendar.getInstance();
        anoAtual = cal.get(Calendar.YEAR);
        
        idade = anoAtual - anoNasc;
		alist = anoNasc + 18;
		atras = anoAtual - alist;
		adiant = alist - anoAtual;
		
		System.out.println("Estamos em " + anoAtual + " e você tem " + idade + " anos.");
		
		if (idade > 18) {
			System.out.println("Você já deveria ter se alistado no ano de " + alist);
			System.out.println("Você já está atrasado " + atras + " ano (s)!");
		} 
		else if (idade < 18) {
			System.out.println("Você ainda não competou 18 anos. \nIsso só vai acontecer em " + alist);
			System.out.println("Ainda falta (m) " + adiant + " ano (s).");
		}
		else {
			System.out.println("ATENÇÃO! Você completa 18 anos neste ano de " + anoAtual + ". CORRA!");
		}
		System.out.println("\n");
    }
}

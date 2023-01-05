package EstudonautaPortugol;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Ex9 {
    public static void main(String[] args) {

		String nome;
		float sal, reaj, aum, dif;
		
		Scanner teclado = new Scanner(System.in);
        DecimalFormat deci = new DecimalFormat("0.00");
        
        System.out.print("Nome do funcionário: ");
        nome = teclado.nextLine();
		System.out.print("Salário: R$ ");
        sal = teclado.nextFloat();
		System.out.print("Reajuste (%): ");
        reaj = teclado.nextFloat();
		
		aum = sal + (sal * reaj/100);
		dif = aum - sal;
		
		System.out.println("---------- RESULTADO ----------");
		System.out.println(nome + " ganhava um salário mensal de R$ " + deci.format(sal));
		System.out.println("Depois de receber " + deci.format(reaj) + " % de aumento, vai passar a ganhar R$ " + deci.format(dif) + " a mais por mês");
		System.out.println("Seu novo salário será de R$ " + deci.format(aum));
		System.out.println("\n");
    }
}

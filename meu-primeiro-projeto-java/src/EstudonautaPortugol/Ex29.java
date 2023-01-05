package EstudonautaPortugol;

import java.util.Scanner;

public class Ex29 {
    public static void main(String[] args) throws InterruptedException {
        int ini, fim, inc;
		
		Scanner teclado = new Scanner(System.in);
        
        System.out.print("Onde começa a contagem? ");
		ini = teclado.nextInt();
		System.out.print("Onde termina a contagem? ");
		fim = teclado.nextInt();
		System.out.print("Qual vai ser o incremento? ");
		inc = teclado.nextInt();

		while (ini <= fim) 
		{
			System.out.print(ini + " ");
			ini += inc;
            Thread.sleep(1000);
		}
		System.out.println("\n");
    }
}

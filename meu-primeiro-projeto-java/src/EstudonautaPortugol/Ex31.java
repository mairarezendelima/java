package EstudonautaPortugol;

import java.util.Scanner;

public class Ex31 {
    public static void main(String[] args) throws InterruptedException {
        int c, m;
		
		Scanner teclado = new Scanner(System.in);
        
        System.out.print("Sua contagem regressiva vai começar em: ");
		c = teclado.nextInt();
		System.out.print("Marcar os múltiplos de ");
		m = teclado.nextInt();

        teclado.close();

		System.out.println("\n");

		while (c >= 0)
		{
			if (c % m == 0) {
				System.out.print("[" + c + "] ");
			}
			else {
				System.out.print(c + " ");
			}
			Thread.sleep(500);
			c -= 1;
		}
		System.out.println("\n\n");
    }
}

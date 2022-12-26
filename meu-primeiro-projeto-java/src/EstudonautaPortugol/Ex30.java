package EstudonautaPortugol;

import java.util.Scanner;

public class Ex30 {
    public static void main(String[] args) throws InterruptedException {
        int c, fim;
		
		Scanner teclado = new Scanner(System.in);
        
        System.out.println("======= JOGO DO PIN ========");
		System.out.print("\n\nQuer contar até quanto? ");
		fim = teclado.nextInt();

        teclado.close();

		System.out.print("\n");

		c = 1;
		while (c <= fim)
		{
			if (c % 4 == 0) {
				System.out.print("PIN! ");
			}
			else {
				System.out.print(c + " ");
			}
			Thread.sleep(500);
			c += 1;
		}
		System.out.print("\n\n");
    }
}

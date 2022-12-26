package EstudonautaPortugol;

import java.util.Scanner;

// são bissextos: anos múltiplos de 400 OU (anos NÃO múltiplos de 100 e múltiplos de 4) 
public class Ex17 {
    public static void main(String[] args) {
        int ano;
		
		Scanner teclado = new Scanner(System.in);
        
        System.out.print("Digite um ano qualquer: ");
		ano = teclado.nextInt();

        teclado.close();

		if (ano % 400 == 0) {
			System.out.println("O ano de " + ano + " é bissexto!");
		} 
		else {
			if (ano % 100 != 0 && ano % 4 == 0) {
				System.out.println("O ano de " + ano + " é bissexto!");
			} 
			else {
				System.out.println("O ano de " + ano + " NÃO é bissexto!");
			}
		}
		System.out.println("\n\n");
    }
}

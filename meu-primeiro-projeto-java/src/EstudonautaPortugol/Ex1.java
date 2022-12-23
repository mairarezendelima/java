package EstudonautaPortugol;

import java.util.Scanner;

public class Ex1 {
    public static void main(String[] args) {
        String nome;

        Scanner teclado = new Scanner(System.in);
		
		System.out.print("Olá, qual é o seu nome? ");
		nome = teclado.nextLine();

        teclado.close();
		
		System.out.println("Tudo bem, " + nome + "? É um grande prazer te conhecer!");
    }
}

package EstudonautaPortugol;

import java.util.Scanner;

public class Ex2 {
    public static void main(String[] args) {
        String nome;
		int nasc;
		float sal;

        Scanner teclado = new Scanner(System.in);
		
		System.out.print("Nome do funcionário: ");
		nome = teclado.nextLine();
		System.out.print("Ano de nascimento: ");
		nasc = teclado.nextInt();
		System.out.print("Salário: R$ ");
		sal = teclado.nextFloat();
		
		System.out.println("--------------FICHA FUNCIONAL----------------");
		System.out.println("NOME: " + nome);
		System.out.println("NASCIMENTO EM " + nasc);
		System.out.println("SALÁRIO DE R$ " + sal);
		System.out.println("---------------------------------------------");
    }
}

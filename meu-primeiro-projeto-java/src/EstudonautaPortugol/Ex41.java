package EstudonautaPortugol;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Ex41 {
    public static void main(String[] args) {
        String nome, jovem = "", velho = "";
		int idade, indice = 0, idadeVelho = 0, idadeJovem = 0, soma = 0;
		float media;

        Scanner teclado = new Scanner(System.in);
        DecimalFormat deci = new DecimalFormat("0.00");

		while (true) {
			System.out.println("------------ NOVO AMIGO ------------");
			System.out.println("OBS: Digite ACABOU no nome para parar");
			System.out.print("Nome: ");
			nome = teclado.next();

			if (nome.equalsIgnoreCase("ACABOU")) break; // Ignora se está em maiúsculas ou minúsculas; Os sinais "==" não funcionaram, deram erro

			System.out.print("Idade: ");
			idade = teclado.nextInt();
			
			soma += idade;
			indice += 1;

			if (indice == 1) {
				idadeVelho = idade;
				idadeJovem = idade;
				velho = nome;
				jovem = nome;
			} 
			else {
				if (idade > idadeVelho) {
					idadeVelho = idade;
					velho = nome;
				} 
				else if (idade < idadeJovem) {
					idadeJovem = idade;
					jovem = nome;
				}
			}
		}
		
        float somaFloat = soma;
        media = somaFloat / indice;

		System.out.println("********* INTERROMPIDO **********");
		System.out.println("===== RESULTADOS =====");
		System.out.println("Total de amigos: " + indice);
		System.out.println("Soma das idades: " + soma);
		System.out.println("Média das idades: " + deci.format(media));
		System.out.println("Seu amigo mais jovem é " + jovem +", com " + idadeJovem + " anos");
		System.out.println("Seu amigo mais velho é " + velho +", com " + idadeVelho + " anos");
		System.out.println("------------------------------------");
		System.out.println("\n");
    }
}

package EstudonautaPortugol;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Ex41 {
    public static void main(String[] args) {
        String nome = "", jovem = "", velho = "";
		int idade = 0, indice = 0, idadeVelho = 0, idadeJovem = 0, soma = 0;
		float media;

        Scanner teclado = new Scanner(System.in);
        DecimalFormat deci = new DecimalFormat("0.00");

		while (true) {
			System.out.println("------------ NOVO AMIGO ------------");
			System.out.println("\nOBS: Digite ACABOU no nome para parar");
			System.out.print("\nNome: ");
			nome = teclado.nextLine();

			if (nome.toUpperCase() == "ACABOU"){
			    break;
			}

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
        teclado.close();

		System.out.println("\n********* INTERROMPIDO **********");
		System.out.println("\n\n===== RESULTADOS =====");
		System.out.println("\nTotal de amigos: " + indice);
		System.out.println("\nSoma das idades: " + soma);
		System.out.println("\nMédia das idades: " + deci.format(media));
		System.out.println("\nSeu amigo mais jovem é " + jovem +", com " + idadeJovem + " anos");
		System.out.println("\nSeu amigo mais velho é " + velho +", com " + idadeVelho + " anos");
		System.out.println("\n------------------------------------");
		System.out.println("\n\n");
    }
}

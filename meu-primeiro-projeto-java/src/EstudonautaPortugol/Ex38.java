package EstudonautaPortugol;

import java.util.Scanner;

public class Ex38 {
    public static void main(String[] args) {
        int indice = 1, idade, idadeHomemVelho = 0, idadeHomemJovem = 0, idadeMulherVelha = 0, idadeMulherJovem = 0, quantHomens = 0, quantMulheres = 0;
		String nome, nomeHomemVelho = "", nomeHomemJovem = "", nomeMulherVelha = "", nomeMulherJovem = "";
        char sexo;
		
		Scanner teclado = new Scanner(System.in);
        
        while (indice <= 5) {
			System.out.println("-----------------\n");
			System.out.println(indice + "ª PESSOA");
			System.out.println("\n-----------------");

			System.out.print("\nSexo (M/F): ");
			sexo = teclado.next().charAt(0);
			System.out.print("Nome: ");
			nome = teclado.next();
			System.out.print("Idade: ");
			idade = teclado.nextInt();

			if (Character.toUpperCase(sexo) == 'M') {
				quantHomens++;

				if (quantHomens == 1) {
					idadeHomemVelho = idade;
					idadeHomemJovem = idade;
					nomeHomemVelho = nome;
					nomeHomemJovem = nome;
				}
				else {
					if (idade > idadeHomemVelho) {
						idadeHomemVelho = idade;
						nomeHomemVelho = nome;
					}
					if (idade < idadeHomemJovem) {
						idadeHomemJovem = idade;
						nomeHomemJovem = nome;
					}
				}
			}
			else if (Character.toUpperCase(sexo) == 'F') {
				quantMulheres++;

				if (quantMulheres == 1) {
					idadeMulherVelha = idade;
					idadeMulherJovem = idade;
					nomeMulherVelha = nome;
					nomeMulherJovem = nome;
				}
				else {
					if (idade > idadeMulherVelha) {
						idadeMulherVelha = idade;
						nomeMulherVelha = nome;
					}
					if (idade < idadeMulherJovem) {
						idadeMulherJovem = idade;
						nomeMulherJovem = nome;
					}
				}	
			}
			indice++;
		}

        teclado.close();
        
		System.out.println("===================");
		System.out.println("\nAo todo, tivemos " + quantHomens + " homens e " + quantMulheres + " mulheres.");
		System.out.println("\nO homem mais velho é " + nomeHomemVelho + " com " + idadeHomemVelho + " anos.");
		System.out.println("\nO homem mais jovem é " + nomeHomemJovem + " com " + idadeHomemJovem + " anos.");
		System.out.println("\nA mulher mais velha é " + nomeMulherVelha + " com " + idadeMulherVelha + " anos.");
		System.out.println("\nA mulher mais jovem é " + nomeMulherJovem + " com " + idadeMulherJovem + " anos.");
		System.out.println("\n\n");
    }
}

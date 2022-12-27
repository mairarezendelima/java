package EstudonautaPortugol;

import java.util.Scanner;

public class Ex35 {
    public static void main(String[] args) {
        int quantPessoas, indice = 1, quantHomens = 0, quantMulheres = 0;
	float pesoRef, peso;
	char sexo;
		
	Scanner teclado = new Scanner(System.in);
        
        System.out.print("Quantas pessoas vamos cadastrar? ");
	quantPessoas = teclado.nextInt();
	System.out.print("Qual será o peso de referência? (Kg) ");
	pesoRef = teclado.nextFloat();

	while (indice <= quantPessoas) {
		System.out.println("\n-------------------------------------");
		System.out.println("\n          PESSOA " + indice + " DE " + quantPessoas + "         ");
		System.out.println("\n-------------------------------------");

		System.out.print("\nPeso (Kg): ");
		peso = teclado.nextFloat();
		System.out.print("Sexo (M/F): ");
		sexo = teclado.next().charAt(0);

		if (peso > pesoRef) {
			System.out.println("\n===== PESO ACIMA DO LIMITE =====");
			if (Character.toUpperCase(sexo) == 'M'){
				quantHomens += 1;
		}
			else if (Character.toUpperCase(sexo) == 'F') {
				quantMulheres += 1;
			}
		}
		else {
			System.out.println("\n===== PESO DENTRO DO LIMITE =====");
		}
		indice += 1;
	}

	teclado.close();

	System.out.println("\n\n--------------- Resultado -------------------");
	System.out.println("\nAo todo, temos " + quantHomens + " homens e " + quantMulheres + " mulheres acima do peso de referência!");
	System.out.println("\n\n");
    }
}

package EstudonautaPortugol;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Ex42 {
    public static void main(String[] args) {
        int quantFunc = 0, quantHomens = 0, quantMulheres = 0, quantMulheresMaisMil = 0;
        String nome, nomeHomemMaiorSal = "";
        float sal, salMaiorHomem = 0.00f, mediaSalHomens, somaSalHomens = 0.00f;
        char sexo, continuar;

        Scanner teclado = new Scanner(System.in);
        DecimalFormat deci = new DecimalFormat("0.00");

        do {
            System.out.print("\nNome: ");
            nome = teclado.next();
            System.out.print("Sexo [F/M]: ");
            sexo = teclado.next().charAt(0);
            System.out.print("Salário: R$ ");
            sal = teclado.nextFloat();
            quantFunc += 1;

            if (Character.toUpperCase(sexo) == 'F') {
                quantMulheres += 1;
                if (sal > 1000) {
                    quantMulheresMaisMil += 1;
                }
            } else if (Character.toUpperCase(sexo) == 'M') {
                quantHomens += 1;
                somaSalHomens += sal;
                if (quantHomens == 1) {
                    salMaiorHomem = sal;
                    nomeHomemMaiorSal = nome;
                } else if (sal > salMaiorHomem) {
                    salMaiorHomem = sal;
                    nomeHomemMaiorSal = nome;
                }
            }
            System.out.println("Quer continuar?[S/N] ");
            continuar = teclado.next().charAt(0);
            System.out.println("------------------------");
        } while (Character.toUpperCase(continuar) != 'N');

        teclado.close();
        float quantHomensFloat = quantHomens;
        mediaSalHomens = somaSalHomens / quantHomensFloat;

        System.out.println("\n===== RESULTADOS =====");
        System.out.println("\nTotal de funcionários: " + quantFunc);
        System.out.println("\nTotal de homens: " + quantHomens);
        System.out.println("\nTotal de mulheres: " + quantMulheres);
        System.out.println("\nA média salarial dos homens é R$ " + deci.format(mediaSalHomens));
        System.out.println("\nTemos " + quantMulheresMaisMil + " mulheres ganhando mais de R$ 1000.00");
        System.out.println("\nO maior salário entre os homens é do " + nomeHomemMaiorSal + " ,que ganha R$ " + deci.format(salMaiorHomem));
        System.out.println("\n---------------------");
        System.out.println("\n\n");
    }
}

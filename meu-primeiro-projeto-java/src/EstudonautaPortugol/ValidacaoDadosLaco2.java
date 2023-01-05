package EstudonautaPortugol;

import java.util.Scanner;

public class ValidacaoDadosLaco2 {
    public static void main(String[] args) {
        String id;
        int idade;
        boolean integerOrNot;

        Scanner teclado = new Scanner(System.in);

        while (true) {
            System.out.print("Digite a idade: ");
            id = teclado.next();
            integerOrNot = id.matches("-?\\d+");

            if (integerOrNot) {
                idade = Integer.parseInt(id); // converte string em inteiro
                if (idade >= 0 && idade <= 130) {
                    break;
                } else {
                    System.out.print("ERRO! A idade deve estar entre 0 e 130 anos.\n");
                }
            } else {
                System.out.print("ERRO! A idade deve ser um número.\n");
            }
        }
        System.out.print("A idade digitada é " + idade);
    }
}

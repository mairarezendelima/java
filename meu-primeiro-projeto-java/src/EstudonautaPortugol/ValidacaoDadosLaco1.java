package EstudonautaPortugol;

import java.util.Scanner;

public class ValidacaoDadosLaco1 {
    public static void main(String[] args) {
        char sexo;
        int idade;

        Scanner teclado = new Scanner(System.in);

        do {
            System.out.print("Digite o sexo: ");
            sexo = teclado.next().charAt(0);
        } while (!(Character.toUpperCase(sexo) == 'M' || Character.toUpperCase(sexo) == 'F'));

        do {
            System.out.print("Digite a idade: ");
            idade = teclado.nextInt();
        } while (!(idade >= 0 && idade <= 130));

        System.out.print ("Sexo: " + Character.toUpperCase(sexo) + " Idade: " + idade + "\n");
    }
}


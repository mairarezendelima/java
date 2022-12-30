package EstudonautaPortugol;
//revisar código
import java.util.Scanner;

public class Ex54 {
    public static void main(String[] args) {
        int idade, c = 0, menor = 0, maior = 0;
        String texto, nome, nova = "", velha ="", valor, continuar;
        char resp;
        boolean integerOrNot;

        Scanner teclado = new Scanner(System.in);

        do {
            System.out.println("-------------------------");
            System.out.println("\n       PESSOA " + (c + 1) + "       ");
            System.out.println("\n-------------------------");
            while(true) {
                System.out.println("\nNOME: ");
                texto = teclado.next();
                if (texto.length() >= 3) {
                    nome = texto;
                    break;
                }
                else {
                    System.out.println("ERRO. O nome deve ter pelo menos 3 letras\n");
                }
            }
            while(true) {
                System.out.println("IDADE: ");
                valor = teclado.next();

                integerOrNot = valor.matches("-?\\d+");

                if (integerOrNot) {
                    idade = Integer.parseInt(valor);
                    if (idade >= 0 && idade <= 130) {
                        break;
                    }
                    else {
                        System.out.println("ERRO. Idade inválida\n");
                    }
                }
                else {
                    System.out.println("ERRO. A idade deve ser um número inteiro\n");
                }
            }
            c += 1;
            if (c == 1) {
                maior = idade;
                menor = idade;
                velha = nome;
                nova = nome;
            }
            else {
                if (idade > maior) {
                    maior = idade;
                    velha = nome;
                }
                else if (idade < menor) {
                        menor = idade;
                        nova = nome;
                }
            }
            while(true) {
                System.out.println("Quer continuar? [S/N] ");
                continuar = teclado.next();
                if (Character.isLetter(Integer.parseInt(continuar))){
                    resp = continuar.charAt(0);
                    if (resp == 'S' || resp == 's' || resp == 'N' || resp == 'n') {
                        break;
                    }
                    else {
                        System.out.println("ERRO. Por favor, responda S ou N\n");
                    }
                }
                else {
                    System.out.println("ERRO. O valor deve ser uma letra\n");
                }
            }
        } while (Character.toUpperCase(resp) == 'S' || Character.toUpperCase(resp) =='N');
        System.out.println("\n==============================");
        System.out.println("\nVocê cadastrou " + c + " pessoas");
        System.out.println("\n" + nova + " é a pessoa mais nova, com " + menor + " anos");
        System.out.println("\n" + velha + " é a pessoa mais velha, com " + maior + " anos");
        System.out.println("\n==============================");
        System.out.println("\n\n");
    }
}

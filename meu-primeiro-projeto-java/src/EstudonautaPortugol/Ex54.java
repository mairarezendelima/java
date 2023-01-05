package EstudonautaPortugol;

import java.util.Scanner;

public class Ex54 {
    public static void main(String[] args) {
        int idade, c = 0, menor = 0, maior = 0;
        String texto, nome, nova = "", velha ="", valor;
        char continuar;
        boolean integerOrNot;

        Scanner teclado = new Scanner(System.in);

        do {
            System.out.println("-------------------------");
            System.out.println("       PESSOA " + (c + 1) + "       ");
            System.out.println("-------------------------");
            while(true) {
                System.out.print("NOME: ");
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
                System.out.print("IDADE: ");
                valor = teclado.next();

                integerOrNot = valor.matches("-?\\d+");

                if (integerOrNot) {
                    idade = Integer.parseInt(valor);
                    if (idade >= 0 && idade <= 130) {
                        break;
                    }
                    else {
                        System.out.println("ERRO. Idade inválida");
                    }
                }
                else {
                    System.out.println("ERRO. A idade deve ser um número inteiro");
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
                System.out.print("Quer continuar? [S/N] ");
                continuar = teclado.next().charAt(0);
                if (Character.isLetter(continuar)){
                    if ((Character.toUpperCase(continuar) == 'S' || Character.toUpperCase(continuar) == 'N')) {
                        break;
                    }
                    else {
                        System.out.println("ERRO. Por favor, responda S ou N");
                    }
                }
                else {
                    System.out.println("ERRO. O valor deve ser uma letra");
                }
            }
        } while (Character.toUpperCase(continuar) == 'S');
        System.out.println("==============================");
        System.out.println("Você cadastrou " + c + " pessoas");
        System.out.println(nova + " é a pessoa mais nova, com " + menor + " anos");
        System.out.println(velha + " é a pessoa mais velha, com " + maior + " anos");
        System.out.println("==============================");
        System.out.println("\n");
    }
}

package EstudonautaPortugol;

import java.util.Scanner;

public class Ex11 {
    public static void main(String[] args) {
        String cidade, grande;
        int tam;
        char firstCharacter;
        
        Scanner teclado = new Scanner(System.in);
        
        System.out.print("Em que cidade você mora? ");
        cidade = teclado.nextLine();

        teclado.close();

        grande = cidade.toUpperCase();
        tam = cidade.length();
        firstCharacter = grande.charAt(0);

        System.out.println("\n------ ANALISANDO ------");
        System.out.println("\nVocê mora na cidade " + grande);
        System.out.println("\nA primeira letra é " + firstCharacter + " e a cidade contém " + tam + " caracteres");
        System.out.println("\n\n");
    }
}
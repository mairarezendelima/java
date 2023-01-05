package EstudonautaPortugol;

import java.util.Scanner;

public class Ex5 {

	public static void main(String[] args) {

        float n1, n2, m;
        
        Scanner teclado = new Scanner(System.in);

        System.out.print("Primeira nota: ");
        n1 = teclado.nextFloat();
        System.out.print("Segunda nota: ");
        n2 = teclado.nextFloat();
        
        m = (n1 + n2) / 2;

        System.out.println("---------- RESULTADOS ----------");
        System.out.println("As notas dos alunos foram: " + n1 + " e " + n2);
        System.out.printf("A média final foi: %.2f " , m);
        System.out.println("\n");
    }
}

package EstudonautaPortugol;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Ex59 {
    public static void main(String[] args) throws InterruptedException {
        int contaluno;
        float media, soma = 0.0f;
        float[] nota = new float[6];

        Scanner teclado = new Scanner(System.in);
        DecimalFormat deci = new DecimalFormat("0.00");

        System.out.println("---------------------------");
        System.out.println("     ESCOLA ESTUDONAUTA     ");
        System.out.println("---------------------------");
        for (contaluno = 1; contaluno < nota.length; contaluno++) {
            System.out.print("Nota do aluno " + contaluno + ": ");
            nota[contaluno] = teclado.nextFloat();
            soma += nota[contaluno];
        }
        media = soma / nota.length;
        System.out.println("---------------------------");
        System.out.print("A média da turma foi " + deci.format(media));
        System.out.println("\n---------------------------");
        Thread.sleep(500);

        System.out.print("Alunos que ficaram acima da média: ");
        for (contaluno = 0; contaluno < nota.length; contaluno++) {
            if (nota[contaluno] > media) {
                System.out.print(contaluno + "  ");
                Thread.sleep(500);
            }
        }
        System.out.println("\n\n");
    }
}

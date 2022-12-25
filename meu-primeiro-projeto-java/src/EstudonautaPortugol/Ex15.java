package EstudonautaPortugol;

import java.util.Calendar;
import java.util.Scanner;

public class Ex15 {
    public static void main(String[] args) {
        int anoNasc, idade, anoAtual;
        
        Scanner teclado = new Scanner(System.in);
        
        System.out.print("\nEm que ano você nasceu? ");
        anoNasc = teclado.nextInt();

        teclado.close();

        Calendar cal = Calendar.getInstance();
        //Calendar cal = GregorianCalendar.getInstance();
        anoAtual = cal.get(Calendar.YEAR);
        idade = anoAtual - anoNasc;
        
        System.out.println("Hoje, em " + anoAtual + ", você tem " + idade + " anos, certo? Seja bem-vindo ao Banco Estudonauta!");
        if (idade >= 65) {
            System.out.println("\n===== ATENÇÃO! DIRIJA-SE PARA A FILA PREFERENCIAL =====");
        }
        System.out.println("\n\n");
    }
}

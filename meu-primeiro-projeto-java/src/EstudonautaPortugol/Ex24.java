package EstudonautaPortugol;

import java.util.Scanner;

public class Ex24 {
    public static void main(String[] args) {
        String estado;
		
        Scanner teclado = new Scanner(System.in);
        
        System.out.print("Em que estado do Brasil você nasceu? ");
		estado = teclado.nextLine();

        estado = estado.toUpperCase();

        System.out.print("Nascendo no estado " + estado + ", você é");

        switch (estado) {
            case "AC" -> System.out.print(" acriano");
            case "AL" -> System.out.print(" alagoano");
            case "AP" -> System.out.print(" amapaense");
            case "BA" -> System.out.print(" baiano");
            case "CE" -> System.out.print(" cearense");
            case "DF" -> System.out.print(" brasiliense");
            case "ES" -> System.out.print(" capixaba");
            case "GO" -> System.out.print(" goiano");
            case "MA" -> System.out.print(" maranhense");
            case "MT" -> System.out.print(" mato-grossense");
            case "MS" -> System.out.print(" sul-mato-grossense");
            case "MG" -> System.out.print(" mineiro");
            case "PA" -> System.out.print(" paraense");
            case "PB" -> System.out.print(" paraibano");
            case "PR" -> System.out.print(" paranaense");
            case "PE" -> System.out.print(" pernambucano");
            case "PI" -> System.out.print(" piauiense");
            case "RJ" -> System.out.print(" fluminense");
            case "RN" -> System.out.print(" potiguar");
            case "RS" -> System.out.print(" gaucho");
            case "RO" -> System.out.print(" rondoniano");
            case "RR" -> System.out.print(" roraimense");
            case "SC" -> System.out.print(" catarinense");
            case "SP" -> System.out.print(" paulista");
            case "SE" -> System.out.print(" sergipano");
            case "TO" -> System.out.print(" tocantinense");
        }
        System.out.println("\n");
    }
}

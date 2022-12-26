package EstudonautaPortugol;

import java.util.Scanner;

public class Ex24 {
    public static void main(String[] args) {
        String estado;
		
        Scanner teclado = new Scanner(System.in);
        
        System.out.print("Em que estado do Brasil você nasceu? ");
		estado = teclado.nextLine();

        teclado.close();

        estado = estado.toUpperCase();

        System.out.print("Nascendo no estado " + estado + ", você é");

		switch(estado) {
            case "AC":
                System.out.print(" acriano");
                break;
            case "AL":
                System.out.print(" alagoano");
                break;
            case "AP":
                System.out.print(" amapaense");
                break;
            case "BA":
                System.out.print(" baiano");
                break;
            case "CE":
                System.out.print(" cearense");
                break;
            case "DF":
                System.out.print(" brasiliense");
                break;
            case "ES":
                System.out.print(" capixaba");
                break;
            case "GO":
                System.out.print(" goiano");
                break;
            case "MA":
                System.out.print(" maranhense");
                break;
            case "MT":
                System.out.print(" mato-grossense");
                break;
            case "MS":
                System.out.print(" sul-mato-grossense");
                break;
            case "MG":
                System.out.print(" mineiro");
                break;
            case "PA":
                System.out.print(" paraense");
                break;
            case "PB":
                System.out.print(" paraibano");
                break;
            case "PR":
                System.out.print(" paranaense");
                break;
            case "PE":
                System.out.print(" pernambucano");
                break;
            case "PI":
                System.out.print(" piauiense");
                break;
            case "RJ":
                System.out.print(" fluminense");
                break;
            case "RN":
                System.out.print(" potiguar");
                break;
            case "RS":
                System.out.print(" gaucho");
                break;
            case "RO":
                System.out.print(" rondoniano");
                break;
            case "RR":
                System.out.print(" roraimense");
                break;
            case "SC":
                System.out.print(" catarinense");
                break;
            case "SP":
                System.out.print(" paulista");
                break;
            case "SE":
                System.out.print(" sergipano");
                break;
            case "TO":
                System.out.print(" tocantinense");
                break;
        }
        System.out.println("\n\n");
    }
}

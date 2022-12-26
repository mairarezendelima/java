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

        System.out.println("Nascendo no estado " + estado + ", você é ");

		if (estado == "AC") {System.out.println("acriano");}
        else if (estado == "AL") {System.out.println("alagoano");}
        else if (estado == "AP") {System.out.println("amapaense");}
        else if (estado == "BA") {System.out.println("baiano");}
        else if (estado == "CE") {System.out.println("cearense");}
        else if (estado == "DF") {System.out.println("brasiliense");}
        else if (estado == "ES") {System.out.println("capixaba");}
        else if (estado == "GO") {System.out.println("goiano");}
        else if (estado == "MA") {System.out.println("maranhense");}
        else if (estado == "MT") {System.out.println("mato-grossense");}
        else if (estado == "MS") {System.out.println("sul-mato-grossense");}
        else if (estado == "MG") {System.out.println("mineiro");}
        else if (estado == "PA") {System.out.println("paraense");}
        else if (estado == "PB") {System.out.println("paraibano");}
        else if (estado == "PR") {System.out.println("paranaense");}
        else if (estado == "PE") {System.out.println("pernambucano");}
        else if (estado == "PI") {System.out.println("piauiense");}
        else if (estado == "RJ") {System.out.println("fluminense");}
        else if (estado == "RN") {System.out.println("potiguar");}
        else if (estado == "RS") {System.out.println("gaucho");}
        else if (estado == "RO") {System.out.println("rondoniano");}
        else if (estado == "RR") {System.out.println("roraimense");}
        else if (estado == "SC") {System.out.println("catarinense");}
        else if (estado == "SP") {System.out.println("paulista");}
        else if (estado == "SE") {System.out.println("sergipano");}
        else if (estado == "TO") {System.out.println("tocantinense");}
    }
}

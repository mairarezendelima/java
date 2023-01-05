package EstudonautaPortugol;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Ex8 {
    public static void main(String[] args) {
		float preco, pdesc, dif;
		
		Scanner teclado = new Scanner(System.in);
        DecimalFormat deci = new DecimalFormat("0.00");
        
        System.out.print("Qual é o preço do produto? R$ ");
        preco = teclado.nextFloat();
		
		pdesc = preco * 0.95f;
		dif = preco - pdesc;
		
		System.out.println("O produto custava R$ " + deci.format(preco));
		System.out.println("Com 5% de desconto, o produto sai por R$ " + deci.format(pdesc));
		System.out.println("Ao todo, teremos R$ " + deci.format(dif) + " de economia");
		System.out.println("\n");
    }
}

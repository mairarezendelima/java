package EstudonautaPortugol;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Ex14 {
    public static void main(String[] args) {
        float valor, desc, pago;
        
        Scanner teclado = new Scanner(System.in);
        DecimalFormat deci = new DecimalFormat("0.00");
        
        System.out.print("Qual foi o valor total das suas compras? R$ ");
        valor = teclado.nextFloat();

        desc = valor * 0.10f;
        pago = valor - desc;
        
        System.out.println("Você comprou R$ " + deci.format(valor) + " na nossa loja! Obrigado!");
        if (valor > 500) {
            System.out.println("===== ATENÇÃO =====");
            System.out.println("Por fazer mais de R$ 500,00 em compras, você vai receber R$ " + deci.format(desc) + " de desconto!");
            System.out.println("O valor a ser pago é de R$ " + deci.format(pago) + ". Volte sempre!");
        }
        System.out.println("\n");
    }
}

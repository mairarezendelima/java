package EstudonautaPortugol;

import java.text.DecimalFormat;
import java.util.Scanner;

public class PesoAltura {
    public static void main(String[] args) {
        float peso, altura, imc;

        Scanner teclado = new Scanner(System.in);
        DecimalFormat deci = new DecimalFormat("0.00");

        System.out.print("Qual é o seu peso? (Kg) ");
        peso = teclado.nextFloat();
        System.out.print("Qual é a sua altura? (m) ");
        altura = teclado.nextFloat();

        imc = peso / (altura * altura);

        System.out.print("O seu IMC é de " + deci.format(imc));

        if (imc < 18.5) {
            System.out.print("\nVocê está abaixo do peso normal!\n");
        } else if (18.5 <= imc && imc < 25) {
            System.out.print("\nParabéns! Você está na faixa de peso normal!\n");
        } else if (25 <= imc) {
            System.out.print("\nVocê está acima do peso normal!\n");
        }
    }
}

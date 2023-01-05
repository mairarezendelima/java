package EstudonautaPortugol;

public class Ex80 {
    static float mudapreco (float valor, int porc, char tipo) {
        float fim = valor;
        float fator = (valor * porc) / 100; // 1200 * 15/100 = 12 * 15 = 180

        if (tipo == 'A') {
            fim = valor + fator; // 1200 + 180 = 1380
        } else if (tipo == 'D') {
            fim = valor - fator; // 1200 - 180 = 1020
        }
        return fim;
    }

    public static void main(String[] args) {
        System.out.print("\n Aumento de 20%: R$" + mudapreco(1000, 20, 'A'));
        System.out.print("\n Desconto de 15%: R$" + mudapreco(1200, 15, 'D'));
    }
}

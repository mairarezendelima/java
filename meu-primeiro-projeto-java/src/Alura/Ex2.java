package Alura;

public class Ex2 {
    public static void main(String args[]) {
        for(int linha = 1; linha < 6; linha++) {
            for (int coluna = 1; coluna < 6; coluna++) {
                if (linha < coluna) { // enquanto a linha não for menor que a coluna, fica nesse loop
                    break; // sai do for da coluna e vai para o for da linha
                }
                System.out.print(coluna); // enquanto a linha não for menor que a coluna, fica nesse loop; ainda faz parte do for da coluna
            }
            System.out.println(); // pula linha
        }
        System.out.println();

        for(int linha = 0; linha < 5; linha++) {
            for (int coluna = 0; coluna < 5; coluna++) {
                if (linha < coluna) {
                    break;
                }
                System.out.print(coluna + 1);
            }
            System.out.println();
        }
    }
}

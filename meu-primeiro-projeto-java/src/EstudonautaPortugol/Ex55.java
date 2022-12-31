package EstudonautaPortugol;

public class Ex55 {
    public static void main(String[] args) throws InterruptedException {
        int[] vetor = new int[5];
        int posicao;

        vetor[0] = 3; // Primeira posição é 3

        // Preenche o vetor
        for (posicao = 1; posicao < vetor.length; posicao++) {
            vetor[posicao] = vetor[posicao-1] * 2; // vetor[1] = vetor[0] * 2 = 3 * 2 = 6
        }
        // Mostra o vetor na tela
        for (posicao = 0; posicao < vetor.length; posicao++) {
            System.out.print(vetor[posicao] + " ");
            Thread.sleep(500);
        }
        System.out.println("FIM!\n\n");
    }
}

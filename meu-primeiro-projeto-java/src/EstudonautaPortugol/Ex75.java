package EstudonautaPortugol;

public class Ex75 {
    static void analisar(int[] num) throws InterruptedException {
        System.out.print("===== ANALISANDO O VETOR =====");
        Thread.sleep(200);

        //Tamanho do vetor
        int tam = num.length;
        System.out.print("\nO vetor possui " + tam + " elementos");
        Thread.sleep(200);

        //Todos os elementos
        System.out.print("\nOs elementos são:\n");
        for (int p = 0; p < tam; p++) {
            System.out.print("[" + p + "]" + "-> " + num[p] + "  ");
            Thread.sleep(200);
        }
        Thread.sleep(200);

        //Valores pares
        System.out.print("\nValores pares nas posições: ");
        for (int p = 0; p < tam; p++) {
            if (num[p] % 2 == 0) {
                System.out.print(p + " ");
                Thread.sleep(200);
            }
        }
        Thread.sleep(200);

        //Valores ímpares
        System.out.print("\nValores ímpares nas posições: ");
        for (int p = 0; p < tam; p++) {
            if (num[p] % 2 == 1) {
                System.out.print(p + " ");
                Thread.sleep(200);
            }
        }
        System.out.print("\n==============================");
    }

    public static void main(String[] args) throws InterruptedException {
        int[] vet = {2, 8, 7, 4, 3, 1};

        analisar(vet);
    }
}

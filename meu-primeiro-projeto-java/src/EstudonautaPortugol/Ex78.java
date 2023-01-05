package EstudonautaPortugol;

public class Ex78 {
    static int maior(int[] vet) {
        int mai = vet[0];
        for (int pos = 1; pos < vet.length; pos++) {
            if (vet[pos] > mai) {
                mai = vet[pos];
            }
        }
        return mai;
    }

    public static void main(String[] args) throws InterruptedException {
        int[] num = {3, 7, 1, 4, 9, 6, 2};
        System.out.print("O maior valor que eu encontrei foi " + maior(num));
    }
}

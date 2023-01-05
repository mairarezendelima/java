package EstudonautaPortugol;

public class Ex73e74 {
    static void contagem(int ini, int fim, int passo) throws InterruptedException {
        System.out.print("---------- Contando de " + ini + " até " + fim + " ----------\n");
        if (passo < 0) {
            passo *= (-1);
        }
        if (ini <= fim) { // Ordem crescente
            for (int n = ini; n <= fim; n += passo) {
                System.out.print(n);
                Thread.sleep(200);
                System.out.print(" -> ");
                Thread.sleep(200);
            }
        }
        else { // Ordem decrescente
            for (int n = ini; n >= fim; n -= passo) {
                System.out.print(n);
                Thread.sleep(200);
                System.out.print(" -> ");
                Thread.sleep(200);
            }
        }
        System.out.print("FIM!\n\n");
    }

    public static void main(String[] args) throws InterruptedException {
        contagem(0, 10, 2);
        contagem(10, 50, 5);
        contagem(10, 2, 1);
        contagem(50, 0, -10);
    }
}

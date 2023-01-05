package EstudonautaPortugol;

public class Ex58 {
    public static void main(String[] args) throws InterruptedException {
        int passo;
        int[] valor = new int[15];

        valor[0] = 0;
        valor[1] = 1;
        System.out.println("Os 15 primeiros elementos de Fibonacci são: \n");
        for (passo = 2; passo < valor.length; passo++) {
            valor[passo] = valor[passo - 2] + valor[passo - 1]; // valor[2] = valor[0] + valor[1] = 0 + 1 = 1
        }
        for (passo = 0;  passo < valor.length; passo++) {
            System.out.println("[" + valor[passo] + "]  ");
            Thread.sleep(500);
        }
        System.out.println("\n");
    }
}

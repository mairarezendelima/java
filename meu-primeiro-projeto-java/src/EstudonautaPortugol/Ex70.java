package EstudonautaPortugol;

public class Ex70 {
    static void quadrado(int tam) throws InterruptedException {
        for (int l = 0; l <= tam; l++) {
            for (int c = 0; c <= tam; c++) {
                System.out.print("▄▄");
                Thread.sleep(50);
            }
            System.out.print("\n");
        }
        System.out.print(tam + " x " + tam + "\n\n");
    }
    public static void main(String[] args) throws InterruptedException {
        quadrado(4);
        quadrado(2);
        quadrado(5);
    }
}

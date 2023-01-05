package EstudonautaPortugol;

public class Ex69 {
    static void meuEscreva(String txt, int quant, int borda) throws InterruptedException {

        String faixa = switch (borda) {
            case 1 -> "+----------=====----------+\n";
            case 2 -> "----------:::::::----------\n";
            case 3 -> "<<<<<<<<<<------->>>>>>>>>>\n";
            default -> "";
        };
        System.out.print(faixa);

        for (int cont = 1; cont <= quant; cont++) {
            System.out.println(txt);
            Thread.sleep(300);
        }
        System.out.print(faixa);
    }
    public static void main(String[] args) throws InterruptedException {
        meuEscreva("Sou Estudonauta", 1, 1);
        meuEscreva("Estou aprendendo a programar", 3, 2);
        meuEscreva("E estou adorando", 2, 3);
        meuEscreva("Sucesso total!", 5, 0);
    }
}

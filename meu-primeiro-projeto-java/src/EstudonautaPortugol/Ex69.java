package EstudonautaPortugol;

public class Ex69 {
    public static void main(String[] args) throws InterruptedException {
        String faixa;
        int quant = 0, borda = 0;
        String txt = " ";

        switch (borda) {
            case 1:
            faixa = "+----------=====----------+\n";
            break;
            case 2:
            faixa = "----------:::::::----------\n";
            break;
            case 3:
            faixa = "<<<<<<<<<<------->>>>>>>>>>\n";
            break;
            default:
            faixa = "";
            break;
        }
        System.out.print(faixa);
        for (int cont = 1; cont <= quant; cont++) {
            System.out.print(txt + "\n");
            Thread.sleep(300);
        }
        System.out.print(faixa);
        System.out.print("Sou Estudonauta" + 1 + 1);
        System.out.print("Estou aprendendo a programar" + 3 + 2);
        System.out.print("E estou adorando" + 2 + 3);
        System.out.print("Sucesso total!" + 5 + 0);
    }
}

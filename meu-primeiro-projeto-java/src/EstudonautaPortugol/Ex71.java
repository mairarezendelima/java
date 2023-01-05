package EstudonautaPortugol;

public class Ex71 {
    static void linha(int tam) throws InterruptedException {
        for (int quant = 1; quant < tam; quant++) {
            System.out.print("-");
            Thread.sleep(50);
        }
        System.out.print("\n");
    }
    static void mensagem(String txt) throws InterruptedException {
        int tam = txt.length(); // tamanho da linha recebe o tamanho do texto
        linha(tam); // chamada do método linha()

        for (int letra = 0; letra < tam; letra++) {
            System.out.print(txt.substring(letra, (letra + 1))); // texto.substring(indice inicial, indice final)
            Thread.sleep(50);
        }
        linha(tam); // chamada do método linha()
    }
    public static void main(String[] args) throws InterruptedException {
        mensagem("Oi, tudo bem?\n");
        mensagem("Eu sou aluna do Estudonauta!\n");
        mensagem("Vou aprender a programar!\n");
    }
}

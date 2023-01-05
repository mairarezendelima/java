package EstudonautaPortugol;

public class Ex81 {
    static String situacao (float n) {
        if (n < 3) {
            return "Reprovado";
        } else if (n < 7) {
            return "em Recuperação";
        } else {
            return "Aprovado";
        }
    }
    static float media (float n1, float n2) {
        return (n1 + n2) / 2;
    }

    public static void main(String[] args) {
        float nota1 = 4.5f;
        float nota2 = 9.0f;
        System.out.print("Com as notas " + nota1 + " e " + nota2);
        System.out.print(", o aluno está " + situacao(media(nota1, nota2)));
    }
}

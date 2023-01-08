package HackerRank;
import java.util.Scanner;

public class Desafio2 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int i = scan.nextInt();
        double d = scan.nextDouble();

        scan.nextLine(); // É necessário colocar essa expressão antes, senão dá erro na hora de compilar a string, após o double
        String s = scan.nextLine();

        scan.close();

        System.out.println("String: " + s);
        System.out.println("Double: " + d);
        System.out.println("Int: " + i);
    }
}

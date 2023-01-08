package HackerRank;
import java.util.*;

public class Desafio1 {

    private static boolean isWeird(int n) {
        return (n % 2 != 0) || (n >= 6 && n <= 20);
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.print("Digite um número de 1 a 100: ");
        int N = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
        scanner.close();

        boolean weird = isWeird(N);
            if (weird) {
                System.out.println("Weird");
            } else {
                System.out.println("Not Weird");
            }
    }
}
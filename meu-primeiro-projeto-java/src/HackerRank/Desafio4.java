package HackerRank;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;



public class Desafio4 {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(bufferedReader.readLine().trim());

        bufferedReader.close();
        if (N >= 2 && N <= 20) {
            for (int c = 1; c <= 10; c++) {
                System.out.println(N + " x " + c + " = " + N * c);
            }
        }

    }
}

package HackerRank;
import java.util.*;
public class Desafio25 {

        public static void main(String[] args) {

            Scanner scan = new Scanner(System.in);
            int n = scan.nextInt();

            int[] a = new int[n];

            for(int j = 0; j < n; j++) {
                a[j] = scan.nextInt();
            }
            scan.close();

            // Prints each sequential element in array a
            int i = 0;
            while (i < a.length) {
                System.out.println(a[i]);
                i++;
            }
        }
    }

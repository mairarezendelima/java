package HackerRank;
import java.util.Scanner;
public class Desafio12 {

    public static String getSmallestAndLargest(String s, int k) {
        String smallest = s.substring(0, k);
        String largest = "";

        for (int index = 0; index <= s.length() - k; index++) {
            String subStr = s.substring(index, k + index);

            if (subStr.compareTo(smallest) < 0) {
                smallest = subStr;
            }
            if (subStr.compareTo(largest) > 0) {
                largest = subStr;
            }
        }
        return smallest + "\n" + largest;
    }


    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.next();
        int k = scan.nextInt();
        scan.close();

        System.out.println(getSmallestAndLargest(s, k));
    }
}

//An int value: 0 if the string is equal to the other string.
// < 0 if the string is lexicographically less than the other string
// > 0 if the string is lexicographically greater than the other string (more characters)
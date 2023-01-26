package HackerRank;
import java.io.*;
import java.util.*;
public class Desafio13 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String A = sc.next();
        String B = new StringBuilder(A).reverse().toString();
        System.out.println(B.equalsIgnoreCase(A)? "Yes" : "No");
        //System.out.println(new StringBuilder(A).reverse().toString().equalsIgnoreCase(A) ? "Yes" : "No");
    }
}

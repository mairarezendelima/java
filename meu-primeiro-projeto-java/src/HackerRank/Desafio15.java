package HackerRank;
import java.io.*;
import java.util.*;
public class Desafio15 {

        public static void main(String[] args) {
            Scanner scan = new Scanner(System.in);
            if(!scan.hasNext()){
                System.out.println(0);
            } else {
                String s = scan.nextLine();
                String[] tokens = s.trim().split("[ ,?'!_.@]+");
                System.out.println(tokens.length);
                for (String token : tokens) {
                    System.out.println(token);
                }
            }
            scan.close();
        }
}

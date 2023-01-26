package HackerRank;
import java.math.BigDecimal;
import java.util.*;
public class Desafio20 {

        public static void main(String []args){
            //Input
            Scanner sc= new Scanner(System.in);
            int n=sc.nextInt();
            String []s=new String[n+2];
            for(int i=0;i<n;i++){
                s[i]=sc.next();
            }
            sc.close();

            Arrays.sort(s, 0, n, (a, b) -> {
                        BigDecimal a1 = new BigDecimal(a);
                        BigDecimal b1 = new BigDecimal(b);
                        return b1.compareTo(a1);
                    }
            );

            //Output
            for(int i=0;i<n;i++)
            {
                System.out.println(s[i]);
            }
        }
    }


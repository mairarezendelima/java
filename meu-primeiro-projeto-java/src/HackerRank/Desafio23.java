/*
Pattern pattern = Pattern.compile("<(.+)>([\\w]+[^<]*)</(\\1)>");
group 0: <h1>   <(.+)> : <any word with more than zero to one>
group 1: </h1>  </(\\1)> : like group 1, but should start with /.
group 2: dentro da tag  ([^<]+) : all the words including number with more than zero
to one occurrance and does NOT start with <

*/
package HackerRank;
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;
public class Desafio23 {



        public static void main(String[] args){

            Scanner in = new Scanner(System.in);
            int testCases = Integer.parseInt(in.nextLine());
            while(testCases>0){
                String line = in.nextLine();

                boolean match = false;
                //Regular expression to match contents of the bold tags
                String regex = ("<(.+)>([^<]+)</\\1>");
                //Creating a pattern object
                Pattern pattern = Pattern.compile(regex);
                //Matching the compiled pattern in the String
                Matcher matcher = pattern.matcher(line);

                while (matcher.find()) {
                    System.out.println(matcher.group(2));
                    match = true;
                }
                if(!match) {
                    System.out.println("None");
                }

                testCases--;
            }
        }
    }


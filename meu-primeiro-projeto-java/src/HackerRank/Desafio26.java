package HackerRank;
import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;
public class Desafio26 {

        public static void max_Sum(List<List<Integer>> arr) {
            int max=Integer.MIN_VALUE;
            for (int j = 2; j < 6; j++) {
                for (int i = 2; i < 6; i++) {
                    int sum = arr.get(j-2).get(i-2)+arr.get(j-2).get(i-1)+arr.get(j-2).get(i)+arr.get(j-1).get(i-1)+arr.get(j).get(i-2)+arr.get(j).get(i-1)+arr.get(j).get(i);
                    if (sum>max){
                        max=sum;
                    }

                }
            }
            System.out.println(max);
        }
        public static void main(String[] args) throws IOException {
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

            List<List<Integer>> arr = new ArrayList<>();

            IntStream.range(0, 6).forEach(i -> {
                try {
                    arr.add(
                            Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
                                    .map(Integer::parseInt)
                                    .collect(toList())
                    );
                } catch (IOException ex) {
                    throw new RuntimeException(ex);
                }
            });

            bufferedReader.close();
            max_Sum(arr);
        }
    }


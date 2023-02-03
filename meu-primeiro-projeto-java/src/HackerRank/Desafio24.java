package HackerRank;
import java.io.*;
import java.util.*;
public class Desafio24 {

        public static void main(String[] args) {
            Integer[] array = {1, 2, 3};
            String[] str1 = {"Hello", "World"};

            print(array);
            print(str1);
        }
        public static <T> void print(T[] print){
            for(T item: print){
                System.out.println(item);
            }
        }
    }


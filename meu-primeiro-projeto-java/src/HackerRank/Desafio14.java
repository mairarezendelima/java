package HackerRank;
import java.util.Scanner;
import java.util.HashMap;
public class Desafio14 {
        static boolean isAnagram(String a, String b) {
            // test inicial para "no anagramas"
            if (a.length() != b.length())
                return false;

            a = a.toLowerCase();
            b = b.toLowerCase();

            // Mapa onde será guardada cada letra com a sua frequência
            HashMap<Character, Integer> map = new HashMap<>();

            for (int index = 0; index < b.length(); index++){
                char letter = b.charAt(index);
                Integer frequency = map.get(letter); // Integer: Wrapper class

                if(!map.containsKey(letter)){
                    map.put(letter, 1); // chave e valor
                } else {
                    map.put(letter, ++frequency);
                }
            }

            // testa cada letra do String contra o Mapa
            // se não contiver a letra ou a frequência for 0, return false
            // se a letra estiver lá, colocar a frequência em 1

            for (int index = 0; index < a.length(); index++){
                char letter = a.charAt(index);
                //Integer frequency = map.get(letter);

                if(!map.containsKey(letter))
                    return false;}

                /* if (frequency == 0)
                    return false;
                else
                    map.put(letter, --frequency);
            }*/
            // Se o programa chegar até aqui, são anagramas
            return true;}



        public static void main(String[] args) {

            Scanner scan = new Scanner(System.in);
            String a = scan.next();
            String b = scan.next();
            scan.close();
            boolean ret = isAnagram(a, b);
            System.out.println((ret) ? "Anagrams" : "Not Anagrams");
        }
    }

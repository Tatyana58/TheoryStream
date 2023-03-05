package Sort;

import java.util.*;
import java.util.stream.Collectors;

import static java.util.stream.Collectors.toMap;

public class Test7 {
    static Scanner in = new Scanner(System.in);
    static String massage;
    public static void main(String[] args) {
        String messageWord = "quick brown fox jumps over the lazy dog the the the";
        String[] words = messageWord.toLowerCase().replace("[-,.;:?!№@%^&*()_=+~`|]","").split("\\s");

        Map<String,Integer> mapWord = new HashMap<>();
        int number = 0;
        Integer max = 0;
        for (String word : words) {
            if (!word.isEmpty()) {
                Integer count = mapWord.get(word);
                if (count == null) {
                    count=0;
                }
                if (count >= max) {
                    mapWord.put(word, ++count);
                    max++;
                } else {
                    mapWord.put(word, ++count);
                }
                number++;
            }

        }
        System.out.println("макс = " + max);
        System.out.println("Всего " + number+ " слов в тексте");
        //for (int i = number; i < 1; i--) {

        for (String word : mapWord.keySet()) {
            //if (mapWord.get(word) == max) {
                System.out.println(mapWord.get(word) + " -  " + (word));

                max++;
            //}
        }


    }

    public static String input() {
        massage = String.valueOf(in.hasNext());
        return massage;
    }
}

import java.util.*;

public class Test8 {
    static Integer count;
    static Scanner in = new Scanner(System.in);
    public static void main(String[] args)  {
        //String messageWord = "quick brown fox jumps over the lazy dog the the the";
        System.out.print("Введите строку : ");
        String messageWord = in.nextLine();
        String[] words = messageWord.toLowerCase().replace("[-,.;:?!№@%^&*()_=+~` |]","").split("\\s");

        Map<String,Integer> mapWord = new TreeMap<>(Comparator.reverseOrder());
        for (String word : words) {
            if (!word.isEmpty()) {
                count = mapWord.get(word);
                if (count == null) {
                    count = 0;
                }
                mapWord.put(word, ++count);
            }
        }

        System.out.println(maxBy(count)-1);
        System.out.println("Всего " + words.length + " слов в тексте");
        for (String word : mapWord.keySet()) {
            System.out.println(mapWord.get(word) + " -  " + (word));
        }
        abstract class SortByName implements Comparator {
            @Override
            public int compare(Object o1, Object o2) {
                return 0;
            }
        }
        Map<List<String>, Integer> n = new TreeMap<List<String>, Integer>(new Comparator<List<String>>() {

            @Override
            public int compare(List<String> o1, List<String> o2) {
                String[] o3 = o1.get(0).split(", ");
                String[] o4 = o2.get(0).split(", ");
                return Integer.parseInt(o4[2].replace("]", "").trim()) - Integer.parseInt(o3[2].replace("]", "").trim());
            }

        });
        n.putAll(n);
        System.out.println(n);
    }
    private static int maxBy(Integer count) {
        count++;
        return count;
    }

}


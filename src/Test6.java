import java.util.HashMap;
import java.util.Map;

public class Test6 {
    public static void main(String[] args) {
        String message = "я ленивая задница, мне лень потратить 10 минут на решение простейшей задачи. Я ленивая задница ленивая задница лучше пойду поем.";
        String [] words = message.toLowerCase().replaceAll("[-.?!)(,:]", "").split("\\s");

        Map<String, Integer> counterMap = new HashMap<>();
        for (String word : words) {
            //Если не пусто то
            if(!word.isEmpty()) {

                Integer count = counterMap.get(word);
                if(count == null) {
                    count = 0;
                }
                counterMap.put(word, ++count);
            }
        }

        for(String word : counterMap.keySet()) {
            System.out.println(word + ": " + counterMap.get(word));
        }
    }
}

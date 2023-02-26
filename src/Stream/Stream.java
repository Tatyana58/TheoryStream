package Stream;

import java.util.ArrayList;
import java.util.List;

public class Stream {
    public static void main(String[] args) {
        // Создадим список и заполним его буквами не по алфавиту
        List<String> list = new ArrayList<String>();
        list.add("B");
        list.add("D");
        list.add("C");
        list.add("A");
        list.add("E");

        // Отсортируем список с помощью вложенных циклов и метода compareTo
        for (int i = 0; i < list.size(); i++) {
            for (int j = i + 1; j < list.size(); j++) {
                if (list.get(i).compareTo(list.get(j)) > 0) {
                    String temp = list.get(i);
                    list.set(i, list.get(j));
                    list.set(j, temp);
                }
            }
        }
        System.out.println("Мы отсортировали это специально для тебя: " + list);
    }
}
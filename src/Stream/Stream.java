package Stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

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

        ArrayList<String> elements = new ArrayList<>();

        elements.add("B");
        elements.add("D");
        elements.add("C");
        elements.add("A");
        elements.add("E");
        elements.add("E");

        // Создадим стрим для элементов
        ArrayList<String> sortedElements = elements.stream()
                .sorted()
                // Создаем коллектор, чтобы вывести данные в новый ArrayList.
                .collect(Collectors.toCollection(ArrayList::new));

        System.out.println("Мы отсортировали это специально для тебя: " + sortedElements);
    }
}

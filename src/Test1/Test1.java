package Test1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

public class Test1 {
    public static void main(String[] args) {

        int THRESHOLD = 5;

        // Создаем лист со значениями
        List<Integer> someList = Arrays.asList(1, 2, 3, 4, 5, 6, 0, 9, 4, null);

        // Используя stream

        // Создаем лист, куда должны попасть отфильтрованные значения, и стрим
        List<Integer> moreThanFive = someList.stream()
                .filter(Objects::nonNull)
                .filter(number -> number > THRESHOLD)
                // Далее мы выведем данные в новую коллекцию с помощью коллектора.
                // Что такое коллекторы, объясним в этом уроке.
                .collect(Collectors.toList());

        System.out.println(moreThanFive);

        // Не используя stream

        // Создаем новый пустой список
        List<Integer> filteredMoreThanFive = new ArrayList<>();
        // В цикле проверяем сначала элемент на null
        // А после добавляем в итоговый список при учете соблюдения критерия
        for (Integer integer: someList) {
            if (integer == null) {
                continue;
            }
            if (integer > THRESHOLD) {
                filteredMoreThanFive.add(integer);
            }
        }

        System.out.println(filteredMoreThanFive);
    }
}

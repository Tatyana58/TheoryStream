package Optional;

import java.util.HashMap;
import java.util.Map;

public class Test2 {
    public static void main(String[] args) {

        // Создаем 2 объекта класса User
        User user1 = new User("Ivan", 20);
        User user2 = new User("Oleg",43);

        // Создаем мапу, где ключ — число, значение — User
        Map<Integer, User> map = new HashMap<>();

        // Добавляем юзеров в мапу
        map.put(1, user1);
        map.put(2, user2);

        // Создаем нового юзера и присваиваем значение несуществующего ключа
        User user = map.get(3);

        // Проверяем на null
        // Если user не равен null, то сетим ему имя
        if (user != null) {
            user.setName("Igor");
            // В противном случае, создаем нового юзера и назначем имя ему
        } else {
            user = new User();
            user.setName("Igor");
        }
        System.out.println(user.getName());
        System.out.println(user1.getName());
        System.out.println(user2.getName());
    }
}

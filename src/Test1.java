import java.util.Optional;

public class Test1 {
    public static void main(String[] args) {

        // Создаем объект Optional
        Optional<String> optional = Optional.of("result of method");

        // Выводим значение в консоль
        optional.ifPresent(value -> System.out.println(value));

    }
}

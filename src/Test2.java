import java.util.Optional;

public class Test2 {
    public static void main(String[] args) {

        // Создаем пустой объект Optional
        Optional<String> optional = Optional.empty();

        // Создаем объект Optional и присваиваем ему значение
        Optional<String> optional2 = Optional.of("result of method");

        // В консоль будет выведено default string,
        // так как optional пустой
        System.out.println(optional.orElse("default string"));

        // В консоль будет выведено result of method,
        // так как optional2 имеет свое значение
        System.out.println(optional2.orElse("default string"));

    }
}

import java.util.Optional;

public class Test3 {
    // Вне метода main создадим статический метод createString
    public static String createString() {
        return "Random string";
    }

    public static void main(String[] args) {

        // Создаем пустой Optional
        Optional<String> optional = Optional.empty();
        // Будет вызван метод createString, так как optional пуст
        System.out.println(optional.orElseGet(() -> createString()));

    }
}

import java.util.Optional;

public class Test4 {
    public static void main(String[] args) {

        // Создаем Optional и назначаем ему значение 3
        Optional<Integer> optional = Optional.of(3);
        System.out.println(optional);

        // Создаем новый Optional и назначаем ему
        // значение первого, увеличенное на 1
        Optional<Integer> mappedOptional = optional.map(v -> v + 1);
        System.out.println(mappedOptional);
        // Создаем новый Optional и назначаем ему
        // значение первого, приведенное к классу String
        Optional<String> mappedOptional2 = optional.map(v -> v.toString());
        System.out.println(mappedOptional2);


    }
}

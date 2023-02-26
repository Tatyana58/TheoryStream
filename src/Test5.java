import java.util.Optional;

public class Test5 {
    public static void main(String[] args) {

        // Создаем Optional и назначаем ему значение 3
        Optional<Integer> optional = Optional.of(3);
        System.out.println(optional);

        // Создаем новый Optional и назначаем ему
        // значение первого, если оно кратно трем
        // аналог Optional.of(3);
        Optional<Integer> optional1 = optional.filter(e -> e % 3 == 0);
        System.out.println(optional1);

        // Создаем новый Optional и назначаем ему
        // значение первого, если оно кратно четырем
        // Аналог Optional.empty()
        Optional<Integer> optional2 = optional.filter(e -> e % 4 == 0);
        System.out.println(optional2);

    }
}

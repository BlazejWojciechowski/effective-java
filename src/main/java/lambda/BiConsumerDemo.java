package lambda;

import java.util.function.BiConsumer;

public class BiConsumerDemo {
    public static void main(String[] args) {
        BiConsumer<Integer, Long> cast = (x, y) -> System.out.println(x * y);

        int number1 = 100;
        long number2 = 3;

        cast.accept(number1, number2);
    }
}
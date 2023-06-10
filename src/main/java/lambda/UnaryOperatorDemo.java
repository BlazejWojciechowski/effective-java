package lambda;

import java.util.function.UnaryOperator;

public class UnaryOperatorDemo {
    public static void main(String[] args) {
        UnaryOperator<Integer> square = x -> x * x;

        int number = 100;
        System.out.println(square.apply(number));
    }
}

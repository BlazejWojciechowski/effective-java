package lambda;

import java.util.function.Function;

public class FunctionDemo {
    public static void main(String[] args) {
        Function<Integer, Long> times = x -> {
            if (x != 0 && x % 2 == 0)
                return (long) x * x;
            else
                return 123L;
        };
        long score;
        int number = 10;

        score = times.apply(number);

        System.out.println(score);

    }
}

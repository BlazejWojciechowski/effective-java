package lambda;

import java.util.function.BinaryOperator;

public class BinaryOperatorDemo {
    public static void main(String[] args) {
        BinaryOperator<Integer> summary = (x, y) -> x += y;

        int[] numbers = {10, 30, 40, 60, 80};
        int score = 0;

        for (int i : numbers) {
            score = summary.apply(score, i);
        }
        System.out.println(score);
    }
}

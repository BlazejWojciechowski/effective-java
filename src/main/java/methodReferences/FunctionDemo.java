package methodReferences;

import java.util.*;
import java.util.function.Function;

public class FunctionDemo {
    public static void main(String[] args) {
        Function<Collection<?>, List<?>> change = Arrays::asList;

        Set<Integer> numbers = new HashSet<>();
        numbers.add(5);
        numbers.add(10);
        numbers.add(20);

        List<?> num;
        num = change.apply(numbers);

        System.out.println(num);
    }
}
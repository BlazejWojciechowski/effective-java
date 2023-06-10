package lambda;

import java.util.*;
import java.util.function.Predicate;

public class PredicateDemo {
    public static void main(String[] args) {
        Predicate<Collection<?>> check = x -> x.isEmpty();

        Collection<String> col = new HashSet<>();

        System.out.println(check.test(col));
    }
}

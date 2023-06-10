package methodReferences;

import java.util.ArrayList;
import java.util.Collection;
import java.util.function.Predicate;

public class PredicateDemo {
    public static void main(String[] args) {
        Predicate<Collection<?>> check = Collection::isEmpty;
        Collection<Integer> col = new ArrayList<>();
        int number = 1290;
        col.add(number);

        System.out.println(check.test(col));
    }
}

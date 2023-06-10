package methodReferences.diffrentTypes;

import java.time.Instant;
import java.util.function.Consumer;

public class AssociatedType {
    public static void main(String[] args) {
        Consumer<Instant> cons = Instant.now()::isAfter;

        Instant inst = Instant.now();

        System.out.println(cons.andThen(instant -> inst.isAfter(instant)));
    }
}
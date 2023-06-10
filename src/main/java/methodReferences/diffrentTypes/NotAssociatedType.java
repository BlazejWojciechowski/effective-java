package methodReferences.diffrentTypes;

import java.util.function.Consumer;

public class NotAssociatedType {
    public static void main(String[] args) {
        Consumer<String> consumer = str -> System.out.println(str.toLowerCase());

        String word = "MASteR";

        consumer.accept(word);
    }
}
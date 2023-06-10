package methodReferences;

import java.util.Arrays;
import java.util.List;
import java.util.function.UnaryOperator;

public class UnaryOperatorDemo {
    public static void main(String[] args) {
        UnaryOperator<String> change = String::toLowerCase;

        List<String> words = Arrays.asList("KRZESLO", "StOlIk", "szaFA");

        for (String s : words)
            System.out.println(change.apply(s));
    }
}

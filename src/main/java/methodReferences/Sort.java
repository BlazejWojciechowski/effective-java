package methodReferences;

import java.util.Arrays;
import java.util.List;

public class Sort {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("Tomek", "Błażej", "Alan", "Zbyszek", "Mateusz");

        names.sort(String::compareToIgnoreCase);

        names.forEach(System.out::println);
    }
}

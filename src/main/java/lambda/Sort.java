package lambda;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Sort {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("Tomek", "Błażej", "Alan", "Zbyszek", "Mateusz");

        Collections.sort(names, (s1, s2) -> s1.compareToIgnoreCase(s2));


        names.forEach(s -> System.out.println(s));

    }
}
package simplePrograms;

import javax.swing.*;
import java.security.Key;
import java.util.*;
import java.util.Arrays;
import java.util.stream.Collectors;

public class ExerciseString {
    public static void main(String[] args) {
        String input;
        String input2;
        /* reverse
        input = JOptionPane.showInputDialog("Gimme some String value...");
        StringBuilder strb = new StringBuilder(input);
        System.out.println(strb.reverse());
         */

        /* without spaces
        input = JOptionPane.showInputDialog("Gimme something");
        System.out.println(input.replace(" ", ""));
         */

        /*
        input = JOptionPane.showInputDialog("Gimme some loooooong String");

        char[] inputChars = input.toCharArray();

        Map<Character, Integer> duplicatedChars = new HashMap<>();

        for (Character c : inputChars) {
            if (duplicatedChars.containsKey(c))
                duplicatedChars.put(c, duplicatedChars.get(c) + 1);
            else
                duplicatedChars.put(c, 1);
        }
                duplicatedChars.entrySet()
                .stream()
                .sorted(Map.Entry.comparingByValue(Comparator.reverseOrder()))
                .limit(1)
                .forEach(System.out::println);

         */

        /*
        Map<Character, Integer> sortedChars = duplicatedChars.entrySet()
                .stream()
                .sorted(Map.Entry.comparingByValue(Comparator.reverseOrder()))
                .collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue, (o1, o2) -> o1, LinkedHashMap::new));

        sortedChars.entrySet()
                .stream()
                .limit(1)
                .forEach(System.out::println);
         */

    }
}

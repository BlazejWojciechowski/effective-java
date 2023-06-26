package simplePrograms;

import javax.swing.*;
import java.util.*;

public class Duplicates {
    public static void main(String[] args) {
        /* char duplicates
        String input;
        input = JOptionPane.showInputDialog("Gimme something...");

        Map<Character, Integer> characterIntegerMap = new HashMap<>();

        char[] ch = input.toLowerCase().toCharArray();
        System.out.println(ch);

        for (Character c : ch) {
            if (characterIntegerMap.containsKey(c))
                characterIntegerMap.put(c, characterIntegerMap.get(c) + 1);
            else
                characterIntegerMap.put(c, 1);
        }

        Set<Character> duplicated = characterIntegerMap.keySet();
        int max = 0;
        char cMax = 'a';
        for (Character c : duplicated) {
            if (characterIntegerMap.get(c) > 1) {
                int count = characterIntegerMap.get(c);

                if (count >= max) {
                    max = characterIntegerMap.get(c);
                    cMax = c;
                }

                System.out.println(c + " is duplicated " + characterIntegerMap.get(c) + " times");
            }
        }
        System.out.println("Most duplicated char: " + cMax + " duplicated " + max + " times.");
         */
        /* arrays equals
        int[] num1 = {1,2,3,4,5};
        int[] num2 = {1,2,3,4,5};
        boolean status = true;

        if (num1.length == num2.length) {
            for (int i = 0; i < num1.length; i++) {
                if (num1[i] != num2[i]) {
                    status = false;
                    break;
                }
            }
        }
        else
            status = false;

        if (status)
            System.out.println("Arrays are equals");
        else
            System.out.println("Arrays are not equals");
         */
        /*
        String input = JOptionPane.showInputDialog("Gimme some long String");
        System.out.println(input);

        String copyOfInput = input.replaceAll(" ", "");

        char[] charsInput = copyOfInput.toLowerCase().toCharArray();

        Map<Character, Integer> countMap = new HashMap<>();

        for (Character c : charsInput) {
            if (countMap.containsKey(c))
                countMap.put(c, countMap.get(c) + 1);
            else
                countMap.put(c, 1);
        }

        System.out.println(countMap);

        countMap.entrySet()
                .stream().max(Map.Entry.comparingByValue())
                .ifPresent(System.out::println);
         */
        List<Integer> numbers = List.of(3, 8, 8, 4, 1, 6, 4, 8, 4, 8, 2, 5, 2, 8, 7, 4, 5, 4);
        Map<Integer, Integer> countMap = new LinkedHashMap<>();

        for (Integer i : numbers) {
            if (countMap.containsKey(i))
                countMap.put(i, countMap.get(i) + 1);
            else
                countMap.put(i, 1);
        }

        countMap.entrySet()
                .stream()
                .sorted(Map.Entry.comparingByValue(Comparator.reverseOrder()))
                .limit(1)
                .forEach(System.out::println);

    }
}

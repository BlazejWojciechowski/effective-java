package simplePrograms;

import javax.swing.*;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

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

    }
}

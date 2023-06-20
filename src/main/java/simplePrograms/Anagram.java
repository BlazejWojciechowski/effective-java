package simplePrograms;

import javax.swing.*;
import java.util.Arrays;

public class Anagram {
    public static void main(String[] args) {
        String input1;
        input1 = JOptionPane.showInputDialog("gimme first input...");
        String copyOf1 = input1.replace(" ", "");

        String input2;
        input2 = JOptionPane.showInputDialog("gimme second input...");
        String copyOf2 = input2.replace(" ", "");

        boolean status = true;

        if (copyOf1.length() == copyOf2.length()) {
            char[] input1Char = copyOf1.toLowerCase().toCharArray();
            char[] input2Char = copyOf2.toLowerCase().toCharArray();
            Arrays.sort(input1Char);
            Arrays.sort(input2Char);

            if (!(Arrays.equals(input1Char, input2Char)))
                status = false;
        }
        else
            status = false;

        if (status)
            System.out.println(input1 + " and " + input2 + " are anagrams.");
        else
            System.out.println(input1 + " and " + input2 + " are NOT anagrams.");
    }
}

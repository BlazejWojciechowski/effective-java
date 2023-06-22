package simplePrograms;

import javax.swing.*;
import java.util.Comparator;
import java.util.List;
import java.util.function.BiPredicate;
import java.util.function.BinaryOperator;
import java.util.function.Predicate;

public class Digits {
    public static void main(String[] args) {
        String input = JOptionPane.showInputDialog("Gimme some digit");
        /*
        int digit = Integer.parseInt(input);
        int sum = 0;
        int numOfDigits = String.valueOf(digit).length();

        for (int i = 0; i < numOfDigits; i++) {
            sum += digit % 10;
            digit /= 10;
        }

        JOptionPane.showMessageDialog(null, "Suma podanych cyfr to " + sum);
         */

        int binary = Integer.parseInt(input);
        int copyOfBinary = binary;
        int lastDigit;
        boolean isBinary = true;

        while (copyOfBinary != 0) {
            lastDigit = copyOfBinary % 10;
            if (lastDigit > 1) {
                isBinary = false;
                break;
            }
            else
                copyOfBinary /= 10;
        }

        if (isBinary)
            System.out.println(binary + " is a Binary");
        else
            System.out.println(binary + " is NOT a Binary");
    }
}
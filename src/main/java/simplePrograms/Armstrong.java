package simplePrograms;

import javax.swing.*;

public class Armstrong {
    public static void main(String[] args) {
        String input;
        input = JOptionPane.showInputDialog("gimme some Armstrong digit");
        int digit = Integer.parseInt(input);
        int copyOfDigit = digit;
        int numOfDigits = String.valueOf(digit).length();
        int sum = 0;

        while (digit != 0) {
            int lastDigit = digit % 10;
            int mathPow = 0;

            mathPow = (int) Math.pow(lastDigit, numOfDigits);

            sum += mathPow;

            digit = digit / 10;
        }

        if (sum == copyOfDigit)
            System.out.println(copyOfDigit + " is Armstrong digit.");
        else
            System.out.println(copyOfDigit + " is NOT Armstrong digit.");
    }
}

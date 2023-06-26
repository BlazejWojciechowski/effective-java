package simplePrograms;

import javax.swing.*;

public class Fibonacci {
    public static void main(String[] args) {
        String input = JOptionPane.showInputDialog("I check for you whether number belongs to Fibonacci series...");

        int inputNumber = Integer.parseInt(input);

        int firstTherm = 0;
        int secondTherm = 1;
        int thirdTherm = 0;

        while (thirdTherm < inputNumber) {
            thirdTherm = firstTherm + secondTherm;
            firstTherm = secondTherm;
            secondTherm = thirdTherm;
        }
        if (thirdTherm == inputNumber)
            JOptionPane.showMessageDialog(null, "Given number is a Fibonacci number.");
        else
            JOptionPane.showMessageDialog(null,"Given number is NOT Fibonacci number...");
    }
}

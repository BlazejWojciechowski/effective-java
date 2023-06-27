package simplePrograms;

import javax.swing.*;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.function.BiPredicate;
import java.util.function.BinaryOperator;
import java.util.function.Predicate;

public class Digits {
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

        /*
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
         */
        /*
        int number = Integer.parseInt(input);
        int rem = 0;
        String hex = "";

        char[] hexDecimals = {'0', '1', '2', '3', '4', '5', '6' , '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};

        while (number > 0) {
            rem = number % 16;
            hex = hexDecimals[rem] + hex;
            number /= 16;
        }

        System.out.println(hex);
         */

        /*
        String num = JOptionPane.showInputDialog("How many prime numbers you want?");
        int numOfPrimes = Integer.parseInt(num);
        String above = JOptionPane.showInputDialog("After which number?");
        int aboveNumber = Integer.parseInt(above);

        List<Integer> primeNum = new ArrayList<>();

        int counter = 0;
        int inputNumber = aboveNumber;

        while (counter < numOfPrimes) {
            if (isPrime(inputNumber)) {
                primeNum.add(inputNumber);
                counter++;
            }
            inputNumber++;
        }



        System.out.println(primeNum);

         */
        /*
        String input = JOptionPane.showInputDialog("Im gonna to check if given number is a Harshad...");

        int number = Integer.parseInt(input);
        int copyOfNumber = number;
        int sum = 0;

        while (number != 0) {
            int lastDigit = number % 10;
            sum += lastDigit;
            number /= 10;
        }
        if ((copyOfNumber % sum) == 0)
            System.out.println("Given number is a Harshad one...");
        else
            System.out.println("Given number is NOT a Harshad number...");
         */

    /*
    static boolean isPrime(int number) {
        boolean isPrime = true;

        if (number <= 1) {
            isPrime = false;
        }
        else  {
            for (int i = 2; i <= number / 2; i++) {
                if (number % i == 0) {
                    isPrime = false;
                    break;
                }
            }
        }
        return isPrime;
    }
     */
    public static void main(String[] args) {
        String input = JOptionPane.showInputDialog("How many Disarium numbers you want me to display?");
        int numOfDisariums = Integer.parseInt(input);

        String input2 = JOptionPane.showInputDialog("From which number you want me to start?");
        int startNumber = Integer.parseInt(input2);
        int counter = 0;

        List<Integer> disNumbers = new ArrayList<>();

        while (counter < numOfDisariums) {
            if (isDisariumNumber(startNumber)) {
                disNumbers.add(startNumber);
                counter++;
                startNumber++;
            }
            startNumber++;
        }
        System.out.println(disNumbers);
    }
    static boolean isDisariumNumber(int number) {
        int numOfNumber = Integer.toString(number).length();
        int sum = 0;
        int copyNum = number;

        while (number > 0) {
            int lastDigit = number % 10;
            sum += Math.pow(lastDigit, numOfNumber);
            number /= 10;

            numOfNumber--;
        }

        return sum == copyNum;
    }
}
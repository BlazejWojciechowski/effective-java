package simplePrograms;

import javax.swing.*;

public class Pyramids {
    public static void main(String[] args) {
        /*
        String input;
        int numRows;
        int rowCount = 1;
        input = JOptionPane.showInputDialog("In how many rows you wanna see a Pyramid?");
        numRows = Integer.parseInt(input);

        for (int i = numRows; i > 0; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= rowCount; j++) {
                System.out.print(rowCount+" ");
            }
            System.out.println();

            rowCount++;
        }
         */
        String input;
        int numRows;
        int rowCount = 1;
        input = JOptionPane.showInputDialog("In how many rows you wanna see a Stars?");
        numRows = Integer.parseInt(input);

        for (int i = numRows; i > 0; i--) {
            for (int j = 0; j <= i; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= rowCount; j++) {
                System.out.print("*");
                System.out.print(" ");
            }
            System.out.println();

            rowCount++;
        }
    }
}

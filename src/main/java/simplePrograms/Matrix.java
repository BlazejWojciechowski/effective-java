package simplePrograms;

import javax.swing.*;

public class Matrix {
    public static void main(String[] args) {
        int[][] matrix = {
                {6, 3, 1},
                {9, 7, 8},
                {2, 4, 5}};

        for (int i = 0; i < matrix.length; i++) {
            int rowMin = matrix[i][0];
            int colIndex = 0;
            boolean saddlePoint = true;

            for (int j = 1; j < matrix[i].length; j++) {
                if (rowMin > matrix[i][j]) {
                    rowMin = matrix[i][j];
                    colIndex = j;
                }
            }
            for (int j = 0; j < matrix.length; j++) {
                if (matrix[j][colIndex] > rowMin) {
                    saddlePoint = false;
                    break;
                }
            }
            if (saddlePoint)
                JOptionPane.showMessageDialog(null, "Saddle point: " + rowMin);
        }
    }
}

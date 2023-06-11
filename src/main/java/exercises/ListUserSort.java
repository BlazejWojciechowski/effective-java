package exercises;

import javax.swing.*;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class ListUserSort {
    final static int NAMES_NUM = 4;

    public static void main(String[] args) {
        List<String> names = new ArrayList<>();

        for (int i = 0; i < NAMES_NUM; i++) {
            String input = JOptionPane.showInputDialog("Podaj łańcuch znaków numer " + (i + 1));
            names.add(input);
        }
        System.out.println(names);

        //names.sort((n1, n2) -> (n1.length() - n2.length()));

        names.sort(Comparator.naturalOrder());
        System.out.println(names);

        names.sort(Comparator.comparingInt(String::length).reversed());
        System.out.println(names);

        names.sort(Comparator.comparingInt(String::hashCode));
        System.out.println(names);

    }
}
package simplePrograms;

import java.util.*;

public class Arrays {
    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>(List.of(3, 5, 7, 12, 85, 102, 43, 111));


        /*
        numbers.stream()
                .sorted(Comparator.reverseOrder())
                .skip(1)
                .limit(1)
                .forEach(System.out::println);
         */
        /*
        Integer[] inputArray1 = {2, 3, 4, 7, 1,5};

        Integer[] inputArray2 = {4, 1, 3, 5, 6, 5, 7};

        Integer[] inputArray3 = {8, 4, 6, 2, 1, 5, 7};

        Integer[] inputArray4 = {7, 9, 4, 1, 5, 8, 9, 7};

        intersection(inputArray1, inputArray2, inputArray3, inputArray4);

         */
    }
    /*
    static void intersection(Integer[]...inputArrays) {
        HashSet<Integer> intersectionSet = new HashSet<>(java.util.Arrays.asList(inputArrays[0]));

        for (Integer[] i : inputArrays)
            System.out.println(java.util.Arrays.toString(i));

        for (int i = 1; i < inputArrays.length; i++) {
            intersectionSet.retainAll(java.util.Arrays.asList(inputArrays[i]));
        }

        System.out.println(intersectionSet);
    }
     */
}
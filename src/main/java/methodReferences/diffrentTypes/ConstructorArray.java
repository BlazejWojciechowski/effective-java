package methodReferences.diffrentTypes;

import java.util.function.Function;

public class ConstructorArray {
    public static void main(String[] args) {
        Function<Integer, int[]> array = int[]::new;

        System.out.println(array.apply(5).length);
        int[] testArray;
        testArray = array.apply(10);
        testArray[5] = 10;
        System.out.println(testArray[1]);
        System.out.println(testArray[5]);
    }
}
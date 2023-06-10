package methodReferences.diffrentTypes;

import java.util.function.Function;

public class StaticType {
    public static void main(String[] args) {
        Function<String, Integer> convert = Integer::parseInt;

        String number = "100";

        System.out.println(convert.apply(number));
    }
}
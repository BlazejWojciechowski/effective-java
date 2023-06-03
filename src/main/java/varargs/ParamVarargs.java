package varargs;

import java.util.*;

public class ParamVarargs {

    static <T> List<T> flatten(List<List<? extends T>> lists) {
        List<T> result = new ArrayList<>();
        for (List<? extends T> list : lists)
            result.addAll(list);
        return result;
    }

    public static void main(String[] args) {
        List<String> strings = Arrays.asList("jeden", "dwa");
        List<String> colStrings = Arrays.asList("trzy", "cztery");
        List<String> newList;
        newList = flatten(List.of(strings, colStrings));
        for (String s : newList)
            System.out.println(s);
    }
}
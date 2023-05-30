package genericTypes;


import java.util.Arrays;
import java.util.Collection;

public class Demo {
    public static void main(String[] args) {
        Collection<String> strings = Arrays.asList("hello", "bye", "evening");
        Chooser<String> chooser = new Chooser<>(strings);
        System.out.println(chooser.choose());
    }
}

package genericTypes;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class UnionDemo {
    public static void main(String[] args) {
        UnionSum unionSum = new UnionSum();
        Set<String> guys = new HashSet<>(
                Arrays.asList("Darek", "Błażej", "Alan"));
        Set<String> stooges = new HashSet<>(
                Arrays.asList("Marek", "Lucek", "Antek"));
        Set<String> all = unionSum.union(guys,stooges);
        System.out.println(all);
    }
}

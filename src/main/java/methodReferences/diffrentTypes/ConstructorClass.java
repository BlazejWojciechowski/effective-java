package methodReferences.diffrentTypes;

import com.sun.jdi.Value;

import java.security.Key;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;
import java.util.function.Supplier;


public class ConstructorClass {
    public static void main(String[] args) {
        Supplier <Map<Integer, String>> map = TreeMap::new;

        Map<Integer, String> testMap1 = map.get();
        testMap1.put(1, "Alfa");
        testMap1.put(2, "Beta");

        Map<Integer, String> testMap2 = map.get();
        testMap2.put(3, "Gamma");
        testMap2.put(4, "Delta");

    }
}

package comparing.equalsHashcode;

import java.util.HashMap;
import java.util.Map;

public class DemoPhone {
    public static void main(String[] args) {
        short areaCode = 707;
        short pref = 907;
        short line = 8907;
        Map<PhoneNumber, String> m1 = new HashMap<>();
        m1.put(new PhoneNumber(areaCode, pref, line), "Justyna");

        Map<PhoneNumber, String> m2 = new HashMap<>();
        m2.put(new PhoneNumber(areaCode, pref, line), "Justyna");

        boolean status = m1.equals(m2);
        System.out.println(status);

        System.out.println(m1.hashCode());
        System.out.println(m2.hashCode());

        System.out.println(m1.toString());
        System.out.println(m2.toString());
    }
}
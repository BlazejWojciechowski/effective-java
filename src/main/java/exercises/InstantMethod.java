package exercises;

import java.util.function.BiPredicate;
import java.util.function.Predicate;

public class InstantMethod {

    public static void main(String[] args) {

        Object o1 = InstantService.sup.get();

        BiPredicate<Object, Object> eqMethodClass = Object::equals;
        System.out.println(eqMethodClass.test(o1, new Object()));


        Predicate<Object> eqMethod = o1::equals;
        System.out.println(eqMethod.test(new Object()));
    }
    /*
    @Override
    public boolean equals(Object obj) {
        return obj != null && obj.equals(InstantService.sup.get());
    }

     */
}
package methodReferences;

import java.math.BigInteger;
import java.util.Collection;
import java.util.HashSet;
import java.util.concurrent.ThreadLocalRandom;
import java.util.function.BinaryOperator;

public class BinaryOperatorDemo {
    public static void main(String[] args) {
        BinaryOperator<BigInteger> plus = BigInteger::add;

        Collection<BigInteger> numbers1 = new HashSet<>();
        Collection<BigInteger> numbers2 = new HashSet<>();

        for (int i = 0; i < 10; i++) {
            BigInteger rnd = BigInteger.valueOf(ThreadLocalRandom.current().nextInt());
            numbers1.add(rnd);
        }
        for (int i = 0; i < 10; i++) {
            BigInteger rnd = BigInteger.valueOf(ThreadLocalRandom.current().nextInt());
            numbers2.add(rnd);
        }
        for (BigInteger a : numbers1)
            for (BigInteger b : numbers2)
                System.out.println(plus.apply(a, b));
    }
}

package methodReferences;

import java.time.Instant;
import java.util.function.Supplier;

public class SupplierDemo {
    public static void main(String[] args) {
        Supplier<?> obj = Instant::now;

        Object o = obj.get();

        System.out.println(o.hashCode());
    }
}
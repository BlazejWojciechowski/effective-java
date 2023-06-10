package lambda;

import java.util.function.Supplier;

public class SupplierDemo {
    public static void main(String[] args) {
        Supplier<String> info = () -> "someInfos";

        System.out.println(info.get());
    }
}

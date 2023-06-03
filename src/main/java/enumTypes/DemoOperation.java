package enumTypes;

public class DemoOperation {
    public static void main(String[] args) {
        double x = 10;
        double y = 15;

        for (Operation op : Operation.values()) {
            System.out.printf("%f %s %f = %f%n",
                    x, op, y, op.apply(x, y));
        }
    }
}
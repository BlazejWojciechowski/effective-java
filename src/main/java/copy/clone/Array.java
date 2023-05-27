package copy.clone;

public class Array {
    private static final Thing[] PRIVATE_VALUES = new Thing[]{new Thing("Blazej", "lakowa")};

    public static final Thing[] values() {
        return PRIVATE_VALUES.clone();
    }

}

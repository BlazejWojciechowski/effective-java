package genericTypes;

import java.util.Collection;
import java.util.Objects;

public class CompareClass {
    public static <T extends Comparable<? super T>> T max(Collection<? extends T> c) {
        if (c.isEmpty())
            throw new IllegalArgumentException("Empty Collection");

        T result = null;
        for (T e : c)
            if (result == null || e.compareTo(result) > 0)
                result = Objects.requireNonNull(e);
        return result;
    }
}
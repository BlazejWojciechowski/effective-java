package exercises;

import java.util.function.Supplier;

public interface InstantService {
    Supplier<Object> sup = Object::new;
}

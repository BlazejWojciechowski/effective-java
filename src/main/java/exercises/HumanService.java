package exercises;

import java.util.function.BiFunction;

public interface HumanService {
    BiFunction<Integer, String, Human> supHUm = Human::new;
}

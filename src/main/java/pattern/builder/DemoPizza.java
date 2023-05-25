package pattern.builder;

import static pattern.builder.NyPizza.Size.SMALL;
import static pattern.builder.Pizza.Topping.*;

public class DemoPizza {
    public static void main(String[] args) {
        NyPizza pizza = new NyPizza.Builder(SMALL)
                .addTopping(SAUSAGE)
                .addTopping(ONION)
                .build();

        Calzone calzone = new Calzone.Builder()
                .addTopping(HAM)
                .sauceInside()
                .build();

    }
}

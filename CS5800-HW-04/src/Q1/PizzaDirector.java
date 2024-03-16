package Q1;

import java.util.List;

// Director class
class PizzaDirector {
    private PizzaBuilder builder;

    public PizzaDirector(PizzaBuilder builder) {
        this.builder = builder;
    }

    public Pizza constructPizza(String size, List<String> toppings, String chain) {
        return builder.setSize(size)
                .setToppings(toppings)
                .setChain(chain)
                .build();
    }
}


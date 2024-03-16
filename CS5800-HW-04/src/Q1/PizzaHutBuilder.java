package Q1;

import java.util.List;

// Concrete builder for Pizza Hut
class PizzaHutBuilder implements PizzaBuilder {
    private String size;
    private List<String> toppings;
    private String chain;

    @Override
    public PizzaBuilder setSize(String size) {
        this.size = size;
        return this;
    }

    @Override
    public PizzaBuilder setToppings(List<String> toppings) {
        this.toppings = toppings;
        return this;
    }

    @Override
    public PizzaBuilder setChain(String chain) {
        this.chain = chain;
        return this;
    }

    @Override
    public Pizza build() {
        if (size == null) {
            throw new IllegalStateException("Size is required");
        }
        return new Pizza(size, toppings, chain);
    }
}


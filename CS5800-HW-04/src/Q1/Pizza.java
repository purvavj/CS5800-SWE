package Q1;

import java.util.List;

// Product class
class Pizza {
    private String size;
    private List<String> toppings;
    private String chain;

    public Pizza(String size, List<String> toppings, String chain) {
        this.size = size;
        this.toppings = toppings;
        this.chain = chain;
    }

    public void eat() {
        System.out.println(chain + " Pizza - Size: " + size + ", Toppings: " + String.join(", ", toppings));
    }
}


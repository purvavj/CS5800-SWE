package Q1;

import java.util.List;

// Driver Class
public class PizzaDriver {
    public static void main(String[] args) {
        PizzaDirector director = new PizzaDirector(new PizzaHutBuilder());

        // Pizza Hut Pizzas
        try {
            // part1
            Pizza pizzaHutSmall = director.constructPizza("Small", List.of("Pepperoni", "Mushrooms", "Extra Cheese"), "Pizza Hut");
            pizzaHutSmall.eat();

            Pizza pizzaHutMedium = director.constructPizza("Medium", List.of("Pepperoni", "Mushrooms", "Extra Cheese", "Bacon", "Onions", "Peppers"), "Pizza Hut");
            pizzaHutMedium.eat();

            Pizza pizzaHutLarge = director.constructPizza("Large", List.of("Pepperoni", "Mushrooms", "Extra Cheese", "Bacon", "Onions", "Peppers", "Chicken", "Spinach"), "Pizza Hut");
            pizzaHutLarge.eat();


            // Part2
            Pizza pizzaHutLarge2 = director.constructPizza(("Large"), List.of("Mushrooms", "Onions", "Olives"), "Pizza Hut");
            Pizza pizzaHutSmall2 = director.constructPizza(("Small"), List.of("Spinach", "Extra Cheese"), "Pizza Hut");

            Pizza pizzaLittleCaesarsMedium = director.constructPizza(("Medium"), List.of("Pepperoni", "Mushrooms", "Extra Cheese", "Bacon", "Onions", "Peppers", "Chicken","Sausage"), "Little Caesars");
            Pizza pizzaLittleCaesarsSmall = director.constructPizza(("Small"), List.of("Mushrooms", "Extra Cheese", "Bacon", "Onions", "Chicken","Sausage"), "Little Caesars");

            Pizza pizzaDominosSmall = director.constructPizza(("Small"), List.of("Ham and Pineapple"), "Dominos");
            Pizza pizzaDominosLarge = director.constructPizza(("Small"), List.of("Pesto", "Extra Cheese", "Onions"), "Dominos");

            //Eating pizzas in part 2

            pizzaHutLarge2.eat();
            pizzaHutSmall2.eat();
            pizzaLittleCaesarsMedium.eat();
            pizzaLittleCaesarsSmall.eat();
            pizzaDominosSmall.eat();
            pizzaDominosLarge.eat();


        } catch (IllegalStateException e) {
            System.out.println("Error creating Pizza: " + e.getMessage());
        }
    }
}

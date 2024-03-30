import decoratorcode.*;

// Driver program
public class Driver {
    public static void main(String[] args) {
        // Create food items
        FoodItem risotto = new BaseFoodItem("Risotto", 9.0);
        FoodItem sideSalad = new BaseFoodItem("Side Salad", 3.5);

        // Add toppings
        FoodItem risottoWithParmesan = new AdditionalTopping(risotto, "Parmesan", 0.5);
        FoodItem risottoWithOnion = new AdditionalTopping(risotto, "Onion", 1.0);
        FoodItem risottoWithWhiteWineAndOnion = new AdditionalTopping(risottoWithOnion, "White Wine", 4);


        // Create order
        Order order = new Order();
        order.addItem(risottoWithWhiteWineAndOnion);
        order.addItem(sideSalad);
        order.addItem(risottoWithParmesan);

        // Calculate total cost
        double totalCost = order.calculateTotalCost();
        System.out.println("Total cost before discount: $" + totalCost);

        // Apply discount based on loyalty status
        LoyaltyStatus loyaltyStatus = new LoyaltyStatus(0.15); // 15% discount for example
        double discountedCost = loyaltyStatus.applyDiscount(totalCost);
        System.out.println("Total cost after discount: $" + discountedCost);
    }
}

package tests;

import decoratorcode.*;
import org.junit.Test;
import static org.junit.Assert.*;


public class RestaurantTest {

    @Test
    public void testBaseFoodItem() {
        FoodItem pizza = new BaseFoodItem("Pizza", 8.0);
        assertEquals(8.0, pizza.getCost(), 0.01);
    }

    @Test
    public void testAdditionalTopping() {
        FoodItem burger = new BaseFoodItem("Pizza", 8.0);
        FoodItem burgerWithCheese = new AdditionalTopping(burger, "Cheese", 1.0);
        assertEquals(9.0, burgerWithCheese.getCost(), 0.01);
    }

    @Test
    public void testOrder() {
        Order order = new Order();
        FoodItem burger = new BaseFoodItem("Pizza", 8.0);
        FoodItem fries = new BaseFoodItem("Coke", 2.5);
        order.addItem(burger);
        order.addItem(fries);
        assertEquals(10.5, order.calculateTotalCost(), 0.01);
    }

    @Test
    public void testLoyaltyStatus() {
        LoyaltyStatus loyaltyStatus = new LoyaltyStatus(0.1);
        assertEquals(90.0, loyaltyStatus.applyDiscount(100.0), 0.01);
    }
}

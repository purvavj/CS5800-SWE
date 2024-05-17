import java.time.LocalDateTime;
import java.util.List;

public class FoodOrder implements Order {
    private Customer customer;
    private Restaurant restaurant;
    private List<String> foodItems;
    private Driver driver;
    private LocalDateTime orderCreationTime;
    private LocalDateTime orderPickupTime;
    private LocalDateTime orderDeliveryTime;

    public FoodOrder(Customer customer, Restaurant restaurant, List<String> foodItems) {
        this.customer = customer;
        this.restaurant = restaurant;
        this.foodItems = foodItems;
        this.orderCreationTime = LocalDateTime.now();
    }

    @Override
    public void createOrder() {
        System.out.println("Order created: " + this);
    }

    @Override
    public void assignDriver(Driver driver) {
        this.driver = driver;
        this.orderPickupTime = LocalDateTime.now();
    }

    @Override
    public void completeOrder() {
        this.orderDeliveryTime = LocalDateTime.now();
        System.out.println("Order completed by driver " + driver.getName() + ": " + this);
    }

    // Setter method for orderCreationTime
    public void setOrderCreationTime(LocalDateTime orderCreationTime) {
        this.orderCreationTime = orderCreationTime;
    }

    @Override
    public String toString() {
        return "FoodOrder{customer=" + customer.getName() +
                ", restaurant=" + restaurant.getName() +
                ", foodItems=" + foodItems +
                ", orderCreationTime=" + orderCreationTime +
                ", orderPickupTime=" + orderPickupTime +
                ", orderDeliveryTime=" + orderDeliveryTime + '}';
    }
}

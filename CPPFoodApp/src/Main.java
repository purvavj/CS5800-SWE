import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        CPPFoodDelivery platform = CPPFoodDelivery.getInstance();

        // Register Users using UserFactory
        UserFactory userFactory = new UserFactory();

        // Register Restaurants
        Restaurant restaurant1 = (Restaurant) userFactory.createUser("restaurant", "Taco Palace", "123 Elm St", County.LA_COUNTY, "08:00-22:00", null);
        platform.registerUser(restaurant1);

        Restaurant restaurant2 = (Restaurant) userFactory.createUser("restaurant", "Sushi Place", "456 Oak St", County.ORANGE_COUNTY, "10:00-22:00", null);
        platform.registerUser(restaurant2);

        Restaurant restaurant3 = (Restaurant) userFactory.createUser("restaurant", "Pizza World", "789 Pine St", County.SAN_BERNARDINO_COUNTY, "11:00-23:00", null);
        platform.registerUser(restaurant3);

        Restaurant restaurant4 = (Restaurant) userFactory.createUser("restaurant", "Burger Town", "321 Maple St", County.LA_COUNTY, "09:00-21:00", null);
        platform.registerUser(restaurant4);

        // Register Drivers
        Driver driver1 = (Driver) userFactory.createUser("driver", "John Doe", "987 Apple St", County.LA_COUNTY, null, Shift.FIRST_SHIFT);
        platform.registerUser(driver1);

        Driver driver2 = (Driver) userFactory.createUser("driver", "Jane Smith", "654 Banana St", County.ORANGE_COUNTY, null, Shift.SECOND_SHIFT);
        platform.registerUser(driver2);

        Driver driver3 = (Driver) userFactory.createUser("driver", "Mike Brown", "321 Cherry St", County.SAN_BERNARDINO_COUNTY, null, Shift.THIRD_SHIFT);
        platform.registerUser(driver3);

        Driver driver4 = (Driver) userFactory.createUser("driver", "Lisa White", "159 Grape St", County.LA_COUNTY, null, Shift.FIRST_SHIFT);
        platform.registerUser(driver4);

        Driver driver5 = (Driver) userFactory.createUser("driver", "Paul Green", "753 Lemon St", County.ORANGE_COUNTY, null, Shift.SECOND_SHIFT);
        platform.registerUser(driver5);

        Driver driver6 = (Driver) userFactory.createUser("driver", "Sara Black", "852 Kiwi St", County.SAN_BERNARDINO_COUNTY, null, Shift.THIRD_SHIFT);
        platform.registerUser(driver6);

        Driver driver7 = (Driver) userFactory.createUser("driver", "Tom Blue", "951 Mango St", County.LA_COUNTY, null, Shift.FIRST_SHIFT);
        platform.registerUser(driver7);

        Driver driver8 = (Driver) userFactory.createUser("driver", "Eva Red", "456 Peach St", County.ORANGE_COUNTY, null, Shift.SECOND_SHIFT);
        platform.registerUser(driver8);

        // Register Customers
        Customer customer1 = (Customer) userFactory.createUser("customer", "Alice Green", "345 Willow St", County.LA_COUNTY, null, null);
        platform.registerUser(customer1);

        Customer customer2 = (Customer) userFactory.createUser("customer", "Bob Brown", "567 Birch St", County.ORANGE_COUNTY, null, null);
        platform.registerUser(customer2);

        Customer customer3 = (Customer) userFactory.createUser("customer", "Charlie Black", "789 Cedar St", County.SAN_BERNARDINO_COUNTY, null, null);
        platform.registerUser(customer3);

        Customer customer4 = (Customer) userFactory.createUser("customer", "David White", "123 Oak St", County.LA_COUNTY, null, null);
        platform.registerUser(customer4);

        Customer customer5 = (Customer) userFactory.createUser("customer", "Eve Blue", "456 Pine St", County.ORANGE_COUNTY, null, null);
        platform.registerUser(customer5);

        Customer customer6 = (Customer) userFactory.createUser("customer", "Frank Red", "789 Maple St", County.SAN_BERNARDINO_COUNTY, null, null);
        platform.registerUser(customer6);

        Customer customer7 = (Customer) userFactory.createUser("customer", "Grace Pink", "321 Apple St", County.LA_COUNTY, null, null);
        platform.registerUser(customer7);

        Customer customer8 = (Customer) userFactory.createUser("customer", "Hank Yellow", "654 Banana St", County.ORANGE_COUNTY, null, null);
        platform.registerUser(customer8);

        Customer customer9 = (Customer) userFactory.createUser("customer", "Ivy Cyan", "951 Mango St", County.SAN_BERNARDINO_COUNTY, null, null);
        platform.registerUser(customer9);

        Customer customer10 = (Customer) userFactory.createUser("customer", "Jack Magenta", "753 Lemon St", County.LA_COUNTY, null, null);
        platform.registerUser(customer10);

        platform.printRegisteredUsers();
        System.out.println();
        // Place Orders
        OrderFactory orderFactory = new OrderFactory();

        // Simulate placing an order after the restaurant's operating hours
        FoodOrder order = orderFactory.getOrder(customer3, restaurant1, Arrays.asList("Taco", "Burrito"));
        LocalDateTime currentTime = LocalDateTime.of(LocalDate.now(), LocalTime.of(22, 30)); // Time after restaurant closing hours (10:30 PM)
        order.setOrderCreationTime(currentTime);

        platform.placeOrder(order);
        System.out.println(); // Add a blank line for readability



        // Create a valid order
        FoodOrder validOrder = orderFactory.getOrder(customer4, restaurant4, Arrays.asList("Burger", "Fries"));
        customer4.placeOrder( validOrder );
        platform.placeOrder(validOrder);
        // Add more orders as needed for demonstration
    }
}

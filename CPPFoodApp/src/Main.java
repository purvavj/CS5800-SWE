import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.Arrays;


public class Main {
    public static void main(String[] args) {
        CPPFoodDelivery platform = CPPFoodDelivery.getInstance();

        // Register Restaurants
        Restaurant restaurant1 = (Restaurant) UserFactory.createUser("restaurant", "Taco Palace", "123 Elm St", "LA County", "8AM-10PM");
        platform.registerUser(restaurant1);

        Restaurant restaurant2 = (Restaurant) UserFactory.createUser("restaurant", "Sushi Place", "456 Oak St", "Orange County", "10AM-10PM");
        platform.registerUser(restaurant2);

        Restaurant restaurant3 = (Restaurant) UserFactory.createUser("restaurant", "Pizza World", "789 Pine St", "San Bernardino County", "11AM-11PM");
        platform.registerUser(restaurant3);

        Restaurant restaurant4 = (Restaurant) UserFactory.createUser("restaurant", "Burger Town", "321 Maple St", "LA County", "9AM-9PM");
        platform.registerUser(restaurant4);

        // Register Drivers
        Driver driver1 = (Driver) UserFactory.createUser("driver", "John Doe", "987 Apple St", "LA County", "8AM-4PM");
        platform.registerUser(driver1);

        Driver driver2 = (Driver) UserFactory.createUser("driver", "Jane Smith", "654 Banana St", "Orange County", "4PM-12AM");
        platform.registerUser(driver2);

        Driver driver3 = (Driver) UserFactory.createUser("driver", "Mike Brown", "321 Cherry St", "San Bernardino County", "12AM-8AM");
        platform.registerUser(driver3);

        Driver driver4 = (Driver) UserFactory.createUser("driver", "Lisa White", "159 Grape St", "LA County", "8AM-4PM");
        platform.registerUser(driver4);

        Driver driver5 = (Driver) UserFactory.createUser("driver", "Paul Green", "753 Lemon St", "Orange County", "4PM-12AM");
        platform.registerUser(driver5);

        Driver driver6 = (Driver) UserFactory.createUser("driver", "Sara Black", "852 Kiwi St", "San Bernardino County", "12AM-8AM");
        platform.registerUser(driver6);

        Driver driver7 = (Driver) UserFactory.createUser("driver", "Tom Blue", "951 Mango St", "LA County", "8AM-4PM");
        platform.registerUser(driver7);

        Driver driver8 = (Driver) UserFactory.createUser("driver", "Eva Red", "456 Peach St", "Orange County", "4PM-12AM");
        platform.registerUser(driver8);

        // Register Customers
        Customer customer1 = (Customer) UserFactory.createUser("customer", "Alice Green", "345 Willow St", "LA County", null);
        platform.registerUser(customer1);

        Customer customer2 = (Customer) UserFactory.createUser("customer", "Bob Brown", "567 Birch St", "Orange County", null);
        platform.registerUser(customer2);

        Customer customer3 = (Customer) UserFactory.createUser("customer", "Charlie Black", "789 Cedar St", "San Bernardino County", null);
        platform.registerUser(customer3);

        Customer customer4 = (Customer) UserFactory.createUser("customer", "David White", "123 Oak St", "LA County", null);
        platform.registerUser(customer4);

        Customer customer5 = (Customer) UserFactory.createUser("customer", "Eve Blue", "456 Pine St", "Orange County", null);
        platform.registerUser(customer5);

        Customer customer6 = (Customer) UserFactory.createUser("customer", "Frank Red", "789 Maple St", "San Bernardino County", null);
        platform.registerUser(customer6);

        Customer customer7 = (Customer) UserFactory.createUser("customer", "Grace Pink", "321 Apple St", "LA County", null);
        platform.registerUser(customer7);

        Customer customer8 = (Customer) UserFactory.createUser("customer", "Hank Yellow", "654 Banana St", "Orange County", null);
        platform.registerUser(customer8);

        Customer customer9 = (Customer) UserFactory.createUser("customer", "Ivy Cyan", "951 Mango St", "San Bernardino County", null);
        platform.registerUser(customer9);

        Customer customer10 = (Customer) UserFactory.createUser("customer", "Jack Magenta", "753 Lemon St", "LA County", null);
        platform.registerUser(customer10);

        platform.printRegisteredUsers();
        // Place Orders
        OrderFactory orderFactory = new OrderFactory();

        // Simulate placing an order after the restaurant's operating hours
        FoodOrder order = orderFactory.getOrder(customer3, restaurant1, Arrays.asList("Taco", "Burrito"));

        // Modify the current time to be after the restaurant's operating hours
        LocalDateTime currentTime = LocalDateTime.of(LocalDate.now(), LocalTime.of(22, 30)); // Time after restaurant closing hours (10:30 PM)
        order.setOrderCreationTime(currentTime);

        FoodOrder order1 = orderFactory.getOrder(customer1, restaurant1, Arrays.asList("Taco", "Burrito"));
        customer1.placeOrder(order1);
        order1.assignDriver(driver1);
        order1.completeOrder();

        FoodOrder order2 = orderFactory.getOrder(customer2, restaurant2, Arrays.asList("Sushi", "Ramen"));
        customer2.placeOrder(order2);
        order2.assignDriver(driver2);
        order2.completeOrder();

        // Add more orders as needed for demonstration
    }
}

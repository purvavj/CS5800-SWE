import java.util.ArrayList;
import java.util.List;

public class CPPFoodDelivery {
    private static CPPFoodDelivery instance;
    private List<User> customers = new ArrayList<>();
    private List<User> restaurants = new ArrayList<>();
    private List<User> drivers = new ArrayList<>();

    private CPPFoodDelivery() {}

    public static synchronized CPPFoodDelivery getInstance() {
        if (instance == null) {
            instance = new CPPFoodDelivery();
        }
        return instance;
    }

    public void registerUser(User user) {
        if (user instanceof Customer && !customers.contains(user)) {
            customers.add(user);
        } else if (user instanceof Restaurant && !restaurants.contains(user)) {
            restaurants.add(user);
        } else if (user instanceof Driver && !drivers.contains(user)) {
            drivers.add(user);
        }
    }

    public void printRegisteredUsers() {
        System.out.println("Registered Restaurants:");
        for (User restaurant : restaurants) {
            Restaurant r = (Restaurant) restaurant;
            System.out.println("Name: " + r.getName() + ", Operating Hours: " + r.getOperatingHours());
        }

        System.out.println("\nRegistered Drivers:");
        for (User driver : drivers) {
            System.out.println(((Driver) driver).getName());
        }

        System.out.println("\nRegistered Customers:");
        for (User customer : customers) {
            System.out.println(((Customer) customer).getName());
        }
    }
}

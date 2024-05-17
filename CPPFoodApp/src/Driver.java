import java.util.ArrayList;
import java.util.List;

public class Driver implements User, Observer {
    private String name;
    private String address;
    private String county;
    private String shift;
    private List<Order> orders = new ArrayList<>();

    public Driver(String name, String address, String county, String shift) {
        this.name = name;
        this.address = address;
        this.county = county;
        this.shift = shift;
        registerWithPlatform();
    }

    private void registerWithPlatform() {
        CPPFoodDelivery.getInstance().registerUser(this);
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public String getAddress() {
        return address;
    }

    public String getCounty() {
        return county;
    }

    public String getShift() {
        return shift;
    }

    @Override
    public void update(Order order) {
        orders.add(order);
        System.out.println("Driver " + name + " received a new order: " + order);
    }

    @Override
    public String toString() {
        return "Driver{name='" + name + "', county='" + county + "', shift='" + shift + "'}";
    }
}

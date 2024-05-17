import java.util.ArrayList;
import java.util.List;

public class Restaurant implements User, Observable {
    private String name;
    private String address;
    private String county;
    private String operatingHours;
    private List<Observer> observers = new ArrayList<>();

    public Restaurant(String name, String address, String county, String operatingHours) {
        this.name = name;
        this.address = address;
        this.county = county;
        this.operatingHours = operatingHours;
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

    public String getOperatingHours() {
        return operatingHours;
    }

    @Override
    public void addObserver(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        observers.remove(observer);
    }

    @Override
    public void notifyObservers() {
        for (Observer observer : observers) {
            observer.update(null);
        }
    }

    public void createOrder(Order order) {
        System.out.println("Restaurant " + name + " is processing the order: " + order);
        notifyObservers();
    }
}

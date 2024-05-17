public class Customer implements User {
    private String name;
    private String address;
    private String county;

    public Customer(String name, String address, String county) {
        this.name = name;
        this.address = address;
        this.county = county;
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

    public void placeOrder(Order order) {
        System.out.println( "Customer " + name + " is placing an order: " + order );
        order.createOrder();
    }
}

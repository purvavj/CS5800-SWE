public class UserFactory {
    public static User createUser(String type, String name, String address, String county, String additionalInfo) {
        switch (type.toLowerCase()) {
            case "customer":
                return new Customer(name, address, county);
            case "restaurant":
                return new Restaurant(name, address, county, additionalInfo);
            case "driver":
                return new Driver(name, address, county, additionalInfo);
            default:
                throw new IllegalArgumentException("Invalid user type");
        }
    }
}

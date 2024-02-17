public class CruiseShip extends Ship {
    private int maxPassengers;

    public CruiseShip(String name, String builtYear, int maxPassengers) {
        super(name, builtYear);
        this.maxPassengers = maxPassengers;
    }

    public int getMaxPassengers() {
        return maxPassengers;
    }

    public void setMaxPassengers(int maxPassengers) {
        this.maxPassengers = maxPassengers;
    }

    @Override
    public void print() {
        System.out.println("Cruise Ship Name: " + getName() + ", Maximum Passengers: " + maxPassengers);
    }
}

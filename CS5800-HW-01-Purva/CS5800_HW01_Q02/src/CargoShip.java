public class CargoShip extends Ship {
    private int cargoCapacity;

    public CargoShip(String name, String builtYear, int cargoCapacity) {
        super(name, builtYear);
        this.cargoCapacity = cargoCapacity;
    }

    public int getCargoCapacity() {
        return cargoCapacity;
    }

    public void setCargoCapacity(int cargoCapacity) {
        this.cargoCapacity = cargoCapacity;
    }

    @Override
    public void print() {
        System.out.println("Cargo Ship Name: " + getName() + ", Cargo Capacity: " + cargoCapacity + " tons");
    }
}

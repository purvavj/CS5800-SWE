public class ShipDemo {
    public static void main(String[] args) {
        Ship[] ships = new Ship[3];

        // Initialize the array elements with Ship, CruiseShip, and CargoShip objects
        ships[0] = new Ship("Going Merry", "1999");
        ships[1] = new CruiseShip("Thousand Sunny", "2005", 10000);
        ships[2] = new CargoShip("Moby Dikk", "1970", 50000);

        // Loop through the array, calling the print function for each element
        for (Ship ship : ships) {
            ship.print();
        }
    }
}

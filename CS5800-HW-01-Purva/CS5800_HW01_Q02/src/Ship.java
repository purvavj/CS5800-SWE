public class Ship {
    private final String name;
    private final String builtYear;

    public Ship(String name, String builtYear) {
        this.name = name;
        this.builtYear = builtYear;
    }

    public String getName() {
        return name;
    }

    public void print() {
        System.out.println("Ship Name: " + name + ", Year Built: " + builtYear);
    }
}

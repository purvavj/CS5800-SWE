package Q2;

class Carb implements Macronutrient {
    private final String name;

    public Carb(String name) {
        this.name = name;
    }

    @Override
    public String getName() {
        return name;
    }
}



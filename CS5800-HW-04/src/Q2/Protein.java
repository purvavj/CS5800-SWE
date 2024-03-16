package Q2;

class Protein implements Macronutrient {
    private final String name;

    public Protein(String name) {
        this.name = name;
    }

    @Override
    public String getName() {
        return name;
    }
}



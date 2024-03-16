package Q2;

class Fat implements Macronutrient {
    private final String name;

    public Fat(String name) {
        this.name = name;
    }

    @Override
    public String getName() {
        return name;
    }
}



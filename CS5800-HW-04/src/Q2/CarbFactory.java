package Q2;

import java.util.Arrays;
import java.util.List;
import java.util.Random;

// Singleton implemented here (within each CarbFactory, ProteinFactory, FatFactory)
class CarbFactory implements MacronutrientFactory {
    private static CarbFactory instance = null;
    private final List<String> carbOptions = Arrays.asList("Bread", "Lentils", "Pistachio");

    private CarbFactory() {}

    public static CarbFactory getInstance() {
        if (instance == null) {
            instance = new CarbFactory();
        }
        return instance;
    }

    @Override
    public Macronutrient getRandomMacronutrient(DietPlan dietPlan) {
        Random random = new Random();
        int index = random.nextInt(carbOptions.size());
        return new Carb(carbOptions.get(index));
    }
}



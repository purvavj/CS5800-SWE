package Q2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;


class FatFactory implements MacronutrientFactory {
    private static FatFactory instance = null;
    private final List<String> fatOptions = new ArrayList<>(Arrays.asList("Cheese", "Sour cream", "Avocado", "Peanuts"));

    private FatFactory() {}

    public static FatFactory getInstance() {
        if (instance == null) {
            instance = new FatFactory();
        }
        return instance;
    }

    public Macronutrient getRandomMacronutrient(DietPlan dietPlan) {
        if (dietPlan == DietPlan.PALEO || dietPlan == DietPlan.VEGAN) {
            List<String> restrictedFats = Arrays.asList("Cheese", "Sour cream");
            fatOptions.removeAll(restrictedFats);
        } else if (dietPlan == DietPlan.NUT_ALLERGY) {
            fatOptions.remove("Peanuts");
        }

        if (fatOptions.isEmpty()) {
            // If the list is empty, randomly choose from the original options
            fatOptions.addAll(Arrays.asList("Cheese", "Sour cream", "Avocado", "Peanuts"));
        }

        Random random = new Random();
        int index = random.nextInt(fatOptions.size());
        return new Fat(fatOptions.get(index));
    }
}



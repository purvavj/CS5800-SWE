package Q2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

class ProteinFactory implements MacronutrientFactory {
    private static ProteinFactory instance = null;
    private final List<String> proteinOptions = new ArrayList<>(Arrays.asList("Chicken", "Fish", "Beef", "Tofu"));

    private ProteinFactory() {}

    public static ProteinFactory getInstance() {
        if (instance == null) {
            instance = new ProteinFactory();
        }
        return instance;
    }

    public Macronutrient getRandomMacronutrient(DietPlan dietPlan) {
        if (dietPlan == DietPlan.PALEO) {
            proteinOptions.remove("Tofu");
        } else if (dietPlan == DietPlan.VEGAN) {
            proteinOptions.removeAll(Arrays.asList("Chicken", "Fish", "Beef"));
        }

        if (proteinOptions.isEmpty()) {
            // If the list is empty, randomly choose from the original options
            proteinOptions.addAll(Arrays.asList("Chicken", "Fish", "Beef", "Tofu"));
        }

        Random random = new Random();
        int index = random.nextInt(proteinOptions.size());
        return new Protein(proteinOptions.get(index));
    }
}



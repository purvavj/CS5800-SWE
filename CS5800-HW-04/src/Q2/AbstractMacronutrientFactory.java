package Q2;

// Abstract Factory implemented here
abstract class AbstractMacronutrientFactory {
    public abstract MacronutrientFactory getCarbFactory();

    public abstract MacronutrientFactory getProteinFactory();

    public abstract MacronutrientFactory getFatFactory();
}



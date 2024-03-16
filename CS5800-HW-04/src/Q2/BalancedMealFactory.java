package Q2;


class BalancedMealFactory extends AbstractMacronutrientFactory {

    @Override
    public MacronutrientFactory getCarbFactory() {
        return CarbFactory.getInstance();
    }

    @Override
    public MacronutrientFactory getProteinFactory() {
        return ProteinFactory.getInstance();
    }

    @Override
    public MacronutrientFactory getFatFactory() {
        return FatFactory.getInstance();
    }
}


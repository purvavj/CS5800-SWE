public interface DietaryRestrictionStrategy {
    boolean isAllowed(FoodOrder order);
}
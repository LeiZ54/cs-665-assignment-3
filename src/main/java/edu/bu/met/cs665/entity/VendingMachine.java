package edu.bu.met.cs665.entity;

public class VendingMachine {
    /**
     * Creates and configures a Beverage object based on the specified type and condiment counts.
     *
     * @param beverageType the type of beverage to be created (e.g., "Espresso", "Black Tea")
     * @param milkCount    the number of milk units to add to the beverage (must be between 0 and 3)
     * @param sugarCount   the number of sugar units to add to the beverage (must be between 0 and 3)
     * @return a configured Beverage object with the specified type, milk, and sugar counts
     * @throws IllegalArgumentException if the milkCount or sugarCount is not between 0 and 3
     */
    public Beverage getBeverage(String beverageType, Integer milkCount, Integer sugarCount) {
        Beverage beverage = BeverageFactory.generateBeverage(beverageType);

        if (milkCount > 3 || milkCount < 0) {
            throw new IllegalArgumentException("Milk count must be between 0 and 3!");
        }
        beverage.setMilkCount(milkCount);

        if (sugarCount > 3 || sugarCount < 0) {
            throw new IllegalArgumentException("Sugar count must be between 0 and 3!");
        }
        beverage.setSugarCount(sugarCount);

        return beverage;
    }
}


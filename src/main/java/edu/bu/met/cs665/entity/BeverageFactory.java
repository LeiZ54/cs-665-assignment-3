package edu.bu.met.cs665.entity;

public class BeverageFactory {
    public static Beverage generateBeverage(String beverageType) {
        switch (beverageType) {
            case "Espresso":
                return new Espresso();
            case "Americano":
                return new Americano();
            case "Latte":
                return new Latte();
            case "Macchiato":
                return new Macchiato();
            case "Black Tea":
                return new BlackTea();
            case "Green Tea":
                return new GreenTea();
            case "Yellow Tea":
                return new YellowTea();
            default:
                throw new IllegalArgumentException("Unknown beverage type: " + beverageType);
        }
    }
}

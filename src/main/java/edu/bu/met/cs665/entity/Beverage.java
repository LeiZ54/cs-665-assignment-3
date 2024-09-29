package edu.bu.met.cs665.entity;

/**
 * Beverage class represents a drink with customizable milk and sugar levels.
 * It provides functionality to set and get the number of milk and sugar units,
 * and calculates the total price based on the base price and the condiments.
 */
public class Beverage {
    String name;
    // The default price of one cup is 2.0
    Double price = 2.0;
    // The default per condiment price is 0.5
    Double condimentPrice = 0.5;
    private Integer milkCount;
    private Integer sugarCount;

    public void setMilkCount(Integer milkCount) {
        this.milkCount = milkCount;
    }

    public void setSugarCount(Integer sugarCount) {
        this.sugarCount = sugarCount;
    }

    public void setCondimentPrice(Double condimentPrice) {
        this.condimentPrice = condimentPrice;
    }

    public Double getPrice() {
        return price + condimentPrice * (milkCount + sugarCount);
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public String getDetails() {
        return name + " with " + milkCount + " milk and " + sugarCount + " sugar";
    }
}

package edu.bu.met.cs665.util;

import edu.bu.met.cs665.entity.*;

/**
 * CustomerFactory class provides a factory method to create instances
 * of different types of customers based on the specified type.
 * This class uses the Factory Pattern to encapsulate the creation logic.
 */
public class CustomerFactory {

    /**
     * Factory method to create a Customer instance based on the given type.
     * It returns an instance of a specific customer type (e.g., BusinessCustomer, VIPCustomer)
     * depending on the type provided.
     *
     * @param type The type of the customer (e.g., "business", "returning", "frequent", "new", "vip")
     * @param name The name of the customer
     * @return A Customer instance of the specified type
     * @throws IllegalArgumentException if the type is unknown or invalid
     */
    public static Customer createCustomer(String type, String name) {
        switch (type.toLowerCase()) {
            case "business":
                return new BusinessCustomer(name);
            case "returning":
                return new ReturningCustomer(name);
            case "frequent":
                return new FrequentCustomer(name);
            case "new":
                return new NewCustomer(name);
            case "vip":
                return new VIPCustomer(name);
            default:
                throw new IllegalArgumentException("Unknown customer type: " + type);
        }
    }
}

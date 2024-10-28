package edu.bu.met.cs665.entity;

/**
 * Abstract class representing a customer.
 * Each customer type extends this class
 */
public abstract class Customer {

    // Name of the customer
    protected String name;

    /**
     * Constructor to initialize a Customer with a name.
     *
     * @param name The name of the customer
     */
    public Customer(String name) {
        this.name = name;
    }

    /**
     * Abstract method to generate a customized email for the customer.
     *
     * @return A string representing the customized email content
     */
    public abstract String generateEmail();
}

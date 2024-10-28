package edu.bu.met.cs665.entity;

/**
 * ReturningCustomer class represents a customer of type "Returning".
 */
public class ReturningCustomer extends Customer {

    /**
     * Constructor to create a ReturningCustomer instance with a name.
     *
     * @param name The name of the returning customer
     */
    public ReturningCustomer(String name) {
        super(name); // Call the superclass constructor to initialize the customer's name
    }

    /**
     * Generates a customized email for the returning customer.
     * Overrides the abstract generateEmail method in the Customer class.
     *
     * @return A string representing the customized email content for returning customers
     */
    @Override
    public String generateEmail() {
        return "Welcome back, " + name + "! We appreciate your continued loyalty.";
    }
}

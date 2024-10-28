package edu.bu.met.cs665.entity;

/**
 * NewCustomer class represents a customer of type "New".
 */
public class NewCustomer extends Customer {

    /**
     * Constructor to create a NewCustomer instance with a name.
     *
     * @param name The name of the new customer
     */
    public NewCustomer(String name) {
        super(name); // Call the superclass constructor to initialize the customer's name
    }

    /**
     * Generates a customized email for the new customer.
     * Overrides the abstract generateEmail method in the Customer class.
     *
     * @return A string representing the customized email content for new customers
     */
    @Override
    public String generateEmail() {
        return "Welcome " + name + "! Thank you for joining our community.";
    }
}

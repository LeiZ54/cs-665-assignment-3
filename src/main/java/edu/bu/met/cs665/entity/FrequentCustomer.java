package edu.bu.met.cs665.entity;

/**
 * FrequentCustomer class represents a customer of type "Frequent".
 */
public class FrequentCustomer extends Customer {

    /**
     * Constructor to create a FrequentCustomer instance with a name.
     *
     * @param name The name of the frequent customer
     */
    public FrequentCustomer(String name) {
        super(name); // Call the superclass constructor to initialize the customer's name
    }

    /**
     * Generates a customized email for the frequent customer.
     * Overrides the abstract generateEmail method in the Customer class.
     *
     * @return A string representing the customized email content for frequent customers
     */
    @Override
    public String generateEmail() {
        return "Hello " + name + ", thanks for being one of our frequent customers!";
    }
}

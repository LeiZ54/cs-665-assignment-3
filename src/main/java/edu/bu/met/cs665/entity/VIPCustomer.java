package edu.bu.met.cs665.entity;

/**
 * VIPCustomer class represents a customer of type "VIP".
 */
public class VIPCustomer extends Customer {

    /**
     * Constructor to create a VIPCustomer instance with a name.
     *
     * @param name The name of the VIP customer
     */
    public VIPCustomer(String name) {
        super(name); // Call the superclass constructor to initialize the customer's name
    }

    /**
     * Generates a customized email for the VIP customer.
     * Overrides the abstract generateEmail method in the Customer class.
     *
     * @return A string representing the customized email content for VIP customers
     */
    @Override
    public String generateEmail() {
        return "Dear VIP " + name + ", we are honored to serve you with exclusive offers.";
    }
}

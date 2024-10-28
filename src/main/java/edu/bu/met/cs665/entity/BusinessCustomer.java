package edu.bu.met.cs665.entity;

/**
 * BusinessCustomer class represents a customer of type "Business".
 */
public class BusinessCustomer extends Customer {

    /**
     * Constructor to create a BusinessCustomer instance with a name.
     *
     * @param name The name of the business customer
     */
    public BusinessCustomer(String name) {
        super(name); // Call the superclass constructor to initialize the customer's name
    }

    /**
     * Generates a customized email for the business customer.
     * Overrides the abstract generateEmail method in the Customer class.
     *
     * @return A string representing the customized email content for business customers
     */
    @Override
    public String generateEmail() {
        return "Dear " + name + ", thank you for being a valued business partner.";
    }
}

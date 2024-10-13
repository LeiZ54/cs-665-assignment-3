package edu.bu.met.cs665.entity;

/**
 * TaxiDriver class represents a specific type of driver who uses a taxi for deliveries.
 * It extends the abstract Driver class and implements the update method to handle
 * delivery notifications for taxi drivers.
 */
public class TaxiDriver extends Driver {

    /**
     * Constructor to create a TaxiDriver instance with the driver's name.
     *
     * @param name The name of the taxi driver
     */
    public TaxiDriver(String name) {
        super(name); // Call the constructor of the superclass Driver
    }

    /**
     * Implementation of the update method to notify the taxi driver about a new delivery request.
     * This method overrides the abstract method in the Driver class and returns a notification
     * message specific to taxi drivers.
     *
     * @param deliveryRequest The delivery request that contains details about the order
     * @return A string that confirms the taxi driver has been notified of the delivery request
     */
    @Override
    public String notify(DeliveryRequest deliveryRequest) {
        // Return a message that includes the driver's name and delivery request details
        return "Taxi Driver " + name + " notified of delivery request: " + deliveryRequest.getDetails();
    }
}

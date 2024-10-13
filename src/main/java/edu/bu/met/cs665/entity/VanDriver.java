package edu.bu.met.cs665.entity;

/**
 * VanDriver class represents a specific type of driver who uses a van for deliveries.
 * It extends the abstract Driver class and implements the update method to handle
 * delivery notifications for van drivers.
 */
public class VanDriver extends Driver {

    /**
     * Constructor to create a VanDriver instance with the driver's name.
     *
     * @param name The name of the van driver
     */
    public VanDriver(String name) {
        super(name); // Call the constructor of the superclass Driver
    }

    /**
     * Implementation of the update method to notify the van driver about a new delivery request.
     * This method overrides the abstract method in the Driver class and returns a notification
     * message specific to van drivers.
     *
     * @param deliveryRequest The delivery request that contains details about the order
     * @return A string that confirms the van driver has been notified of the delivery request
     */
    @Override
    public String notify(DeliveryRequest deliveryRequest) {
        // Return a message that includes the driver's name and delivery request details
        return "Van Driver " + name + " notified of delivery request: " + deliveryRequest.getDetails();
    }
}

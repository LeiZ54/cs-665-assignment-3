package edu.bu.met.cs665.entity;

/**
 * Abstract class representing a delivery driver.
 * The Driver class is used as a base class for different types of delivery drivers,
 * such as VanDriver, TaxiDriver, and ScooterDriver. Each driver can be notified
 * of a delivery request.
 */
public abstract class Driver {

    // Name of the driver
    protected String name;

    /**
     * Constructor to initialize a driver with their name.
     *
     * @param name The name of the driver
     */
    public Driver(String name) {
        this.name = name;
    }

    /**
     * Abstract method that must be implemented by concrete driver classes.
     * This method is used to notify the driver about a new delivery request.
     * Each driver type can implement their own logic to handle the notification.
     *
     * @param deliveryRequest The delivery request that needs to be processed by the driver
     * @return A string that confirms the driver has been notified of the delivery request
     */
    public abstract String notify(DeliveryRequest deliveryRequest);

    /**
     * Getter method to retrieve the name of the driver.
     *
     * @return The name of the driver
     */
    public String getName() {
        return name;
    }
}

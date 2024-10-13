package edu.bu.met.cs665.entity;

import java.util.ArrayList;
import java.util.List;

/**
 * The Shop class represents a store that manages delivery requests and drivers.
 * The shop can register drivers, remove drivers, and notify all registered drivers
 * when a new delivery request is created.
 */
public class Shop {

    // List to store the registered Driver objects
    private final List<Driver> drivers;

    /**
     * Constructor for the Shop class.
     * Initializes an empty list of drivers.
     */
    public Shop() {
        this.drivers = new ArrayList<>(); // Initialize the list of drivers as an empty ArrayList
    }

    /**
     * Method to register a driver to the shop.
     * When a driver is registered, they will receive notifications about delivery requests.
     *
     * @param driver The driver to register
     */
    public void registerDriver(Driver driver) {
        drivers.add(driver);  // Add the driver to the list
        System.out.println(driver.getName() + " has been registered.");  // Print confirmation
    }

    /**
     * Method to remove a driver from the shop.
     * After a driver is removed, they will no longer receive notifications about delivery requests.
     *
     * @param driver The driver to remove
     */
    public void removeDriver(Driver driver) {
        drivers.remove(driver);  // Remove the driver from the list
        System.out.println(driver.getName() + " has been removed.");  // Print confirmation
    }

    /**
     * Method to notify all registered drivers about a new delivery request.
     * This method sends the delivery request to each registered driver and collects
     * the notification messages that are returned by each driver.
     *
     * @param deliveryRequest The delivery request containing details of the order
     * @return A list of strings where each string is a notification message confirming
     *         that a driver has received the delivery request
     */
    public List<String> notifyDrivers(DeliveryRequest deliveryRequest) {
        List<String> notifications = new ArrayList<>();  // Create a list to store notification messages
        for (Driver driver : drivers) {
            // Notify each driver and collect their notification messages
            notifications.add(driver.notify(deliveryRequest));
        }
        return notifications;  // Return the list of notifications
    }
}

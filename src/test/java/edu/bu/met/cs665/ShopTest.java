package edu.bu.met.cs665;

import edu.bu.met.cs665.entity.*;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertEquals;

/**
 * This class represents unit tests for the Shop class.
 * It tests the functionality of registering, removing, and notifying drivers when a delivery request is made.
 */
public class ShopTest {

    // Shop instance used for testing
    private Shop shop;
    // Create a list to store the drivers
    List<Driver> drivers = new ArrayList<>();

    /**
     * This method is annotated with @Before, which means it runs before each test case.
     * It sets up the initial conditions for the tests, creating a Shop instance and registering 5 different drivers.
     */
    @Before
    public void setup() {
        shop = new Shop();  // Create a new Shop instance

        // Add different types of drivers to the list
        VanDriver john = new VanDriver("John");
        TaxiDriver mike = new TaxiDriver("Mike");
        ScooterDriver anna = new ScooterDriver("Anna");
        VanDriver tom = new VanDriver("Tom");
        TaxiDriver jane = new TaxiDriver("Jane");
        drivers.add(john);
        drivers.add(mike);
        drivers.add(anna);
        drivers.add(tom);
        drivers.add(jane);

        // Register each driver to the shop so they can receive notifications
        for (Driver driver : drivers) {
            shop.registerDriver(driver);
        }
    }

    /**
     * This test method verifies that when a delivery request is made,
     * all registered drivers receive the correct notification.
     * It checks the size of the notifications list and ensures the correct notification messages are sent.
     */
    @Test
    public void testDriverNotification() {
        // Create a new delivery request
        DeliveryRequest deliveryRequest = new DeliveryRequest("testOrder", "123 Commonwealth Ave");

        // Notify drivers of the delivery request and capture the notification messages
        List<String> notifications = shop.notifyDrivers(deliveryRequest);

        // Assert that 5 drivers received notifications
        assertEquals(5, notifications.size());

        // Assert that each driver received the correct notification message
        assertEquals("Van Driver John notified of delivery request: Order ID: testOrder, Address: 123 Commonwealth Ave", notifications.get(0));
        assertEquals("Taxi Driver Mike notified of delivery request: Order ID: testOrder, Address: 123 Commonwealth Ave", notifications.get(1));
        assertEquals("Scooter Driver Anna notified of delivery request: Order ID: testOrder, Address: 123 Commonwealth Ave", notifications.get(2));
        assertEquals("Van Driver Tom notified of delivery request: Order ID: testOrder, Address: 123 Commonwealth Ave", notifications.get(3));
        assertEquals("Taxi Driver Jane notified of delivery request: Order ID: testOrder, Address: 123 Commonwealth Ave", notifications.get(4));
    }

    /**
     * This test method verifies that after a driver is removed from the shop,
     * the driver no longer receives notifications about delivery requests.
     * It checks the size of the notifications list after one driver is removed.
     */
    @Test
    public void testRemoveDriver() {
        // Remove the first driver (John) from the list of registered drivers
        shop.removeDriver(drivers.get(0));

        // Create a new delivery request
        DeliveryRequest deliveryRequest = new DeliveryRequest("testOrder", "123 Commonwealth Ave");

        // Notify drivers of the delivery request and capture the notification messages
        List<String> notifications = shop.notifyDrivers(deliveryRequest);

        // Assert that 4 drivers received notifications after one driver is removed
        assertEquals(4, notifications.size());
    }

    /**
     * This test method verifies that after a driver is registered to the shop again,
     * they will receive notifications about delivery requests.
     * It checks the size of the notifications list after one driver is registered again.
     */
    @Test
    public void testRegisterDriver() {
        // Re-register the first driver (John) back to the shop
        shop.registerDriver(drivers.get(0));

        // Create a new delivery request
        DeliveryRequest deliveryRequest = new DeliveryRequest("testOrder", "123 Commonwealth Ave");

        // Notify drivers of the delivery request and capture the notification messages
        List<String> notifications = shop.notifyDrivers(deliveryRequest);

        // Assert that 6 drivers received notifications after one driver is registered again
        assertEquals(6, notifications.size());
    }
}

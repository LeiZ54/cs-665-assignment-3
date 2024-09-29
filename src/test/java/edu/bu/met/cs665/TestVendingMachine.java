package edu.bu.met.cs665;

import edu.bu.met.cs665.entity.Beverage;
import edu.bu.met.cs665.entity.VendingMachine;
import org.junit.Test;

import static org.junit.Assert.*;

public class TestVendingMachine {
    @Test
    public void testGetEspresso() {
        VendingMachine machine = new VendingMachine();
        // Generate an Espresso with no milk and no sugar
        Beverage espresso = machine.getBeverage("Espresso", 0, 0);
        // Then we will get the details equals to "Espress o with 0 milk and 0 sugar"
        assertEquals("Espresso with 0 milk and 0 sugar", espresso.getDetails());
        // and the price is 2.0
        assertEquals(2.0, espresso.getPrice(), 0.01);
    }

    @Test
    public void testGetBlackTea() {
        VendingMachine machine = new VendingMachine();
        // Generate an Espresso with no milk and no sugar
        Beverage espresso = machine.getBeverage("Black Tea", 3, 1);
        // Then we will get the details equals to "Black Tea with 3 milk and 1 sugar"
        assertEquals("Black Tea with 3 milk and 1 sugar", espresso.getDetails());
        // and the price is 4.0
        assertEquals(4.0, espresso.getPrice(), 0.01);
    }

    @Test
    public void testMilkMoreThan3() {
        VendingMachine machine = new VendingMachine();
        // Generate a Latte with 4 milk
        IllegalArgumentException e = assertThrows(IllegalArgumentException.class, () -> {
            machine.getBeverage("Latte", 4, 0);
        });
        // then it will throw an exception message "Milk count must be between 0 and 3!"
        assertEquals("Milk count must be between 0 and 3!", e.getMessage());
    }

    @Test
    public void testSugarMoreThan3() {
        VendingMachine machine = new VendingMachine();
        // Generate a Green Tea with 4 sugar
        IllegalArgumentException e = assertThrows(IllegalArgumentException.class, () -> {
            machine.getBeverage("Green Tea", 0, 4);
        });
        // then it will throw an exception message "Sugar count must be between 0 and 3!"
        assertEquals("Sugar count must be between 0 and 3!", e.getMessage());
    }

    @Test
    public void testGetUnknownBeverage() {
        VendingMachine machine = new VendingMachine();
        // Generate an unknown beverage
        IllegalArgumentException e = assertThrows(IllegalArgumentException.class, () -> {
            machine.getBeverage("Mocha", 0, 2);
        });
        // then it will throw an exception message "Unknown beverage type: Mocha"
        assertEquals("Unknown beverage type: Mocha", e.getMessage());
    }
}

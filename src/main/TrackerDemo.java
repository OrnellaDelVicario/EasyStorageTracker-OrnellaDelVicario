package main;

import model.*;
import storage.StorageUnit;
import storage.StorageUtils;

import java.util.ArrayList;
import java.util.List;

public class TrackerDemo {
    public static void main(String[] args) {
        // Create different type of objects
        Book book = new Book("Java Programming", "John Doe");
        Device device = new Device("Smartphone", "Samsung");
        Snack snack = new Snack("Chips", "BBQ");
        Perishable milk = new Perishable("Milk", false);  // La leche no está expirada

        // Create StorageUnits for each type of object
        StorageUnit<Book> bookStorage = new StorageUnit<>();
        StorageUnit<Device> deviceStorage = new StorageUnit<>();
        StorageUnit<Snack> snackStorage = new StorageUnit<>();
        StorageUnit<Perishable> perishableStorage = new StorageUnit<>();

        // Storage items
        bookStorage.addItem(book);
        deviceStorage.addItem(device);
        snackStorage.addItem(snack);
        perishableStorage.addItem(milk);

        System.out.println("\n=== Easy Storage Tracker ===\n");

        // Print first non-perishable items
        System.out.println("Non-perishable items:\n");
        StorageUtils.displayItem(bookStorage.getItem());
        StorageUtils.displayItem(deviceStorage.getItem());
        StorageUtils.displayItem(snackStorage.getItem());

        // Print now perishable items
        System.out.println("\nPerishable item:\n");
        StorageUtils.displayItem(perishableStorage.getItem());

        // Check if perishable items are expired
        StorageUtils.checkPerishable(milk);

        System.out.println("\n=== Wildcard Item List ===\n");
        // Use Wildcard Method to print all items
        List<Object> items = new ArrayList<>();
        items.add(book);
        items.add(device);
        items.add(snack);
        items.add(milk);  // Add milk
        StorageUtils.printItems(items);
    }

}

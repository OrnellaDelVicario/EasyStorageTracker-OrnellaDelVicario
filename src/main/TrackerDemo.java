package main;

import model.*;
import storage.StorageUnit;
import storage.StorageUtils;

import java.util.ArrayList;
import java.util.List;

public class TrackerDemo {
    public static void main(String[] args) {
        // Create Different type of Objects
        Book book = new Book("Java Programming", "John Doe");
        Device device = new Device("Smartphone", "Samsung");
        Snack snack = new Snack("Chips", "BBQ");
        Perishable milk = new Perishable("Milk", false);

        // Create Storage Units for each type
        StorageUnit<Book> bookStorage = new StorageUnit<>();
        StorageUnit<Device> deviceStorage = new StorageUnit<>();
        StorageUnit<Snack> snackStorage = new StorageUnit<>();
        StorageUnit<Perishable> perishableStorage = new StorageUnit<>();

        // Storage items
        bookStorage.addItem(book);
        deviceStorage.addItem(device);
        snackStorage.addItem(snack);
        perishableStorage.addItem(milk);

        // Show items
        StorageUtils.displayItem(bookStorage.getItem());
        StorageUtils.displayItem(deviceStorage.getItem());
        StorageUtils.displayItem(snackStorage.getItem());
        StorageUtils.displayItem(perishableStorage.getItem());

        // Check Perishable Items
        StorageUtils.checkPerishable(milk);

        // Wildcard Method
        List<Object> items = new ArrayList<>();
        items.add(book);
        items.add(device);
        items.add(snack);
        StorageUtils.printItems(items);
    }
}

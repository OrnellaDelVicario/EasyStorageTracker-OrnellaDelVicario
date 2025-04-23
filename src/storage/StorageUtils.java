package storage;

import model.Perishable;
import java.util.List;

public class StorageUtils {

    // Wildcard Method
    public static void printItems(List<? extends Object> items) {
        for (Object item : items) {
            System.out.println(item);
        }
    }

    // Generic Method
    public static <T> void displayItem(T item) {
        System.out.println(item);
    }

    // Bounded Type Method
    public static <T extends Perishable> void checkPerishable(T item) {
        if (item.isExpired()) {
            System.out.println(item.getName() + " is expired.");
        } else {
            System.out.println(item.getName() + " is still good.");
        }
    }
}

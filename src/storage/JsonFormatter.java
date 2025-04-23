package storage;

/**
 * A utility to mock-serialize an object into JSON-style output.
 */

public class JsonFormatter {

    public static String toJson (Object obj) {
        return "{ \"type\": \"" + obj.getClass().getSimpleName() + "\", \"value\": \"" + obj.toString() + "\" }";
    }
}

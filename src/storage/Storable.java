package storage;

/**
 * A generic interface for storing and loading items.
 * @param <T> the type of item to store
 */

public interface Storable<T> {
    void save (T item);
    T load ();
}



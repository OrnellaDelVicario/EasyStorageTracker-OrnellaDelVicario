package storage;

/**
 * -Generic storage unit that holds one item.
 *
 * @param <T> the type of item
 */

    public class StorageUnit<T> implements Storable <T> {
        private T item;

        public void addItem(T item) {
            this.item = item;
        }

        public T getItem() {
            return item;
        }

        @Override
    public void save (T item) {
            this.item = item;
        }
        @Override
    public T load () {
            return item;
        }
    }

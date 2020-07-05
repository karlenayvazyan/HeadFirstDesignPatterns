package am.ak.design.iterator;

import java.util.Iterator;

public class DinerMenuIterator<T> implements Iterator<T> {

    private final T[] items;
    private int index;

    public DinerMenuIterator(T[] items) {
        this.items = items;
        index = 0;
    }

    @Override
    public boolean hasNext() {
        return index < items.length && items[index] != null;
    }

    @Override
    public T next() {
        return items[index++];
    }

    @Override
    public void remove() {
        if (index <= 0) {
            throw new IllegalStateException("You can’t remove an item until you’ve done at least one next()");
        }
        if (items[index - 1] != null) {
            for (int i = index - 1; i < (items.length - 1); i++) {
                items[i] = items[i + 1];
            }
            items[items.length - 1] = null;
        }
    }
}

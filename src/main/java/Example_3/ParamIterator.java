package Example_3;

import java.util.Iterator;

/**
 * Задача 3.
 * Написать итератор по массиву
 */

public class ParamIterator<T> implements Iterator<T> {
    private final ParamCollection<T> collection;

    private int index = 0;

    public ParamIterator(ParamCollection<T> collection) {
        this.collection = collection;
    }

    @Override
    public boolean hasNext() {
        return index < collection.getSize();
    }

    @Override
    public T next() {
        T item = collection.getByIndex(index);
        index++;
        return item;
    }
}

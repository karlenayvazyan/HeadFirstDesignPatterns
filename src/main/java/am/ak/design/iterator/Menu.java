package am.ak.design.iterator;

import java.util.Iterator;

public interface Menu<T> {
    Iterator<T> createIterator();
}

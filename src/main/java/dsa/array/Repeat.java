package dsa.array;

import java.util.Iterator;

public class Repeat<T> implements Iterable<T> {
    private T[] arr;
    // number of elements in array
    private int capacity;
    // the length of array
    private int size = 0;

    public Repeat(int capacity) {
        if (capacity < 0) {
            throw new IllegalArgumentException("Capacity must be positive number");
        } else {
            this.capacity = capacity;
            arr = (T[]) new Object[capacity];
        }
    }

    public int size() {
        return size;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public T get(int index) {
        return arr[index];
    }

    public void set(int index, T element) {
    }

    public void clear() {

    }

    public void add(T element) {

    }

    public void removeAt(int removeIndex) {

    }

    public T removeAtWithoutMoving(int removeIndex) {
        return null;

    }

    public void remove(Object object) {

    }

    public int indexOf(Object object) {
        return 0;
    }

    public boolean contains(Object object) {
        return false;
    }

    public static void main(String[] args) {

    }

    @Override
    public Iterator<T> iterator() {
        return null;
    }
}

package bai10.btArrayList;

import java.util.Arrays;

public class MyList<E> {
    private int size = 0;
    private static final int DEFAULT_CAPACITY = 10;
    private Object elements[];

    public MyList() {
        elements = new Object[DEFAULT_CAPACITY];
    }

    public MyList(int capacity) {
        elements = new Object[capacity];
    }

    public void add(int index, Object element) {
        while (index >= elements.length - 1) {
            ensureCapacity(1);
        }
        System.arraycopy(elements, index, elements, index + 1, elements.length - 2 - index);
        elements[index] = element;
    }

    private void ensureCapacity(int upSize) {
        int newSize = elements.length + upSize;
        elements = Arrays.copyOf(elements, newSize);
    }

    public void remove(int index) {
        System.arraycopy(elements, index + 1, elements, index, elements.length - 1 - index);
        elements[elements.length - 1] = null;

    }

    public Object get(int i) {
        if (i >= elements.length || i < 0) {
            throw new IndexOutOfBoundsException("Index: " + i + ", Size " + i);
        }
        return elements[i];
    }

    public int size() {
        return elements.length;
    }

    public void clear() {
        elements = new Object[0];
    }

    public Object[] clone() {
        Object[] elementsClone = new Object[size()];
        System.arraycopy(elements, 0, elementsClone, 0, elements.length);
        return elementsClone;

    }

    public boolean add(Object element) {
        ensureCapacity(1);
        elements[elements.length - 1] = element;
        return true;
    }

    public boolean contains(Object element) {
        for (int i = 0; i < elements.length; i++) {
            if (element == elements[i]) {
                return true;
            }
        }
        return false;
    }

    public int indexOf(Object element) {
        int index = -1;
        for (int i = 0; i < elements.length; i++) {
            if (elements[i].equals(element)){
                index=i;
            }
        }
        return index;
    }

    public void print() {
        for (int i = 0; i < elements.length; i++) {
            System.out.println("Element " + i + " :" + get(i));
        }

    }
}


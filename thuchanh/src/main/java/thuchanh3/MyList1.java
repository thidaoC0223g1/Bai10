package thuchanh3;


import java.util.ArrayList;
import java.util.Arrays;

public class MyList1<E> {

    private int size = 0;
    private static final int DEFAULT_CAPACITY = 10;
    private Object[] elements;


    public MyList1() {
        elements = new Object[DEFAULT_CAPACITY];
    }

    public MyList1(int capacity) {
        elements = new Object[capacity];
    }

    public void add(E data) {
        if (size == elements.length) {
            ensureCapacity(2);
        }
        elements[size++] = data;
    }

    public void add(int k, Object data) {
        if (k < 0 || k > elements.length) {
            System.out.println("IndexOutOfBoundsException");
        }
        System.arraycopy(elements, k, elements, k + 1, size - k);
        elements[k] = data;
        size++;
    }

    public void remove(int k) {
        if (k < 0 || k > elements.length) {
            System.out.println("IndexOutOfBoundsException");
        }
        System.arraycopy(elements, k + 1, elements, k, size - k);

        elements[--size] = null;

    }


    public void ensureCapacity(int mincapa) {
        int newLength = elements.length * mincapa;
        elements = Arrays.copyOf(elements, newLength);
    }

    public E get(int i) {
        if (i >= size || i < 0) {
            throw new IndexOutOfBoundsException("Index: " + i + ", Size " + i);
        }
        return (E) elements[i];
    }

    @Override
    public String toString() {
        return "MyList1{" +
                " size=" + size +
                ", elements=" + Arrays.toString(elements) +
                '}';
    }

    public int size() {
        return size;
    }


    public MyList1<E> clone() {
        MyList1<E> v = new MyList1<>();
        v.elements = Arrays.copyOf(this.elements, size);
        v.size = size;
        return v;

    }

    public boolean contains(E o) {
        for (Object x : elements) {
            if (x.equals(o)) return true;
        }return false;
    }
    public boolean addB(int k, Object data) {
        if (k < 0 || k > elements.length) {
            System.out.println("IndexOutOfBoundsException");
        }
        if (size == elements.length) {
            ensureCapacity(2);
        }
        System.arraycopy(elements, k, elements, k + 1, size - k);
        elements[k] = data;
        size++;
        return true;
    }
    public void clear() {
        Arrays.fill(elements, null);
        size = 0;
    }

}

package Problem1;

public class ArrayStack<T> implements Stack<T> {
    // do not change member variables
    private T[] data;
    private int size;

    private ArrayStack() {
    }

    public ArrayStack(int capacity) {
        // homework
        if (capacity > 0) {
            data = (T[]) new Object[capacity];
            size = capacity;
        }
        size = 0;
    }

    @Override
    public boolean push(T val) {
        // homework
        if (data == null || data.length == 0 || size == data.length) {
            return false;
        }
        data[size] = val;
        size++;
        return true;
    }

    @Override
    public T pop() {
        // homework
        if (size == 0) {
            return null;
        }
        T val = data[0];
        for (int i = 0; i < data.length; i++) {
            data[i] = data[i + 1];
        }
        size--;
        return val;
    }

    @Override
    public T peek() {
        // homework
        if (size == 0) {
            return null;
        }
        return data[0];
    }

    @Override
    public int size() {
        return size;
    }
}

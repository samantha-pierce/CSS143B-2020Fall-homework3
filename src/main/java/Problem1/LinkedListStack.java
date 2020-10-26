package Problem1;

import java.util.LinkedList;

public class LinkedListStack<T> implements Stack<T> {
    // use Java LinkedList to store the data
    // do not change member variables
    private LinkedList<T> data;

    public LinkedListStack() {
        // homework
        data = new LinkedList<>();
    }

    @Override
    public boolean push(T val) {
        // homework
        if (data == null) {
            return false;
        }
        return data.add(val);
    }

    @Override
    public T pop() {
        // homework
        return data.removeLast();
    }

    @Override
    public T peek() {
        // homework
        return data.peekLast();
    }

    @Override
    public int size() {
        return data.size();
    }
}

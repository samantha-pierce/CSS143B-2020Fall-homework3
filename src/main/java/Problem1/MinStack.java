package Problem1;

public class MinStack extends ArrayStack<Integer> {
    // okay to add member variables
    // can only use Stack interface and ArrayStack from this folder
    // do not use Java Stack
    Integer minValue;

    public MinStack(int size) {
        // homework
        super(size); // place holder
    }

    @Override
    public boolean push(Integer val) {
        // homework
        return super.push(val);
    }

    @Override
    public Integer pop() {
        // homework
        Integer lastValue = super.pop();
        return lastValue;
    }

    public Integer getMin() {
        // homework
        // loop of any kind is not allowed
        return -1; // place holder
    }
}


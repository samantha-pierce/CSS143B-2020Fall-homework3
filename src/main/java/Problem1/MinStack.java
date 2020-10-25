package Problem1;

public class MinStack extends ArrayStack<Integer> {
    // okay to add member variables
    // can only use Stack interface and ArrayStack from this folder
    // do not use Java Stack
    ArrayStack<Integer> min;

    public MinStack(int size) {
        // homework
        super(size);
        min = new ArrayStack<>(size);
    }

    @Override
    public boolean push(Integer val) {
        // homework
        if (min.size() == 0) {
            min.push(val);
        } else {
            if (val < min.peek()) {
                min.push(val);
            }
        }
        return super.push(val);
    }

    @Override
    public Integer pop() {
        // homework
        Integer value = super.pop();
        if (value.equals(min.peek())) {
            min.pop();
        }
        return value;
    }

    public Integer getMin() {
        // homework
        // loop of any kind is not allowed
        return min.peek();
    }
}

// credit to https://www.techiedelight.com/design-stack-which-returns-minimum-element-constant-time/ for help
// with implementations and explanation of a min stack


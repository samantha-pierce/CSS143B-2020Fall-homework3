package Problem3;

import Problem1.LinkedListStack;
import Problem1.Stack;
import Problem2.ListNode;

import java.io.PrintStream;

public class Problem3 {
    public static void printListInReverse(ListNode list, PrintStream print) {
        // homework
        // !!! must use your ArrayStack or LinkedListStack in problem 1
        LinkedListStack stack = new LinkedListStack();
        // prevents the dummy node being pushed onto the stack
        list = list.next;
        while (list != null) {
            stack.push(list.val);
            list = list.next;
        }
        while (stack.size() > 0) {
            print.println(stack.pop());
        }
    }
}

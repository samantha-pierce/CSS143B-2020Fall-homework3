package Problem1;

public class ValidParentheses {

    // Do not change signature (function name, parameters, return type)
    public static boolean isValid(String str) {
        // homework
        // !!! must use ArrayStack or LinkedListStack from problem 1
        if (str == null || str.length() == 0) {
            return true;
        }
        LinkedListStack<Character> stack = new LinkedListStack<>();
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            if (c == '(' || c == '[' || c == '{') {
                stack.push(c);
            } else if (c == ')' || c == ']' || c == '}') {
                // by checking the size, this makes sure the first character of the string pushed
                // on the stack was an open bracket or parenthesis
                if (stack.size() > 0) {
                    if (stack.peek().equals('(') && c == ')') {
                        stack.pop();
                    } else if (stack.peek().equals('[') && c == ']') {
                        stack.pop();
                    } else if (stack.peek().equals('{') && c == '}') {
                        stack.pop();
                    }
                }
            } else {
                // false if the string did not contain only parenthesis or brackets
                return false;
            }
        }
        // if stack is empty, then all parenthesis matched with each other and returns true
        return stack.size() == 0;
    }
}

package series;

import java.util.Stack;

public class Day86_2 {

    static class MinStack {

        Stack<Integer> stack = new Stack<>();
        Stack<Integer> minStack = new Stack<>();

        public void push(int x) {
            stack.push(x);

            if (minStack.isEmpty() || x <= minStack.peek()) {
                minStack.push(x);
            }
        }

        public int pop() {
            int removed = stack.pop();

            if (removed == minStack.peek()) {
                minStack.pop();
            }

            return removed;
        }

        public int top() {
            return stack.peek();
        }

        public int getMin() {
            return minStack.peek();
        }
    }

    public static void main(String[] args) {

        MinStack stack = new MinStack();

        stack.push(5);
        stack.push(2);
        stack.push(8);
        stack.push(1);

        System.out.println("Minimum: " + stack.getMin());

        stack.pop();

        System.out.println("Minimum after pop: " + stack.getMin());
        System.out.println("Top element: " + stack.top());
    }
}
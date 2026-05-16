package series;

import java.util.Stack;

public class Day89_2 {

    static class QueueUsingStacks {

        Stack<Integer> stack1 = new Stack<>();
        Stack<Integer> stack2 = new Stack<>();

        public void enqueue(int data) {
            stack1.push(data);
            System.out.println(data + " inserted");
        }

        public int dequeue() {

            if (stack1.isEmpty() && stack2.isEmpty()) {
                System.out.println("Queue is empty");
                return -1;
            }

            if (stack2.isEmpty()) {

                while (!stack1.isEmpty()) {
                    stack2.push(stack1.pop());
                }
            }

            return stack2.pop();
        }

        public int peek() {

            if (stack1.isEmpty() && stack2.isEmpty()) {
                System.out.println("Queue is empty");
                return -1;
            }

            if (stack2.isEmpty()) {

                while (!stack1.isEmpty()) {
                    stack2.push(stack1.pop());
                }
            }

            return stack2.peek();
        }

        public boolean isEmpty() {
            return stack1.isEmpty() && stack2.isEmpty();
        }
    }

    public static void main(String[] args) {

        QueueUsingStacks queue = new QueueUsingStacks();

        queue.enqueue(10);
        queue.enqueue(20);
        queue.enqueue(30);

        System.out.println("Front Element: " + queue.peek());

        System.out.println("Removed: " + queue.dequeue());
        System.out.println("Removed: " + queue.dequeue());

        System.out.println("Front Element: " + queue.peek());
    }
}
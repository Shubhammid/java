package series;

import java.util.LinkedList;
import java.util.Deque;
import java.util.Queue;

public class Day90_1 {
    static class MaxQueue {
        private Queue<Integer> queue;
        private Deque<Integer> maxDeque;
        public MaxQueue() {
            queue = new LinkedList<>();
            maxDeque = new LinkedList<>();
        }
        public void enqueue(int value) {
            queue.offer(value);

            while (!maxDeque.isEmpty() && maxDeque.peekLast() < value) {
                maxDeque.pollLast();
            }

            maxDeque.offerLast(value);
        }

        public int dequeue() {
            if (queue.isEmpty()) {
                throw new RuntimeException("Queue is empty");
            }

            int removed = queue.poll();

            if (removed == maxDeque.peekFirst()) {
                maxDeque.pollFirst();
            }

            return removed;
        }
        public int getMax() {
            if (maxDeque.isEmpty()) {
                throw new RuntimeException("Queue is empty");
            }

            return maxDeque.peekFirst();
        }
        public void display() {
            System.out.println("Queue: " + queue);
        }
    }

    public static void main(String[] args) {

        MaxQueue mq = new MaxQueue();

        mq.enqueue(10);
        mq.enqueue(5);
        mq.enqueue(20);
        mq.enqueue(15);

        mq.display();

        System.out.println("Maximum Element: " + mq.getMax());

        System.out.println("Dequeued: " + mq.dequeue());

        mq.display();

        System.out.println("Maximum Element: " + mq.getMax());
    }
}
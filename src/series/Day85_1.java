package series;

import java.util.PriorityQueue;

public class Day85_1 {

    static class Point {
        int x;
        int y;

        Point(int x, int y) {
            this.x = x;
            this.y = y;
        }

        int distance() {
            return x * x + y * y;
        }
    }

    public static void findKClosest(Point[] points, int k) {

        PriorityQueue<Point> maxHeap = new PriorityQueue<>(
                (a, b) -> b.distance() - a.distance()
        );

        for (Point p : points) {
            maxHeap.add(p);

            if (maxHeap.size() > k) {
                maxHeap.poll();
            }
        }

        System.out.println("K Closest Points to Center:");

        while (!maxHeap.isEmpty()) {
            Point p = maxHeap.poll();
            System.out.println("(" + p.x + ", " + p.y + ")");
        }
    }

    public static void main(String[] args) {

        Point[] points = {
                new Point(1, 3),
                new Point(-2, 2),
                new Point(5, 8),
                new Point(0, 1)
        };

        int k = 2;

        findKClosest(points, k);
    }
}
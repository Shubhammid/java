package series;

import java.util.*;

public class Day103_1 {
    static class Bike {
        int x, y;
        Bike(int x, int y) {
            this.x = x;
            this.y = y;
        }
    }
    public static List<Bike> nearestBikes(Bike[] bikes, int k) {
        PriorityQueue<Bike> pq = new PriorityQueue<>(
                (a, b) -> Integer.compare(
                        distance(a),
                        distance(b)
                )
        );
        for (Bike bike : bikes) {
            pq.offer(bike);
        }
        List<Bike> result = new ArrayList<>();
        while (k-- > 0 && !pq.isEmpty()) {
            result.add(pq.poll());
        }
        return result;
    }
    private static int distance(Bike bike) {
        return bike.x * bike.x + bike.y * bike.y;
    }
    public static void main(String[] args) {
        Bike[] bikes = {
                new Bike(1, 2),
                new Bike(3, 4),
                new Bike(-1, 0),
                new Bike(2, 1)
        };
        List<Bike> nearest = nearestBikes(bikes, 2);
        for (Bike bike : nearest) {
            System.out.println("(" + bike.x + ", " + bike.y + ")");
        }
    }
}
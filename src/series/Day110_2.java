package series;

public class Day110_2 {

    static class Interval {
        int start, end;

        Interval(int start, int end) {
            this.start = start;
            this.end = end;
        }
    }

    public static boolean isOverlapped(Interval a, Interval b) {
        return Math.max(a.start, b.start) <= Math.min(a.end, b.end);
    }

    public static void main(String[] args) {
        Interval interval1 = new Interval(1, 5);
        Interval interval2 = new Interval(4, 8);

        if (isOverlapped(interval1, interval2)) {
            System.out.println("Intervals Overlap");
        } else {
            System.out.println("Intervals Do Not Overlap");
        }
    }
}
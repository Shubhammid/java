package series;

//Java Program to Find the Perimeter of a Rectangle

public class Day8_2 {
    static void perimeter(int length, int breadth){
        int perimeter = 2 * (length + breadth);
        System.out.println("The perimeter of given rectangle " + perimeter);
    }
    public static void main(String[] args) {
        int length = 10;
        int breadth = 20;
        perimeter(length, breadth);
    }
}

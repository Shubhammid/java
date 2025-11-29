package series;

//Java program to convert Long to String

public class Day17_1 {
    public static void main(String[] args) {
        Long varlong = 999999999999999L;
        String str = varlong + " ";
        System.out.println("Converted type: " +str.getClass().getName());
        System.out.println(str);
    }
}

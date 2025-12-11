package series;

//To find the count of the digits in a given number

public class Day29_2 {
    public static void main(String[] args) {
        int num = 156575345;
        int count = 0;
        while (num > 0){
            count++;
            num = num / 10;
        }
        System.out.println("Count of digits: " +count);
    }
}

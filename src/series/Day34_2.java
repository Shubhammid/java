package series;

//Sum of Natural Numbers Using Recursion

public class Day34_2 {
    public static int addNumbers(int num) {
        if (num != 0)
            return num + addNumbers(num - 1);
        else
            return num;
    }
    public static void main(String[] args) {
        int number = 20;
        int sum = addNumbers(number);
        System.out.println("Sum = " + sum);
    }
}

package series;

//Replace a character at a specific index in a String in Java

public class Day18_2 {
    public static void main(String[] args) {
        String str = "Hello";
        int index = 1;
        char replacement = 'a';

        str = str.substring(0, index) + replacement + str.substring(index + 1);
        System.out.println(str);
    }
}

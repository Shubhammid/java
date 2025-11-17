package series;

//Java Program to Check Whether the Character is Vowel or Consonant

public class Day6_2 {
    public static void main(String[] args) {
        char ch = 'b';
        if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' || ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U') {
            System.out.println(ch + " is a vowel");
        } else {
            System.out.println(ch + " is a consonant");
        }
    }
}

package series;

public class Day142_2 {
    public static String addStrings(String num1, String num2) {
        StringBuilder result = new StringBuilder();
        int i = num1.length() - 1;
        int j = num2.length() - 1;
        int carry = 0;
        while (i >= 0 || j >= 0 || carry != 0) {
            int sum = carry;
            if (i >= 0) {
                sum += num1.charAt(i) - '0';
                i--;
            }
            if (j >= 0) {
                sum += num2.charAt(j) - '0';
                j--;
            }
            result.append(sum % 10);
            carry = sum / 10;
        }
        return result.reverse().toString();
    }
    public static void main(String[] args) {
        String num1 = "999999999999999999999999";
        String num2 = "123456789123456789123456";
        System.out.println("Sum: " + addStrings(num1, num2));
    }
}
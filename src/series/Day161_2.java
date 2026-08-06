package series;

public class Day161_2 {

    public static void main(String[] args) {

        int num = 155349;

        String str = Integer.toString(num);

        boolean increasing = false;
        boolean decreasing = false;

        for (int i = 0; i < str.length() - 1; i++) {

            if (str.charAt(i) < str.charAt(i + 1)) {
                increasing = true;
            }

            if (str.charAt(i) > str.charAt(i + 1)) {
                decreasing = true;
            }
        }

        if (increasing && decreasing) {
            System.out.println(num + " is a Bouncy Number.");
        } else {
            System.out.println(num + " is not a Bouncy Number.");
        }
    }
}
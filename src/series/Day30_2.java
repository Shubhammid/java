package series;

//To find the reverse of each word

public class Day30_2 {
    public static void main(String[] args) {
        String str = "Welcome to java class";
        String res = "";
        String[] sp = str.split(" ");
        for (String s : sp) {
            System.out.println();
            String rev = "";
            for (int i = s.length() - 1; i >= 0; i--) {
                char c = s.charAt(i);
                rev = rev + c;

            }
            res = res + rev + " ";
        }
        System.out.println(res);
    }
}

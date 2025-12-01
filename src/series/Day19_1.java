package series;

//Reverse a String in Java

public class Day19_1 {
    public static void main(String[] args) {
        String s = "Shubham";
        String r = "";

        for(int i = 0; i< s.length(); i++){
            r = s.charAt(i) + r;
        }
        System.out.println(r);;
    }
}

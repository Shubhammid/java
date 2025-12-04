package series;

//Remove Leading Zeros From String in Java

public class Day23_2 {
    public static  String removeZero(String str){
        int i = 0;
        while (i < str.length() && str.charAt(i) == '0')
            i++;

        StringBuilder sb = new StringBuilder(str);

        sb.replace(0, i, "");
        return sb.toString();
    }
    public static void main(String[] args) {
        String str = "000000122349475";

        str = removeZero(str);

        System.out.println(str);
    }
}

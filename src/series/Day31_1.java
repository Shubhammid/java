package series;

//To remove the duplicates and to sort elements from Array

import java.util.TreeSet;

public class Day31_1 {
    public static void main(String[] args) {
        int [] a = {454, 55, 39, 26, 78, 55, 99, 30};
        TreeSet<Integer> t = new TreeSet<>();
        for(int i = 0; i < a.length; i++){
            t.add(a[i]);
        }
        System.out.println(t);
    }
}

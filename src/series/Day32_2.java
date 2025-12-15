package series;

//To add each odd and even pair in an array

public class Day32_2 {
    public static void main(String[] args) {
        int[] a ={10, 20, 30, 40, 50};

        try {
          for(int i = 0; i < a.length; i = i + 2){
              System.out.println(a[i]+a[i+1]);
          }
        }
        catch (Exception e){
            System.out.println(a[a.length-1]);
        }
    }
}

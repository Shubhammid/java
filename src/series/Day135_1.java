package series;

import java.util.HashSet;
import java.util.Random;

public class Day135_1 {
    public static void main(String[] args) {
        int[] arr = {5, 12, 18, 25, 30, 42, 50};
        Random random = new Random();
        HashSet<Integer> set = new HashSet<>();
        for (int num : arr) {
            set.add(num);
        }
        int randomNumber;
        do {
            randomNumber = random.nextInt(51); // Generates 0 to 50
        } while (set.contains(randomNumber));
        System.out.println("Array Elements:");
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println("\nRandom Number Not Present in Array: " + randomNumber);
    }
}
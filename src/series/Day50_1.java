package series;
import java.util.Scanner;

public class Day50_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter word: ");
        String word = sc.nextLine();
        findSubsets(word, "", 0);
    }
    static void findSubsets(String word, String result, int index) {
        if (index == word.length()) {
            System.out.println(result);
            return;
        }
        findSubsets(word, result + word.charAt(index), index + 1);
        findSubsets(word, result, index + 1);
    }
}

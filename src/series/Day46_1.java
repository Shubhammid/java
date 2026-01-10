package series;
import java.util.*;

public class Day46_1 {
    public static int leastInterval(char[] tasks, int n) {
        int[] freq = new int[26];
        for (char c : tasks) {
            freq[c - 'A']++;
        }
        Arrays.sort(freq);
        int maxFreq = freq[25];
        int countMax = 1;
        for (int i = 24; i >= 0; i--) {
            if (freq[i] == maxFreq) {
                countMax++;
            } else {
                break;
            }
        }
        int partCount = maxFreq - 1;
        int partLength = n + 1;
        int minTime = partCount * partLength + countMax;
        return Math.max(tasks.length, minTime);
    }
    public static void main(String[] args) {
        char[] tasks = {'A', 'A', 'A', 'B', 'B', 'B'};
        int n = 2;
        System.out.println("Minimum intervals needed: " + leastInterval(tasks, n));
    }
}

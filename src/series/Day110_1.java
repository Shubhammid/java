package series;

import java.util.Arrays;

public class Day110_1 {

    static class Job {
        int start, end, profit;

        Job(int start, int end, int profit) {
            this.start = start;
            this.end = end;
            this.profit = profit;
        }
    }

    public static int jobScheduling(int[] startTime, int[] endTime, int[] profit) {
        int n = startTime.length;

        Job[] jobs = new Job[n];
        for (int i = 0; i < n; i++) {
            jobs[i] = new Job(startTime[i], endTime[i], profit[i]);
        }

        Arrays.sort(jobs, (a, b) -> Integer.compare(a.end, b.end));

        int[] dp = new int[n];
        dp[0] = jobs[0].profit;

        for (int i = 1; i < n; i++) {
            int includeProfit = jobs[i].profit;

            int lastNonConflict = findLastNonConflict(jobs, i);
            if (lastNonConflict != -1) {
                includeProfit += dp[lastNonConflict];
            }

            dp[i] = Math.max(dp[i - 1], includeProfit);
        }

        return dp[n - 1];
    }

    private static int findLastNonConflict(Job[] jobs, int index) {
        int low = 0;
        int high = index - 1;

        while (low <= high) {
            int mid = low + (high - low) / 2;

            if (jobs[mid].end <= jobs[index].start) {
                if (mid + 1 <= high && jobs[mid + 1].end <= jobs[index].start) {
                    low = mid + 1;
                } else {
                    return mid;
                }
            } else {
                high = mid - 1;
            }
        }

        return -1;
    }

    public static void main(String[] args) {
        int[] start = {1, 2, 3, 3};
        int[] end = {3, 4, 5, 6};
        int[] profit = {50, 10, 40, 70};

        System.out.println("Maximum Profit: " +
                jobScheduling(start, end, profit));
    }
}
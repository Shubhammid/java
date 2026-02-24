package series;

public class Day83_1 {

    public static int maxPopulation(int[][] logs) {
        int[] population = new int[101];

        for (int[] log : logs) {
            int birth = log[0] - 1950;
            int death = log[1] - 1950;

            population[birth]++;
            population[death]--;
        }

        int maxPop = population[0];
        int yearIndex = 0;

        for (int i = 1; i < 101; i++) {
            population[i] += population[i - 1];

            if (population[i] > maxPop) {
                maxPop = population[i];
                yearIndex = i;
            }
        }

        return 1950 + yearIndex;
    }

    public static void main(String[] args) {

        int[][] logs = {
                {1993, 1999},
                {2000, 2010}
        };

        int result = maxPopulation(logs);
        System.out.println("Year with maximum population: " + result);
    }
}
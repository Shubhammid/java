package series;

import java.util.Random;

public class Day134_2 {
    public static void main(String[] args) {
        Random random = new Random();
        int randomInt = random.nextInt(100);
        double randomDouble = random.nextDouble();
        boolean randomBoolean = random.nextBoolean();
        System.out.println("Random Integer : " + randomInt);
        System.out.println("Random Double  : " + randomDouble);
        System.out.println("Random Boolean : " + randomBoolean);

    }
}
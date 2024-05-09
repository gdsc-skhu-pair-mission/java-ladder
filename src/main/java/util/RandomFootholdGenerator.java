package util;

import java.util.Random;

public class RandomFootholdGenerator {

    private static final Random random = new Random();

    public static boolean generate() {
        return random.nextBoolean();
    }
}

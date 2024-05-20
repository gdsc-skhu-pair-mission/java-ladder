package util;

import java.util.Random;

public class RandomFootholdGenerator implements FootholdGenerator{

    private static Random random = new Random();

    @Override
    public boolean generate() {
        return random.nextBoolean();
    }
}

package ladder.model;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class RandomBoolean {
    public List<Boolean> createRandomColumn(int personCount) {
        List<Boolean> columns = new ArrayList<>();
        for (int i = 0; i < personCount-1; i++){
            columns.add(getRandomBoolean());
        }
        return columns;
    }

    private boolean getRandomBoolean() {
        Random random = new Random();
        return random.nextBoolean();
    }
}

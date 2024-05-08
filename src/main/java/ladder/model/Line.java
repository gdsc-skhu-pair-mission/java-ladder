package ladder.model;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Line {
    private int personCount;
    private List<Boolean> points;

    public Line (int personCount) {
        this.personCount = personCount;
    }

    public void rearrange(List<Boolean> columns) {
        boolean previousColumn = false;
        for (int i = 0; i < personCount-1; i++) {
            boolean currentColum = columns.get(i);
            if (previousColumn == currentColum){
                columns.set(i, false);
            }
            previousColumn = currentColum;
        }
    }


    public List<Boolean> createRandomColumn() {
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

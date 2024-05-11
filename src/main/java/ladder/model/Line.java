package ladder.model;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Line {

    private RandomBoolean randomBoolean = new RandomBoolean();

    private List<Boolean> points;

    public Line (List<Boolean> randomColumn) {
        this.points = randomColumn;
        rearrange(points);
    }

    public List<Boolean> getPoints() {
        return points;
    }

    private void rearrange(List<Boolean> columns) {
        boolean previousColumn = false;
        for (int i = 0; i < columns.size(); i++) {
            boolean currentColum = columns.get(i);
            if (previousColumn == currentColum){
                columns.set(i, false);
            }
            previousColumn = currentColum;
        }
    }
}

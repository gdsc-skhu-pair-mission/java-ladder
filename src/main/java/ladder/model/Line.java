package ladder.model;

import java.util.List;

public class Line {

    private final List<Boolean> points;

    public Line(List<Boolean> randomColumn) {
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
            if (previousColumn == currentColum) {
                columns.set(i, false);
            }
            previousColumn = currentColum;
        }
    }
}

package ladder.model;

import java.util.List;

public class Line {

    private RandomBoolean randomBoolean = new RandomBoolean();

    private List<Boolean> points;

    public Line(List<Boolean> randomColumn) {
        this.points = randomColumn;
        resetConsecutiveDuplicates();
    }

    public List<Boolean> getPoints() {
        return points;
    }

    private void resetConsecutiveDuplicates() {
        if (points.isEmpty()) return;
        boolean previousColumn = false;
        for (int i = 0; i < points.size(); i++) {
            points.set(i, updateColumnBasedOnPrevious(i, previousColumn));
            previousColumn = points.get(i);
        }
    }

    private boolean updateColumnBasedOnPrevious(int index, boolean previousColumn) {
        boolean currentColumn = points.get(index);
        if (previousColumn == currentColumn) {
            return false;
        }
        return currentColumn;
    }
}

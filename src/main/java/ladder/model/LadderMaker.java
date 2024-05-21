package ladder.model;

import static ladder.util.validator.LadderValidator.checkEmpty;
import static ladder.util.validator.LadderValidator.checkLadderNumberStandard;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class LadderMaker {

    private final int ladderHeight;

    public LadderMaker(String ladderHeight) {
        checkEmpty(ladderHeight);
        checkLadderNumberStandard(ladderHeight);

        this.ladderHeight = Integer.parseInt(ladderHeight);
    }

    public int getLadderHeight() {
        return ladderHeight;
    }

    public List<Boolean> makeLadder(int personCount) {
        Line lines = new Line(createRandomColumn(personCount));
        return lines.getPoints();
    }

    public List<Boolean> createRandomColumn(int personCount) {
        List<Boolean> columns = new ArrayList<>();
        for (int i = 0; i < personCount - 1; i++) {
            columns.add(getRandomBoolean());
        }
        return columns;
    }

    private boolean getRandomBoolean() {
        Random random = new Random();
        return random.nextBoolean();
    }
}

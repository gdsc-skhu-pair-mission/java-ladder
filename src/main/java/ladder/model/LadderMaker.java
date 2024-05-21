package ladder.model;

import static ladder.util.validator.LadderValidator.checkEmpty;
import static ladder.util.validator.LadderValidator.checkLadderNumberStandard;

import java.util.List;

public class LadderMaker {

    private int ladderHeight;

    public LadderMaker(String ladderHeight) {
        checkEmpty(ladderHeight);
        checkLadderNumberStandard(ladderHeight);

        this.ladderHeight = Integer.parseInt(ladderHeight);
    }

    public int getLadderHeight() {
        return ladderHeight;
    }

    public List<Boolean> makeLadder(int personCount) {
        RandomBoolean randomBoolean = new RandomBoolean();
        Line lines = new Line(randomBoolean.createRandomColumn(personCount));
        return lines.getPoints();
    }
}

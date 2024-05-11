package ladder.model;

import java.util.Random;
import ladder.util.validator.LadderValidator;

import java.util.List;

public class LadderMaker {

    private int ladderHeight;

    public LadderMaker(String ladderHeight) {
        LadderValidator.checkEmpty(ladderHeight);
        LadderValidator.checkLadderNumberStandard(ladderHeight);

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

package ladder.model;

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
        Line line = new Line(personCount);
        List<Boolean> lines = line.createRandomColumn();
        line.rearrange(lines);
        return lines;
    }

}

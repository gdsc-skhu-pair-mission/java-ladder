package ladder.model;

import ladder.util.validator.LadderValidator;

public class LadderMaker {

    public LadderMaker(String ladderHeight) {
        LadderValidator.checkEmpty(ladderHeight);
        LadderValidator.checkLadderNumberStandard(ladderHeight);
    }

}

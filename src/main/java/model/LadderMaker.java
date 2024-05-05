package model;

import util.validator.LadderValidator;

public class LadderMaker {

    public LadderMaker(String ladderHeight) {
        LadderValidator.checkEmpty(ladderHeight);
        LadderValidator.checkLadderNumberStandard(ladderHeight);
    }

}

package ladder.controller;

import java.util.List;
import ladder.model.LadderMaker;
import ladder.model.ManipulationPeople;
import ladder.model.PersonList;
import ladder.view.InputView;
import ladder.view.ResultView;

public class LadderController {

    private final ResultView resultView;
    private final InputView inputView;
    private ManipulationPeople manipulationPeople;
    private LadderMaker ladderMaker;


    public LadderController(InputView inputview, ResultView resultView) {
        this.inputView = inputview;
        this.resultView = resultView;
    }

    public void start() {
        resultView.startMessage();
        this.manipulationPeople = new ManipulationPeople(new PersonList(inputView.inputName()).getPeople());

        resultView.ladderHeightMessage();
        this.ladderMaker = new LadderMaker(inputView.inputLadderHeight());

        resultView.resultMessage();
        resultView.printPeople(manipulationPeople.getManipulationPeopleNames());

        for (int i = 0; i < ladderMaker.getLadderHeight(); i++) {
            resultView.printLine(getFirstManipulationName(), getPeopleSize());
        }
    }

    private List<Boolean> getPeopleSize() {
        return ladderMaker.makeLadder(manipulationPeople.getManipulationPeopleNames().size());
    }

    private String getFirstManipulationName() {
        return manipulationPeople.getManipulationPeopleNames().get(0);
    }
}

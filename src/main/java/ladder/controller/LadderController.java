package ladder.controller;

import java.util.List;
import ladder.model.LadderMaker;
import ladder.model.Persons;
import ladder.view.InputView;
import ladder.view.NameManipulateView;
import ladder.view.ResultView;

public class LadderController {

    private final ResultView resultView;
    private final InputView inputView;
    private LadderMaker ladderMaker;
    private List<String> manipulatedPeopleNames;

    public LadderController(InputView inputview, ResultView resultView) {
        this.inputView = inputview;
        this.resultView = resultView;
    }

    public void start() {
        resultView.startMessage();

        Persons persons = new Persons(inputView.inputName());
        NameManipulateView nameManipulateView = new NameManipulateView();
        manipulatedPeopleNames = nameManipulateView.manipulateNames(persons.getPeople());

        resultView.ladderHeightMessage();
        this.ladderMaker = new LadderMaker(inputView.inputLadderHeight());

        resultView.resultMessage();
        resultView.printPeople(manipulatedPeopleNames);

        for (int i = 0; i < ladderMaker.getLadderHeight(); i++) {
            resultView.printLine(getFirstManipulationName(), getPeopleSize());
        }
    }

    private List<Boolean> getPeopleSize() {
        return ladderMaker.makeLadder(manipulatedPeopleNames.size());
    }

    private String getFirstManipulationName() {
        return manipulatedPeopleNames.get(0);
    }
}

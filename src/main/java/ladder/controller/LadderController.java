package ladder.controller;

import java.util.List;
import ladder.model.LadderMaker;
import ladder.model.PersonList;
import ladder.view.*;

public class LadderController {

    private final ResultView resultView;
    private final InputView inputView;
    private PersonList personList;
    private LadderMaker ladderMaker;

    public LadderController(InputView inputview, ResultView resultView){
        this.inputView = inputview;
        this.resultView = resultView;
    }

    public void start() {
        resultView.startMessage();
        this.personList = new PersonList(inputView.inputName());

        personList.personNameInput();
        personList.manipulateNames();

        resultView.ladderHeightMessage();
        this.ladderMaker = new LadderMaker(inputView.inputLadderHeight());

        resultView.resultMessage();
        resultView.printPeople(personList.getManipulationPeopleNames());

        for (int i = 0; i < ladderMaker.getLadderHeight(); i++) {
            resultView.printLine(getFirstManipulationName(), getPeopleSize());
        }
    }

    private List<Boolean> getPeopleSize(){
        return ladderMaker.makeLadder(personList.getPeople().size());
    }

    private String getFirstManipulationName() {
        return personList.getManipulationPeopleNames().get(0);
    }
}

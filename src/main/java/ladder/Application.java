package ladder;

import ladder.model.PersonList;
import ladder.view.InputView;
import ladder.view.ResultView;

public class Application {
    public static void main(String[] args) {
        InputView inputView = new InputView();
        ResultView resultView = new ResultView();

        // given
        String peopleName = "gdsc,소정,예은,water,a";
        PersonList personList = new PersonList(peopleName);
        personList.personNameInput();

        // when

        resultView.startMessage();
        personList.manipulateNames();
        resultView.ladderHeightMessage();

        resultView.printPeople(personList.getManipulationPeopleNames());

    }
}

package controller;

import domain.Human;
import domain.Humans;
import domain.Ladder;
import domain.Line;
import view.InputView;
import view.OutputView;

import java.util.ArrayList;
import java.util.List;

public class LadderController {
    private final OutputView outputView;
    private final InputView inputView;
    private final Humans humans;
    private final Ladder ladder;

    public LadderController(final OutputView outputView, final InputView inputView, final Ladder ladder) {
        this.outputView = outputView;
        this.inputView = inputView;
        this.ladder = ladder;
        this.humans = new Humans();

    }

    public void gameStart() {
        createHumans();
        createLadderHeight();
        List<String> names = humans.getNames();
        outputView.printNames(names);
        List<List<Boolean>> lines = createLadderLines();
        outputView.printLadder(lines);

    }

    void createHumans() {
        outputView.printNames();
        String[] names = inputView.inputNames();
        for (String name : names) {
            humans.addHuman(new Human(name));
        }
    }

    void createLadderHeight() {
        outputView.printHeight();
        ladder.setHeight(inputView.inputHeight());
    }

    List<List<Boolean>> createLadderLines() {
        List<List<Boolean>> lines = new ArrayList<>();
        int numPeople = humans.getHumans().size();
        for (int i = 0; i < ladder.getHeight(); i++){
            Line line = new Line(numPeople);
            lines.add(line.getPoints());
        }

        return lines;
    }
}

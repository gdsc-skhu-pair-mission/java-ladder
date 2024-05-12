package controller;

import domain.Human;
import domain.Ladder;
import domain.Line;
import view.InputView;
import view.OutputView;

import java.util.ArrayList;
import java.util.List;

public class LadderController {
    private final OutputView outputView;
    private final InputView inputView;
    private List<Human> humans;
    private final Ladder ladder;

    public LadderController(final OutputView outputView, final InputView inputView, final Ladder ladder) {
        this.outputView = outputView;
        this.inputView = inputView;
        this.ladder = ladder;
        this.humans = new ArrayList<>();
    }

    public void gameStart() {
        createHumans();
        createLadderHeight();
        String[] names = humans.stream().map(Human::getName).toArray(String[]::new);
        outputView.printNames(names);
        List<List<Boolean>> lines = createLadderLines();
        outputView.printLadder(lines);

    }

    void createHumans() {
        outputView.printNames();
        String[] names = inputView.inputNames();
        for (String name : names) {
            humans.add(new Human(name));
        }
    }

    void createLadderHeight() {
        outputView.printHeight();
        ladder.setHeight(inputView.inputHeight());
    }

    List<List<Boolean>> createLadderLines() {
        List<List<Boolean>> lines = new ArrayList<>();
        for (int i = 0; i < ladder.getHeight(); i++) {
            lines.add(new Line(humans.size()).getPoints());
        }
        return lines;
    }
}

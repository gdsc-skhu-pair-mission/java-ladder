package controller;

import domain.Human;
import domain.Ladder;
import view.InputView;
import view.OutputView;

import java.util.ArrayList;
import java.util.List;

public class LadderController {
    private final OutputView outputView;
    private final InputView inputView;

    private final Ladder ladder;

    public void gameStart() {
        createHuman();
        createLadder();
    }

    public LadderController(final OutputView outputView, final InputView inputView, final Ladder ladder) {
        this.outputView = outputView;
        this.inputView = inputView;
        this.ladder = ladder;
    }

    void createHuman() {
        outputView.printNames();
        List<Human> humans = new ArrayList<>();
        String[] names = inputView.inputName();
        for (String name : names) {
            humans.add(new Human(name));

        }
        for (Human human : humans) {
            System.out.print(human.getName());
        }
        System.out.println("");
    }

    int humanNumber() {
        int personnel = inputView.inputName().length;
        return personnel;
    }

    void createLadder() {
        outputView.printHeight();
        Ladder ladder = new Ladder(inputView.inputHeight());
        System.out.println(ladder.getHeight());
    }
}

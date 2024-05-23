package controller;

import model.ladder.Ladder;
import model.ladder.strategy.RandomGenerateStrategy;
import model.players.Players;
import view.InputView;
import view.OutputView;

public class LadderGameController {
    public void run() {
        Players players = initPlayers();
        int countOfPlayers = players.countOfPlayers();
        int height = InputView.readHeight();
        Ladder ladder = initLadder(countOfPlayers, height);
        OutputView.printResult(players.getPlayerNames(), ladder.getLadderInformation());
    }

    private Players initPlayers() {
        return new Players(InputView.readPlayerNames());
    }

    private Ladder initLadder(int countOfPlayers, int height) {
        Ladder ladder = initLadderStrategy();
        ladder.init(countOfPlayers, height);
        return ladder;
    }

    private Ladder initLadderStrategy() {
        return new Ladder(new RandomGenerateStrategy());
    }
}

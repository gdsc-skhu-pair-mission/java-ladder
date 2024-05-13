package controller;

import model.Ladder;
import model.Players;
import view.InputView;
import view.ResultView;

public class LadderGameController {

    public void run() {
        Players players = initPlayer();
        int playerCount = players.getPlayerCount();
        int height = InputView.getLadderHeight();
        Ladder ladder = initLadder(playerCount, height);
        ResultView.printLadder(ladder.getLines(), players.getPlayerNames());
    }

    private Players initPlayer() {
        return new Players(InputView.getPlayerNames());
    }

    private Ladder initLadder(int playerCount, int height) {
        return new Ladder(playerCount, height);
    }

}

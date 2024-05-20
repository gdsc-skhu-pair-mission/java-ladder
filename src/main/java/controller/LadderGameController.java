package controller;

import model.Height;
import model.Ladder;
import model.Lines;
import model.Player;
import model.Players;
import util.RandomFootholdGenerator;
import view.InputView;
import view.OutputView;

import java.io.IOException;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class LadderGameController {
    private final InputView inputView;
    private final OutputView outputView;

    public LadderGameController() {
        this.inputView = new InputView();
        this.outputView = new OutputView();
    }

    public void run() throws IOException {
        Players players = createPlayersFromInput();
        List<String> playerNames = extractPlayerNames(players);
        Height height = createHeightFromInput();
        Lines ladderLines = createLadder(height, players);

        List<List<Boolean>> linesStructure = ladderLines.toBooleanList();
        outputView.printResultSentence(linesStructure, playerNames);
    }

    private Players createPlayersFromInput() throws IOException {
        String[] playerNamesArray = inputView.readPlayerNames();

        return new Players(Arrays.asList(playerNamesArray));
    }

    private List<String> extractPlayerNames(Players players) {
        return players.getPlayers().stream()
                .map(Player::getName)
                .collect(Collectors.toList());
    }

    private Height createHeightFromInput() throws IOException {
        return new Height(inputView.readLadderHeightNumber());
    }

    private Lines createLadder(Height height, Players players) {
        Ladder ladder = new Ladder();

        return ladder.generateLadder(height, players.findNumberOfPlayers() - 1);
    }
}

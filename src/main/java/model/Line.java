package model;

import util.FootholdGenerator;

public class Line {
    private final StringBuilder line;
    private static final int LAST_PLAYER_OFFSET = 1;
    private static final String BLANK = LadderSymbol.BLANK.getSymbol();
    private static final String BAR = LadderSymbol.BAR.getSymbol();
    private static final String FOOTHOLD = LadderSymbol.FOOTHOLD.getSymbol();
    private final FootholdGenerator footholdGenerator;

    public Line(FootholdGenerator footholdGenerator) {
        this.line = new StringBuilder();
        this.footholdGenerator = footholdGenerator;
    }

    public void makeLine(Players players) {
        initializeLine();

        boolean previousWasFoothold = false;
        int numOfPlayers = players.getPlayerCount();

        for (int i = 0; i < numOfPlayers; i++) {
            currentLadderLine(BAR);
            previousWasFoothold = AppendFootholdIfNotLastPlayer(i, numOfPlayers, previousWasFoothold);
        }
    }

    private boolean AppendFootholdIfNotLastPlayer(int currentPlayerIndex, int totalPlayers, boolean previousWasFoothold) {
        if (isNotLastPlayer(currentPlayerIndex, totalPlayers)) {
            return appendFoothold(previousWasFoothold);
        }

        return previousWasFoothold;
    }

    public StringBuilder getLine() {
        return line;
    }

    private void initializeLine() {
        line.delete(0, line.length());

        currentLadderLine(BLANK);
    }

    private boolean isNotLastPlayer(int currentIndex, int totalPlayers) {
        return currentIndex < totalPlayers - LAST_PLAYER_OFFSET;
    }

    private boolean appendFoothold(boolean hasPreviousFoothold) {
        boolean isFootholdAppended = false;

        if (canAppendFoothold(hasPreviousFoothold)) {
            currentLadderLine(FOOTHOLD);
            isFootholdAppended = true;
        }

       currentLadderLine(BLANK);

        return isFootholdAppended;
    }

    private boolean canAppendFoothold(boolean hasPreviousFoothold) {
        return !hasPreviousFoothold && footholdGenerator.generate();
    }

    private void currentLadderLine(String ladderSymbol) {
        line.append(ladderSymbol);
    }

}
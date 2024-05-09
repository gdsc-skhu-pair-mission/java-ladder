package model;

import util.RandomFootholdGenerator;

public class Line {
    private final StringBuilder line;
    private static final int LAST_PLAYER_OFFSET = 1;
    private static final String BLANK = LadderSymbol.BLANK.getSymbol();
    private static final String BAR = LadderSymbol.BAR.getSymbol();
    private static final String FOOTHOLD = LadderSymbol.FOOTHOLD.getSymbol();

    public Line() {
        this.line = new StringBuilder();
    }

    public void makeLine(Players players) {
        initializeLine();

        boolean previousWasFoothold = false;
        int numOfPlayers = players.findNumberOfPlayers();

        for (int i = 0; i < numOfPlayers; i++) {
            currentLadderLine(BAR);
            previousWasFoothold = tryAppendFootholdIfNotLastPlayer(i, numOfPlayers, previousWasFoothold);
        }
    }

    private boolean tryAppendFootholdIfNotLastPlayer(int currentPlayerIndex, int totalPlayers, boolean previousWasFoothold) {
        if (isNotLastPlayer(currentPlayerIndex, totalPlayers)) {
            return tryAppendFootholdReturningSuccess(previousWasFoothold);
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

    private boolean tryAppendFootholdReturningSuccess(boolean hasPreviousFoothold) {
        if (!hasPreviousFoothold && RandomFootholdGenerator.generate()) {
            currentLadderLine(FOOTHOLD);

            return true;
        }

       currentLadderLine(BLANK);

        return false;
    }

    private void currentLadderLine(String ladderSymbol) {
        line.append(ladderSymbol);
    }

}
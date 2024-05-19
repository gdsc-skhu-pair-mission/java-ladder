package model;

import util.RandomFootholdGenerator;

public class Ladder {
    private Line line;

    public Ladder() {
        this.line = new Line(new RandomFootholdGenerator());
    }

    public String generateLadder(Height height, Players players) {
        StringBuilder localLines = new StringBuilder();
        for (int i = 0; i < Integer.parseInt(height.getHeight()); i++) {
            line.makeLine(players);
            localLines.append(line.getLine()).append("\n");
        }

        return localLines.toString();
    }
}

package model;

import util.RandomFootholdGenerator;

public class Ladder {
    private final StringBuilder lines;
    private Line line;

    public Ladder() {
        this.lines = new StringBuilder();
        this.line = new Line(new RandomFootholdGenerator());
    }

    public void makeLines(Height height, Players players) {
        for (int i = 0; i < Integer.parseInt(height.getHeight()); i++) {
            line.makeLine(players);
            lines.append(line.getLine()).append("\n");
        }
    }

    public StringBuilder getLines() {
        return lines;
    }
}
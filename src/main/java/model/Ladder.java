package model;

import util.RandomFootholdGenerator;

public class Ladder {
    private Lines lines;

    public Ladder() {
        this.lines = new Lines();
    }

    public Lines generateLadder(Height height, int size) {
        for (int i = 0; i < Integer.parseInt(height.getHeight()); i++) {
            Line line = new Line(new RandomFootholdGenerator(), size);
            line.makeLine();
            lines.addLine(line);
        }

        return lines;
    }
}

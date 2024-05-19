package model;

import util.FootholdGenerator;

public class Line {

    private static final int INITIAL_INDEX = 0;
    private static final int STEP_SIZE = 2;

    private final boolean[] line;
    private final FootholdGenerator footholdGenerator;

    public Line(FootholdGenerator footholdGenerator, int size) {
        this.line = new boolean[size];
        this.footholdGenerator = footholdGenerator;
    }

    public void makeLine() {
        for (int i = INITIAL_INDEX; i < line.length; i++) {
            if (tryToPlaceFootholdAt(i)) return;
        }
    }

    private boolean tryToPlaceFootholdAt(int index) {
        if (!line[index] && footholdGenerator.generate()) {
            line[index] = true;
            return true;
        }
        return false;
    }

    public boolean[] getLine() {
        return line;
    }

}
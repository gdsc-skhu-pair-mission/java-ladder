package model;

import java.util.ArrayList;
import java.util.List;
import util.LineGenerator;

public class Ladder {

    private final List<Line> lines;

    public Ladder(int numberOfPlayers, int height) {
        lines = new ArrayList<>();
        for (int i = 0; i < height; i++) {
            lines.add(LineGenerator.generateLine(numberOfPlayers));
        }
    }

    public List<Line> getLines() {
        return lines;
    }

}
